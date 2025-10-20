import java.util.*;
public class Leaders {
    public List<Integer> leaders(int[] arr){
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        int max = arr[n-1];
        result.add(max);

        for(int i = n - 2 ; i >= 0 ; i--){
            if(arr[i] > max){
                max = arr[i];
                result.add(max);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Leaders obj = new Leaders();
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = obj.leaders(arr);
        System.out.println("Leaders in the array are: " + leaders);
    }
}
