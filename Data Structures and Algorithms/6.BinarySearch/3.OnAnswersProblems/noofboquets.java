public class noofboquets {
    public boolean possible(int[] nums,int day,int m ,int k){
        int n = nums.length;
        int count =0;
        int noofboq = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] <= day){
                count++;
            }else{
                noofboq += (count / k );
                count = 0;
            }
        }
        noofboq += (count / k );
        return noofboq >= m;
    }
    public int noofboquets(int[] nums,int m , int k){
        int n = nums.length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            low = Math.min(low,nums[i]);
            high = Math.max(high,nums[i]);
        }

        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(possible(nums,mid,m,k)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        noofboquets obj = new noofboquets();
        int result = obj.noofboquets(nums, m, k);
        System.out.println(result);
    }
}
