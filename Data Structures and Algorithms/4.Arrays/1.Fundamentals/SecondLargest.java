public class SecondLargest {
    public int secondlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int scndlargest = Integer.MIN_VALUE;
        for(int i = 0 ;i < arr.length ; i++){
            if(arr[i]>largest){
                scndlargest = largest;
                largest = arr[i];
            }else if(arr[i]>scndlargest && arr[i]!=largest){
                scndlargest = arr[i];
            }
        }
        return scndlargest;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,5,40,30};
        SecondLargest sl = new SecondLargest();
        int result = sl.secondlargest(arr);
        System.out.println("Second Largest element is: " + result);
    }
}
