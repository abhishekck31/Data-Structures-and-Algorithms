public class SumoffirstN {
   public static void main(String[] args) {
       int n = 5;
       int sum = sumOfFirstN(n);
       System.out.println("Sum of first " + n + " numbers is: " + sum);
   }

   public static int sumOfFirstN(int n) {
       if (n == 1) {
           return 1;
       } else {
           return n + sumOfFirstN(n - 1);
       }
   }
}
