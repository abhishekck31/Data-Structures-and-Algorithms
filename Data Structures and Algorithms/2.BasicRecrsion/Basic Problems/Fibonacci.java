public class Fibonacci {
    public static void main(String[] args){
        int n = 7;
        int fib = fibonacciRecursive(n);
        System.out.println("Fibonacci of " + n + " is: " + fib);
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
