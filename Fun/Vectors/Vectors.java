
import java.util.Scanner;

public class Vectors {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      
      // Collect Vector 1 info
      System.out.println("Vector 1 magnitude?");
      double magOne = kb.nextDouble();
      System.out.println("Vector 1 angle?");
      double angleOne = kb.nextDouble() * (Math.PI / 180); //convert from degrees to radians
      //Calculate vector 1 components
      double vectOneX = magOne * Math.cos(angleOne);
      double vectOneY = magOne * Math.sin(angleOne);
      System.out.println("Vector One x: "
                         + vectOneX
                         + ", Vector One y: "
                         + vectOneY);
      
      // COllect Vector 2 info
      System.out.println("Vector 2 magnitude?");
      double magTwo = kb.nextDouble();
      System.out.println("Vector 2 angle?");
      double angleTwo = kb.nextDouble() * (Math.PI / 180); //convert from degrees to radians
      //Calculate vector 2 components
      double vectTwoX = magTwo * Math.cos(angleTwo);
      double vectTwoY = magTwo * Math.sin(angleTwo);
      
      System.out.println("-------------------"); // Provide Clarity
      //Calculate Resultant Vector Components and dir/mag
      double vectThreeX = vectOneX + vectTwoX;
      double vectThreeY = vectOneY + vectTwoY;
      double angleThree = Math.atan2(vectThreeY, vectThreeX) * (180 / Math.PI); //convert from radians to degrees for output
      double magThree = Math.sqrt(Math.pow(vectThreeY,2) + Math.pow(vectThreeX,2));
      // double angleThree = Math.atan(vectThreeY/vectThreeX);
      
      System.out.println("Result Vector magnitude: "
                         + magThree
                         + ". Result Vector Angle: "
                         + angleThree
                         + "°");

      System.out.println("-------------------");
      
      System.out.println("Again (1-yes or 0-no)");
      int reRun = kb.nextInt();
      if (reRun == 1) {
         System.out.println("");
         System.out.println("");
         main(null);
      }
      
      
      
   }
}