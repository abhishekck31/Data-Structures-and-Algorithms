public class Sumofarrayele {
  public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumofArray(arr,arr.length);
        System.out.println("Sum of array elements is: " + sum);
  } 
  public static int sumofArray(int[] arr,int n){
    if(n<=0){
        return 0;
    }else{
        return arr[n-1] + sumofArray(arr,n-1);
    }
  } 
}
