public class Countroated {
    public int count(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // index of minimum element = number of rotations
    }

    public static void main(String[] args){
        Countroated obj = new Countroated();
        int[] nums = {4,5,6,7,1,2};
        int result = obj.count(nums);
        System.out.println("The array is rotated " + result + " times.");
    }
}
