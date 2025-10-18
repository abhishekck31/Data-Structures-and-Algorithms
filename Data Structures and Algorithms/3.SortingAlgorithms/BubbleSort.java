public class BubbleSort {
    public static int[] sort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] sortedArr = sort(arr);
        for(int i : sortedArr) {
            System.out.print(i + " ");
        }
    }
}
