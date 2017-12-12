import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import utils.*;

public class FileTest {
    public static void main(String[] args) throws Exception {

        String test = "1345";
        String test2 = "6789";
        int int1 = Integer.parseInt(test);
        int int2 = Integer.parseInt(test2);

        out(int1 + int2);




		  File fn = new File("LoremIpsum.txt");
		  System.out.println("Records: " + FileUtils.countRecords(fn));
        Scanner fin = new Scanner(fn);
        int counter = 0;
        while (fin.hasNextLine()) {
            fin.nextLine();
            counter++;
        }
        // out(counter);
        String[] lorem = new String[counter];
        fin.close();
        fin = new Scanner(fn);
        for (int ix = 0; ix < lorem.length; ix++) {
            lorem[ix] = fin.nextLine();

        }
        // ArrayExtras.printLnArray(lorem);
        for (int ix = 0; ix < lorem.length; ix++) {
            System.out.println(countWords(lorem[ix]));
        }
       
    }

   private static int countWords(String line) {
   	Scanner sin = new Scanner(line);
      int cntr = 0;
      while (sin.hasNext()) {
        	sin.next();
        	cntr++;
		}
		sin.close();
      return cntr;
	}

    


    public static void printFile(File file) throws Exception{
        if (file.exists() && file.canRead()) {
            Scanner fin = new Scanner(file);    // "fin" stands for "file-in";

            while (fin.hasNext()) {
                String st = fin.nextLine();
                out(st);
            }
            fin.close();
        } else {
            System.out.println("File doesn't exist, or is not readable");
        }
    }

    public static void out(String in) {
        System.out.println(in);
    }
    public static void out(boolean in) {
        System.out.println(in);
    }
    public static void out(int in) {
        System.out.println(in);
    }
    public static void out(double in) {
        System.out.println(in);
    }
}