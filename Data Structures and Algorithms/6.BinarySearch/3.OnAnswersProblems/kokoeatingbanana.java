public class kokoeatingbanana {
    private int findmax(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int pile : piles){
            max = Math.max(max,pile);
        }
        return max;
    }
    private int totalHours(int[] piles,int hourly){
        int hours = 0;
        for(int pile : piles){
            hours += Math.ceil((double)pile/(double)hourly);
        }
        return hours;
    }
    public int kokoeating(int[] piles,int h){
        int low = 1;
        int high = findmax(piles);
        while( low <= high){
            int mid = low + (high - low) / 2;
            long hours = totalHours(piles, mid);

            if(hours <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        kokoeatingbanana k = new kokoeatingbanana();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(k.kokoeating(piles, h));  // Output: 4
    }
}
