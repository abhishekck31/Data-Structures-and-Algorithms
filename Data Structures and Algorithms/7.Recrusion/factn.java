public class factn {
    public int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args){
        factn obj = new factn();
        int result = obj.factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
