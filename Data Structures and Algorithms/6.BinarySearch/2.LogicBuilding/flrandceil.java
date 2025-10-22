public class flrandceil {
    public int[] flrceil(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        int floor = -1;
        int ceil = -1;
        while( left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                floor = nums[mid];
                ceil = nums[mid];
                break;
            } else if(nums[mid] < target){
                floor = nums[mid];
                left = mid + 1;
            } else {
                ceil = nums[mid];
                right = mid - 1;
            }
        }
        return new int[] { floor, ceil };
    }
    public static void main(String[] args){
        flrandceil obj = new flrandceil();
        int[] nums = {1,2,4,6,8,10};
        int target = 5;
        int[] result = obj.flrceil (nums,target);
        System.out.println("Floor and Ceil of " + target + " are: " + result[0] + " and " + result[1]);
    } 
}
