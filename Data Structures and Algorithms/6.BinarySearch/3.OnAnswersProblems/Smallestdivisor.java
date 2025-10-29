public class Smallestdivisor {
    private int sumByd(int[] nums,int limit){
        int n = nums.length;
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            sum += Math.ceil((double)nums[i]/(double)limit);
        }
        return sum;
    }
    public int smallestdiv(int[] nums,int threshold){
        int n = nums.length;
        if(n>threshold){
            return -1;
        }
        int maxi = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            maxi = Math.max(maxi,nums[i]);
        }
        int low = 1 , high = maxi;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int sum = sumByd(nums,mid);

            if(sum <= threshold){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        Smallestdivisor obj = new Smallestdivisor();
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        int result = obj.smallestdiv(nums, threshold);
        System.out.println(result);  // Output: 5
    }
}
