// This program was created by Luke Mattfeld
// for CSCD210 at Eastern Washington University


import java.util.Scanner;                       // Import Scanner class for keyboard input

public class MetricConversion {
   public static void main(String[] args) {
      //Define Variables (doubles used for accuracy, both in and out)
      String name;
      double heightInch;
      double weightPound;
      double heightMeter;
      double weightKilo;
      
      Scanner kb = new Scanner(System.in);      // Creates a new scanner object "kb" to gather keyboard input
                                           
      // Get information from user                                     
      System.out.print("Enter name: ");
      name = kb.nextLine();
      System.out.print("Enter height in inches: ");
      heightInch = kb.nextDouble();
      System.out.print("Enter weight in pounds: ");
      weightPound = kb.nextDouble();
      
      //Convert from Imperial to Metric
      heightMeter = heightInch * 0.0254;        // 1 in. = 0.0253 m.
      weightKilo = weightPound * 0.45359237;    // 1 lb = 0.45359237 kg
      
      // Output converted data to user
      System.out.println();                     // Provide clear space between
      System.out.println();                     //input and output.
      System.out.println("Name: " + name);
      System.out.println("Height: " 
                         + heightMeter
                         + " Meters");
      System.out.println("Weight: " 
                         + weightKilo
                         + " Kilograms");   
    kb.close();                                 // Closed kb object to prefent resouce leak.
   }
    
}