public class Gregory {
    public static void main(String[] args) {
        double total;
        double accuracy;
        double times = 1000000000;
        total = 1;
            for (double i = 2; i <= times; i += 2) {
                total *= i / (i-1.0) * i / (i+1.0);
                //System.out.print(total * 2 + ", ");

            }
            total *= 2;
            System.out.println(total);
            accuracy = Math.abs(total - Math.PI);
            System.out.println("Accurate to " + accuracy);
            times *= 10;
    }

}