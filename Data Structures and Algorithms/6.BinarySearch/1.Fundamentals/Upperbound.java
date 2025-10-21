public class Upperbound {
    public int upper(int[] nums , int target){
        int ans = nums.length;
        int left  = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) /2;
            if(nums[mid] <= target){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Upperbound ub = new Upperbound();
        int[] nums = {1,2,2,2,3,4,5};
        int target = 2;
        int result = ub.upper(nums,target);
        System.out.println("The upper bound index of " + target + " is: " + result);
    }
}
