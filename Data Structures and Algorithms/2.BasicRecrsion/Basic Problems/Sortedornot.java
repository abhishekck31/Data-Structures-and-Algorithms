public class Sortedornot {
    public static void main(String[] args){
        int arr[] = {1,4,5,7,3,7};
        boolean isSorted = checkSorted(arr,0);
        System.out.println("Is the array sorted? " + isSorted);
    }
    public static boolean checkSorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return checkSorted(arr, index+1);
    }
}
