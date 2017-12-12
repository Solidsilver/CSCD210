public class SelfDivisor
{

   /** @param number the number to be tested
    *         Precondition: number > 0
    *  @return true if every decimal digit of
    *          number is a divisor of number;
    *          false otherwise
    */
   public static boolean isSelfDivisor(int number)
   {
       int test = number;
       while (test > 0) {
           if (!(test % 10 == 0) && (number % (test % 10) == 0)) {
               test = test / 10;
           } else {
               return false;
           }
               
           
       }
       return true;
     // part A
   }

   /****************/

   public static void main (String[] args)
   {
     System.out.println("128: " + isSelfDivisor(128));
     System.out.println("26: " + isSelfDivisor(26));
     System.out.println("120: " + isSelfDivisor(120));
     System.out.println("102: " + isSelfDivisor(102));
   }
 }

