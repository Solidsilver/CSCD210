import java.util.Scanner;

public class YearsToRetirement {
   public static void main(String[] args) {
      String name;
      int age;
      Scanner kb = new Scanner(System.in);
      
      System.out.print("What is your name: ");
      name = kb.nextLine();
      
      System.out.print("Input age: ");
      age = kb.nextInt();
      
      System.out.println();
      System.out.println(name
                         + " (age: "
                         + age
                         + ")");
                         
      int yearsToRetire = 65 - age;
      if (yearsToRetire > 0) {
         System.out.println("You should retire in "
                            + yearsToRetire
                            + " year(s).");
      }
      else {
         yearsToRetire = Math.abs(yearsToRetire);
         System.out.println("You should have retired "
                           + yearsToRetire
                           + " year(s) ago!");
      }
   }
}