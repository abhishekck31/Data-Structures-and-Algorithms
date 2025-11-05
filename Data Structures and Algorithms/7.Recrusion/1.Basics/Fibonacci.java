public class Fibonacci {
    public int fibo(int n){
        if(n<=1){
            return n;
        } else {
            return fibo(n-2)+fibo(n-1);
        }
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 6;
        System.out.println("Fibonacci of "+n+" is: "+fibonacci.fibo(n));
    }
}
