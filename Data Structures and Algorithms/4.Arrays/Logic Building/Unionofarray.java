import java.util.*;

public class Unionofarray {
    public int[] unionarray(int arr1[] , int arr2[]){
        Set<Integer> set = new TreeSet<>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }

        int[] Union = new int[set.size()];
        int index = 0;
        for(int num : set){
            Union[index++] = num;
        }
        return Union;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        Unionofarray obj = new Unionofarray();
        int[] result = obj.unionarray(arr1, arr2);
        System.out.println("Union of the two arrays is: " + Arrays.toString(result));
    }
}
