public class Lowerbound {
    public int lower(int[] nums,int target){
        int left = 0 ; 
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Lowerbound lb = new Lowerbound();
        int[] nums = {1, 2, 4, 4, 5, 6};
        int target = 4;
        int result = lb.lower(nums, target);
        System.out.println("Lower bound of " + target + " is at index: " + result);
    }
}
