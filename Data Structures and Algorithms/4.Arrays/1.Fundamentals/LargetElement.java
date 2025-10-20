public class LargetElement {
    public int largestelement(int[] arr){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int arr[] ={10,20,5,40,30};
        LargetElement le = new LargetElement();
        int result = le.largestelement(arr);
        System.out.println("Largest element is: " + result);
    }
}
