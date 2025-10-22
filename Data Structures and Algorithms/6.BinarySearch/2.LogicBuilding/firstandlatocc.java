public class firstandlatocc {
    public int firstocc(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        int first = -1;
        while( left <= right){
            int mid = left + ( right - left) / 2;
            if(nums[mid]==target){
                first = mid;
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return first;
    }
    public int lastocc(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        int last = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                last = mid;
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args){
        firstandlatocc obj = new firstandlatocc();
        int[] nums = {2,4,6,8,2,3,2,5,2};
        int target = 2;
        int first = obj.firstocc(nums,target);
        int last = obj.lastocc (nums,target);
        System.out.println("First and Last Occurrence of " + target + " are: " + first + " and " + last);
    }
}
