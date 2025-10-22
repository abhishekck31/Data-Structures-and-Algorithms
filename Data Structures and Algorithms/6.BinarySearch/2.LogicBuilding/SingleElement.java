public class SingleElement {
    public int singleele(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + ( right - left) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1])
                || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        SingleElement obj = new SingleElement();
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int result = obj.singleele(nums);
        System.out.println("The single element in the array is: " + result);
    }
}
