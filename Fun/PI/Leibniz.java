public class Leibniz {
    public static void main(String[] args) {
        int sign = -1;
        double total = 1;
        double PI;
        for (int i = 3; i <= 100000000; i += 2) {
            total += (sign * 1.0/i);
            sign *= -1;
        }
        PI = total * 4;

        System.out.println(PI);
    }

}