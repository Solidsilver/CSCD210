public class methodTest {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 1;
        int num3 = 5;

        System.out.println(max(num1, num2, num3));

        double dnum1 = 4.3;
        double dnum2 = 8.1;
        double dnum3 = 3.7;

        System.out.println(max(dnum1, dnum2, dnum3));

        int num4 = 9;
        double dnum4 = 12.55;

        System.out.println(max(num1, num2, num3, num4));
        System.out.println(max(dnum1, dnum2, dnum3, dnum4));
    }


    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    private static double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }

    private static int max(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    private static double max(double a, double b, double c, double d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}