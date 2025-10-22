public class Findmini {
    public int find(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int mini = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(nums[left] <= nums[mid]){
                mini = Math.min(mini,nums[left]);
                left = mid + 1;
            }else{
                mini = Math.min(mini,nums[mid]);
                right = mid - 1;
            }
        }
        return mini;
    }
    public static void main(String[] args){
        Findmini obj = new Findmini();
        int[] nums = {4,5,6,7,1,2};
        int result = obj.find(nums);
        System.out.println("Minimum element in the rotated sorted array is: " + result);
    }
}
