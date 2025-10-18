import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        int[] reversedarr = reverseArray(arr,0,arr.length-1);
        System.out.println("Reversed array: " + Arrays.toString(reversedarr));
    }
    private static int[] reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArray(arr, start + 1, end - 1);
    }
}