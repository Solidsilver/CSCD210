import java.util.Scanner;

public class SelectionTest {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int valOne;
        int valTwo;
        int valThree;
        
        System.out.print("Enter first value: ");
        valOne = kb.nextInt();
        System.out.print("Enter second value: ");
        valTwo = kb.nextInt();
        System.out.print("Enter third value: ");
        valThree = kb.nextInt();
        
        
        int small = Math.min(Math.min(valOne, valTwo), valThree);
        System.out.println(small + " Is the smallest");
        
        
        
        
        /*if (valOne < valTwo && valOne < valThree) {
            System.out.println(valOne + " Is less than " + valTwo + " and " + valThree );
        } else if (valTwo < valOne && valTwo < valThree) {
            System.out.println(valTwo + " Is less than " + valOne + " and " + valThree );
        } else if (valThree < valOne && valThree < valTwo) {
            System.out.println(valThree + " Is less than " + valTwo + " and " + valOne );
        } else if (valOne == valTwo && valOne < valThree) {
            System.out.println(valOne + " Is equal to " + valTwo + " and less than " + valThree );
        } else if (valOne == valThree && valOne < valTwo) {
            System.out.println(valOne + " Is equal to " + valThree + " and less than " + valTwo );
        } else if (valThree == valTwo && valTwo < valOne) {
            System.out.println(valThree + " Is equal to " + valTwo + " and less than " + valOne );
        } else {
            System.out.println("They are all equal to " + valOne);
        }*/
        
    }

}