import java.math.BigDecimal;
public class Fibonacci {
    public static void main(String[] args) {
        BigDecimal iH = new BigDecimal("0");
        BigDecimal iJ = new BigDecimal("1");
        int toN;
        if (args.length > 0) {
            toN = Integer.parseInt(args[0]);
        } else {
            toN = 10;
        }
        for (long i = 1; i <= toN; i ++) {
            System.out.print(iJ + ", ");
            iJ = iJ.add(iH);
            iH = iJ.subtract(iH);
        }

        System.out.println();         
    }

}

