public class Print1toN {
    public static void main(String[] args) {
        int n = 20;
        print1toN(n);
    }

    public static int print1toN(int n){
        if(n==1){
            System.out.println(1);
            return 1;
        } else {
            print1toN(n-1);
            System.out.println(n);
            return n;   
        }
    }
}
