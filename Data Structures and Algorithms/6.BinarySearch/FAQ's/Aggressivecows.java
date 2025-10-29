import java.util.*;
public class Aggressivecows {
    private boolean canweplace(int[] nums,int dist,int cows){
        int n = nums.length;
        int count = 1;
        int last = nums[0];

        for(int i = 1 ;i < n ; i++){
            if(nums[i]-nums[last] >= dist){
                count++;
                last = nums[i];
            }
            if(count >= cows) return true;
        }
        return false;
    }
    public int aggressivecows(int[] nums,int k){
        int n = nums.length;
        Arrays.sort(nums);
        int low = 1;
        int high = nums[n-1] - nums[0];
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canweplace(nums,mid,k)==true){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Aggressivecows obj = new Aggressivecows();
        int[] nums = {1,2,8,4,9};
        int k = 3;
        int result = obj.aggressivecows(nums, k);
        System.out.println(result);
    }
}
