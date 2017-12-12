import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String ent;
        Scanner kb = new Scanner(System.in);

        if (args.length > 0) {
            System.out.println(parseMath(args[0]));
        }
        do {
            System.out.print("Enter: ");
            ent = kb.nextLine();
            System.out.println(parseMath(ent));
        }   while (!(ent.equals("exit")));
        


    }

    private static String parseMath(String input) {

        input = input.replace(" ", "");
        // System.out.println(input);

        while (input.contains("(")) {
            String paren = input.substring(input.indexOf("(")+1, input.lastIndexOf(")"));
            
            input = input.substring(0, input.indexOf("(")) + parseMath(paren) + input.substring(input.lastIndexOf(")") + 1);
        }

        while (input.contains("*") || input.contains("/")) {
            int div = input.indexOf("/");
            int tims = input.indexOf("*");
            if (tims == -1) {
                tims = div + 1;
            }
            if (div == -1) {
                div = tims + 1;
            }
            int i = 0;
            int iS = 0;
            int iE = 1;
            String a = "";
            String b = "";
            double av;
            double bv;
            double comb;

        
            if (tims < div) {
                double mult;
                i = tims - 1;
                while (i >= 0 && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' )) {
                    a += input.charAt(i);
                    iS = i;
                    i--;
                }
                a = input.substring(iS, tims);
                i = tims + 1;

                while (i <= (input.length() - 1) && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' ) )  {
                    b += input.charAt(i);
                    iE = i;
                    i++;
                }
                av = Double.parseDouble(a);
                bv = Double.parseDouble(b);
                mult = av * bv;
                input = input.substring(0, iS) + mult + input.substring(iE+1);
                
                // System.out.println(input);
                // return input;
                
            } else {
                double divsn;
                i = div - 1;
                while (i >= 0 && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' )) {
                    a += input.charAt(i);
                    iS = i;
                    i--;
                }
                a = input.substring(iS, div);
                i = div + 1;
                while (i <= (input.length() - 1) && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' ) )  {
                    b += input.charAt(i);
                    iE = i;
                    i++;
                }

                av = Double.parseDouble(a);
                bv = Double.parseDouble(b);

                divsn = av / bv;
                // System.out.println("iS: " + iS + ", iE: " + iE);
                // System.out.println("divsn: " + divsn);
                input = input.substring(0, iS) + divsn + input.substring(iE+1);
                
                // System.out.println(input);
                // return input;
            }
            // System.out.println(input);
        }

        while (input.contains("+") || (input.contains("-") && input.indexOf("-") != 0)) {
            int minus = input.indexOf("-");
            int plus = input.indexOf("+");
            if (plus == -1) {
                plus = minus + 1;
            }
            if (minus == -1) {
                minus = plus + 1;
            }
            int i = 0;
            int iS = 0;
            int iE = 1;
            String a = "";
            String b = "";
            double av;
            double bv;
            double comb;


        
            if (plus < minus) {
                double sum;
                i = plus - 1;
                while (i >= 0 && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' )) {
                    a += input.charAt(i);
                    iS = i;
                    i--;
                }
                a = input.substring(iS, plus);
                i = plus + 1;
                while (i <= (input.length() - 1) && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' ) )  {
                    b += input.charAt(i);
                    iE = i;
                    i++;
                }

                av = Double.parseDouble(a);
                bv = Double.parseDouble(b);

                sum = av + bv;
                // System.out.println("sum: " + sum);
                input = input.substring(0, iS) + sum + input.substring(iE+1);
                
                // System.out.println(input);
                // return input;
                
            } else {
                double subt;
                i = minus - 1;
                while (i >= 0 && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' )) {
                    iS = i;
                    i--;
                }
                a = input.substring(iS, minus);

                i = minus + 1;
                while (i <= (input.length() - 1) && (Character.isDigit(input.charAt(i)) ||  input.charAt(i) == '.' ) )  {
                    b += input.charAt(i);
                    iE = i;
                    i++;
                }

                av = Double.parseDouble(a);
                bv = Double.parseDouble(b);

                // System.out.println("av: " + av + " bv: " + bv);
                subt = av - bv;
                // System.out.println("iS: " + iS + ", iE: " + iE);
                // System.out.println("subt: " + subt);
                input = input.substring(0, iS) + subt + input.substring(iE+1);
                
                // System.out.println(input);
                // return input;
            }
            // System.out.println(input);
        }
        
        return input;
    }

}