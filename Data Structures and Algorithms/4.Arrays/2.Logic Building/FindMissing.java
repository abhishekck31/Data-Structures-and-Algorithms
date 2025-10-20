public class FindMissing {
    public int missing(int arr[]){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int flag = 0;
            for(int j = 0 ; j < n ; j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {0,1,2,4,5};
        FindMissing obj = new FindMissing();
        int missingNumber = obj.missing(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}
