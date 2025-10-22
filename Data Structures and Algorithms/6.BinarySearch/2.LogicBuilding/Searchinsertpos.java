public class Searchinsertpos {
    public int search(int[] nums,int target){
        int ans = nums.length;
        int left  = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + ( right - left ) / 2;
            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Searchinsertpos sip = new Searchinsertpos();
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = sip.search(nums,target);
        System.out.println("The insert position of " + target + " is: " + result);
    }
}
