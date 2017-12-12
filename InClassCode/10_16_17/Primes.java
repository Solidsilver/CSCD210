public class Primes {
    public static void main(String[] args) {

        if (args.length > 0) {
            int test = Integer.parseInt(args[0]);
            System.out.println(test + ": " + isPrime(test));
        } else {
            for (int i=1; i<=12; i++) {
                System.out.println(i + ": " + isPrime(i));
                
            }
        }
       
        
    }

    //  take positive int as an input, and return a boolean of wether or not the number is prime;
    // 

    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        for (int fact = 2; fact <= Math.sqrt(num); fact++) {
            if (num%fact == 0) {
                return false;
            }
        }


        return true;
    }
}