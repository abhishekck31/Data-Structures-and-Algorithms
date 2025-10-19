import java.util.ArrayList;
import java.util.List;
public class MergeSort {
    public void merge(int[] arr,int low,int mid,int high){
        int left = 0;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while(left <=mid && right<= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = temp.get(i-low);
        }
    }
    public void mergehelper(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid = low + (high - low) / 2;
        mergehelper(arr, low, mid);
        mergehelper(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args){
        int[] arr = {38, 27, 43, 3, 91, 82, 10};
        MergeSort ms = new MergeSort();
        ms.mergehelper(arr, 0, arr.length - 1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
