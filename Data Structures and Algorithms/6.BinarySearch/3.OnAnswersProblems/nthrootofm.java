public class nthrootofm {
    private long pow(int b,int exp){
        long ans = 1;
        long base = b;

        while(exp > 0){
            if(exp % 2 == 1){
                exp--;
                ans *= base;
            }else{
                exp /= 2;
                base *= base;
            }
        }
        return ans;
    }
    public int Nthroot(int N,int M){
        for(int i = 1 ; i < M ; i++){
            long val = pow(i,N);

            if(val==M){
                return i;
            }else if(val > M){
                break;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        nthrootofm obj = new nthrootofm();
        System.out.println(obj.Nthroot(3, 27));  // Output: 3
        System.out.println(obj.Nthroot(2, 16));  // Output: 4
        System.out.println(obj.Nthroot(5, 32));  // Output: -1
    }
}
