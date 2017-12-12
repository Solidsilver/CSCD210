import java.util.Scanner;

public class Quadratic {
    public static void main(String [] args) {
        double a;
        double b;
        double c;
        double xPos;
        double xNeg;

        Scanner kb = new Scanner(System.in);

        System.out.print("a: ");
        a = kb.nextDouble();
        System.out.print("b: ");
        b = kb.nextDouble();
        System.out.print("c: ");
        c = kb.nextDouble();
        


        xPos = (b * -1 + Math.sqrt(b * b - 4 * a * c)) / 2* a;
        xNeg = (b * -1 - Math.sqrt(b * b - 4 * a * c)) / 2* a;
        System.out.println("x = (" + xPos + ", " + xNeg + ")");
        
    }
}