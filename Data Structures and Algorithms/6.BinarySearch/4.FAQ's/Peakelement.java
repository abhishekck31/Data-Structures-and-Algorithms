public class Peakelement {
    public int findPeak(int[] nums){
        if (nums == null || nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];
        if (nums[0] > nums[1]) return nums[0];
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums[nums.length - 1];
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] > nums[i+1] && nums[i] > nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Peakelement pe = new Peakelement();
        int[] nums = {1, 3, 20, 4, 1};
        System.out.println("Peak element is: " + pe.findPeak(nums));
    }
}
