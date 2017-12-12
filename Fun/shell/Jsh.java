import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Jsh {

    public static void main(String[] args) {
        String input;
        String cmdPath;
        String command;
        String[] cmdArgs = null;
        File cCpath;

        String hostname = "Java-VM";
        String userName = System.getProperty("user.name");
        String[] globalPath = {"/usr/local/bin", "/usr/bin", "/bin", "/usr/sbin", "/sbin"};
        File workingDir = new File("/Users/" + userName);
        Scanner kb = new Scanner(System.in);

        do {
            System.out.print(userName + "@" + hostname + ": " + workingDir.getAbsolutePath() + "/ > ");
            input = kb.nextLine();
            cmdArgs = parseInput(input);
            command = cmdArgs[0];
            cmdPath = findPath(command, globalPath);

            if (command.equals("cd")) {
                workingDir = changeDir(cmdArgs[1], workingDir);
            } else {
                cmdArgs[0] = cmdPath + "/" + command;

                if (cmdPath.equals("none")) {
                    if (!input.equals("exit")) {
                        System.out.println("jsh: " + command + ": command not found");
                    }
                } else {
                    try {
                        run(cmdArgs, workingDir);
                    } catch (IOException | InterruptedException ex) {
                        System.out.println(ex);     //Prints out possible exceptions
                    }
                }  
            }
            

        } while (!input.equals("exit"));
        System.out.println("exit");
        
    }


    private static String[] parseInput(String input) {      // Parses shell input: finds command, and any arbitrary number of arguments
        String[] commandPlusArgs = null;
        int argNumber = 1;
        String evaluate = input;
        String prog;

        while (evaluate.indexOf(" ") > 0) {
            evaluate = evaluate.substring(evaluate.indexOf(" ")+1);
            argNumber++;
        }
        commandPlusArgs = new String[argNumber];

        if (input.indexOf(" ") < 0) {
            prog = input;
        } else {
            prog = input.substring(0, input.indexOf(" "));
        }

        commandPlusArgs[0] = prog;
        if (!(input.indexOf(" ") < 0)) {
            evaluate = input;
            for (int i = 1; i < argNumber; i++) {
                int j = evaluate.indexOf(" ");
                int k = evaluate.indexOf(" ", j+1);
                if (k > 0) {
                    commandPlusArgs[i] = evaluate.substring(j+1, k);
                    evaluate = evaluate.substring(k);
                } else {
                    commandPlusArgs[i] = evaluate.substring(j+1);
                }
            }
        }
        return commandPlusArgs;             // Returns the array commandPlusArgs starting with the prog, followed by any arguments
    }


    private static String findPath(String cmd, String[] path) {    // Finds which directory in PATH the prog is located. Returns "none" if prog is not found.
        File chekcPath;
        String[] pathList;
        for (int i = 0; i < path.length; i++) {
            chekcPath = new File(path[i]);
            pathList = chekcPath.list();
            if (Arrays.asList(pathList).contains(cmd)) {
                return path[i];
            }

        }
        return "none";
    }

    private static String expand(String input, String expChar, String path, String parent) {
        String exp = input;
        int charPos = 0;

        if (expChar.equals(".")) {
            charPos = exp.indexOf(".");
            
            if (charPos == 0) {
                if (exp.indexOf(".", charPos + 1) == 1) {
                    exp = exp.substring(0,charPos) + parent + exp.substring(charPos + 2);
                }  else {
                    exp = exp.substring(0,charPos) + path + exp.substring(charPos + 1);
                }
            }
        } else {
            while (charPos > -1 && (exp.indexOf("/") == charPos + 1 || exp.indexOf("/") == charPos + 2)) {
                if (exp.indexOf(".", charPos + 1) > -1) {
                    exp = exp.substring(0,charPos) + parent + exp.substring(charPos + 2);
                }  else {
                    exp = exp.substring(0,charPos) + path + exp.substring(charPos + 1);
                }
            }
        }

        return exp;
    }


    private static String expand(String input, String expChar) {
        String exp = input;
        int charPos = 0;

        if (expChar.equals("~")) {
            String homeDir = "/Users/" + System.getProperty("user.name");
            charPos = input.indexOf("~");
            exp = input.substring(0, charPos) + homeDir + input.substring(charPos + 1);
        }

        return exp;
    }


    private static File changeDir(String toDir, File currentDir) {
        File changeDir;
        String cPath = currentDir.getAbsolutePath();
        String cParent = currentDir.getParent();

        if (toDir.indexOf("~") > -1) {
            toDir = expand(toDir, "~");
        }
        if (toDir.indexOf(".") > -1) {
            toDir = expand(toDir, ".", cPath, cParent);
        }
        
        if (toDir.indexOf("/") != 0) {
            changeDir = new File(cPath + "/" + toDir);
        } else {
            changeDir = new File(toDir);
        }

        if (changeDir.exists()) {
            if (changeDir.isDirectory()) {
                return changeDir;
            } else if (changeDir.isFile()) {
                System.out.println("cd: not a directory: " + changeDir.getAbsolutePath());
                return currentDir;
            }
                
        } else {
            System.out.println("jsh: cd: " + toDir + ": No such file or directory");
            return currentDir;
        }
        return currentDir;
    }


    private static void run(String[] comAndArg, File runDir) throws IOException, InterruptedException {        
        ProcessBuilder buildProc = new ProcessBuilder(comAndArg);

        //From the DOC:  Initially, this property is false, meaning that the 
        //standard output and error output of a subprocess are sent to two 
        //separate streams
        buildProc.redirectErrorStream(true);        // Make sure stdError is printed!
        buildProc.directory(runDir);

        Process proc = buildProc.start();
        BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line;

        line = in.readLine();       // Collects and prints any lines from stdOut or stdError from program
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        proc.waitFor();      
        in.close();                 // Closes BufferedReader, since it is created every time a program is run.   
    }

}