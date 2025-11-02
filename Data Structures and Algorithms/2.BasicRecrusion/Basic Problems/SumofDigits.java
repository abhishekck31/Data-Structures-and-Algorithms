public class SumofDigits {
    public static void main(String[] args){
        int n = 674;
        int sum = SumofDigitsRecursive(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);
    }
    public static int SumofDigitsRecursive(int n){
        if(n==0){
            return 0;
        }else{
            return (n % 10) + SumofDigitsRecursive(n / 10);
        }
    }
}
