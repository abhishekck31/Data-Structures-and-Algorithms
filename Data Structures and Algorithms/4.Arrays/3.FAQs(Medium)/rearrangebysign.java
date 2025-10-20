import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class rearrangebysign {
    public int[] rearrange(int[] arr){
        int n = arr.length;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i] >= 0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }

        for(int i = 0 ; i < n/2 ; i++){
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }

        return arr;
    }

    public static void main(String[] args){
        int[] a = {1, -2, 3, -4, 5, -6};
        rearrangebysign r = new rearrangebysign();
        r.rearrange(a);
        System.out.println(Arrays.toString(a));
    }
}
