import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Jash {

    public static String input;
    public static String hostname = "Java-VM";
    public static String[] globalPath = {"/usr/local/bin", "/usr/bin", "/bin", "/usr/sbin", "/sbin"};
    public static String cmdPath;
    public static String command;
    public static String[] cmdsInPath = null;
    public static String[] cmdArgs = null;

    public static String userName = System.getProperty("user.name"); // System.getProperty("user.name") gets current user's username.
    public static Scanner kb = new Scanner(System.in);
    public static File workingDir = new File("/Users/" + userName);  // assumes macOS file system
    public static String workDir = workingDir.getAbsolutePath();
    public static File cCPath;


    public static void main(String[] args) {
        new Jash();
    }


    public Jash() {

        do {
            //System.out.println(workDir);
            System.out.print(userName + "@" + hostname + ": " + workingDir.getAbsolutePath() + "/ > ");
            input = kb.nextLine();
            cmdArgs = parseInput(input);
            cmdPath = findPath(command);

            if (cmdPath.equals(globalPath[0])) {
                // Run command locally
                System.out.println(jashCommand(cmdArgs));
            } else {
                cmdArgs[0] = cmdPath + "/" + command;

                if (cmdPath.equals("none")) {
                    if (!input.equals("exit")) {
                        System.out.println("jash: " + command + ": command not found");
                    }
                } else {
                    try {
                        //int result = run(cmdArgs);
                        run(cmdArgs);
                    } catch (IOException | InterruptedException ex) {
                        System.out.println(ex);     //Prints out possible exceptions
                    }
                }  
            }
            

        } while (!input.equals("exit"));
        System.out.println("exit");
    }


    public static String jashCommand(String[] command) {
        String out = "boom";
        if (command[0].equals("cd")) {
            out = changeDir(command[1]);
        
        }
        return out;
    }


    public static String changeDir(String arg) {
        String out = "";
        File changeDir;

        // out = command[1] + command[1].indexOf("/");
        while (arg.indexOf("") > -1) {
            if (arg.indexOf("", arg.indexOf(".") + 1) > -1) {
                arg = arg.substring(0,arg.indexOf("")) + workingDir.getParent() + arg.substring(arg.indexOf("") + 2);
            }  else {
                arg = arg.substring(0,arg.indexOf("")) + workingDir.getAbsolutePath() + arg.substring(arg.indexOf("") + 1);
            }
        }
        
        if (arg.indexOf("/") != 0) {
            changeDir = new File(workingDir.getAbsolutePath() + "/" + arg);
        } else {
            changeDir = new File(arg);
        }

        if (changeDir.exists()) {
            if (changeDir.isDirectory()) {
                workingDir = changeDir;
                out = "";
            } else if (changeDir.isFile()) {
                out = "cd: not a directory: " + changeDir.getAbsolutePath();
            }
                
        } else {
            out = "jash: cd: " + arg + ": No such file or directory";
        }

        return out;
    }


    public static String findPath(String cmd) {    // Finds which directory in PATH the command is located. Returns "none" if command is not found.

        for (int i = 0; i < globalPath.length; i++) {
            cCPath = new File(globalPath[i]);
            String[] pathList = cCPath.list();
            if (Arrays.asList(pathList).contains(cmd)) {
                return globalPath[i];
            }

        }
        return "none";
    }


    public static String[] parseInput(String input) {      // Parses shell input: finds command, and any arbitrary number of arguments
        String[] commandPlusArgs = null;
        int argNumber = 1;
        String evaluate = input;

        while (evaluate.indexOf(" ") > 0) {
            evaluate = evaluate.substring(evaluate.indexOf(" ")+1);
            argNumber++;
        }
        commandPlusArgs = new String[argNumber];

        if (input.indexOf(" ") < 0) {
            command = input;
        } else {
            command = input.substring(0, input.indexOf(" "));
        }

        commandPlusArgs[0] = command;
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
        return commandPlusArgs;             // Returns the array commandPlusArgs starting with the command, followed by any arguments
    }


    public static void run(String[] comAndArg) throws IOException, InterruptedException {        
        ProcessBuilder buildProc = new ProcessBuilder(comAndArg);

        //From the DOC:  Initially, this property is false, meaning that the 
        //standard output and error output of a subprocess are sent to two 
        //separate streams
        buildProc.redirectErrorStream(true);        // Make sure stdError is printed!
        buildProc.directory(workingDir);

        Process proc = buildProc.start();
        BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line;


        line = in.readLine();       // Collects and prints any lines from stdOut or stdError from program
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        //System.out.println();
        proc.waitFor();      
        in.close();                 // Closes BufferedReader, since it is created every time a program is run.
        
    }

}


// Lol