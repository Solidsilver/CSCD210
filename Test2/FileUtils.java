import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FileUtils {
	
	
	public static String readFileToString(String fileName) throws Exception {
		File fn = new File(fileName);
		if (fn.exists() && fn.canRead()) {
			String str = "";
			Scanner fin = new Scanner(fn);
			while (fin.hasNextLine()) {
				str += fin.nextLine() + " ";
			}
			fin.close();
			return str;
			
		} else {
			throw new Exception("IllegalArgumentException: Cannot use file " + fileName);
		}
	}
	
	
	public static void writeStringToFile(String fileName, String contents) throws Exception {
		File fn = new File(fileName);
		if (!fn.exists() || fn.canWrite()) {
			PrintStream fout = new PrintStream(fn);
			fout.println(contents);
			fout.close();
		} else {
			throw new Exception("IllegalArgumentException: Cannot use file " + fileName);
		}
	}
	
	
	
	
}
