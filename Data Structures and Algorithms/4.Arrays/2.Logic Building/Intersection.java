import java.util.*;

public class Intersection {
    public int[] intersection(int[] arr1,int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        for(int num : arr1){
            set1.add(num);
        }
        Set<Integer> intersectionSet = new HashSet<>();
        for(int num : arr2){
            if(set1.contains(num)){
                intersectionSet.add(num);
            }
        }
        int[] result = new int[intersectionSet.size()];
        int i = 0;
        for(int num : intersectionSet){
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        Intersection obj = new Intersection();
        int[] result = obj.intersection(arr1, arr2);
        System.out.println("Intersection of the two arrays is: " + Arrays.toString(result));
    }
}
