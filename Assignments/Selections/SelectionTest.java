import java.util.Scanner;

public class SelectionTest {
    public static void main(String[] args) {
String color = "green";
        switch (color) {
            
            case "red":
                System.out.println("Red");
                break;
            
            case "green":
                System.out.println("Green");
                break;

            case "blue":
                System.out.println("Blue");
                break;

            default:
                System.out.println("Not a color");
                break;
        }

    }
}