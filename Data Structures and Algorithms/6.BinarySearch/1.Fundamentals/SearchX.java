public class SearchX {
    public int search(int[] nums,int x){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(nums[mid] == x){
                return mid;
            }else if(nums[mid] < x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        SearchX searchX = new SearchX();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int result = searchX.search(nums, target);
        System.out.println("Element found at index: " + result);
    }
}
