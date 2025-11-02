public class factorial {
    public static void main(String[] args){
        int n = 5;
        int fact = factorialRecursive(n);
        System.out.println("Factorial of " + n + " is: " + fact);
    }
    public static int factorialRecursive(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorialRecursive(n-1);
        }
    }
}
