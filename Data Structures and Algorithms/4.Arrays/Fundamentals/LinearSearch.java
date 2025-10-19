public class LinearSearch {
    public int linearsearch(int[] arr,int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int target = 40;
        LinearSearch ls = new LinearSearch();
        int result = ls.linearsearch(arr,target);
        if(result==-1){
            System.out.println("Element not found in Arrays");
        }else{
            System.out.println("Element found at index: " + result);
        }

    }
}
