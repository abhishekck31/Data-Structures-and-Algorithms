
import java.util.Random;

public class QuickSort {
    private static final Random RAND = new Random();

    public void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = low + RAND.nextInt(high - low + 1);
        int pivot = arr[pivotIndex];
        // move pivot to end
        int tmp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = tmp;

        int store = low;
        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                int t = arr[i];
                arr[i] = arr[store];
                arr[store] = t;
                store++;
            }
        }
        // place pivot in its final position
        int t = arr[store];
        arr[store] = arr[high];
        arr[high] = t;

        quicksort(arr, low, store - 1);
        quicksort(arr, store + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 4, 5};
        QuickSort qs = new QuickSort();
        qs.quicksort(arr, 0, arr.length - 1);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
