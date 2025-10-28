public class Sqrtofnum {
    public int squrt(int n){
        int ans = 0;

        for(int i = 1 ; i <= n ; i++){
            long val = (long)i * (long)i;
            if(val <= (long)n)
                ans = i;
            else{
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Sqrtofnum obj = new Sqrtofnum();
        System.out.println(obj.squrt(16));
    }
}
