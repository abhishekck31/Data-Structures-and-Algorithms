public class MoveZeros {
    public void moveZeros(int[] arr){
        int n = arr.length;
        int count = 0;

        int[] temp = new int[n];

        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                temp[count++] = arr[i];
            }
        }
        for(int i = 0 ; i < count ; i++){
            arr[i] = temp[i];
        }
        for(int i = count ; i < n ;i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        MoveZeros obj = new MoveZeros();
        obj.moveZeros(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
