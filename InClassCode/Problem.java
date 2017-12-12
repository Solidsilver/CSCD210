import java.util.Scanner;
public class Problem {
    public static void main(String[] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        int five = error(kb.nextInt()); // If the number entered is not 5, it will error. Try it! (you will get an exception error)

        System.out.println("hello");
    }

    private static int error(int i) throws Exception {
        if (i == 5) {
            return 5;
        } else {
            throw new Exception("Not Five!"); // Throws an exception: "java.lang.Execption: Not Five!"
        }
        
    }
}