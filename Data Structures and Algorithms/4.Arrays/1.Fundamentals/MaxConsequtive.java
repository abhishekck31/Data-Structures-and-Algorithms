public class MaxConsequtive {
    public int maxconsequtive(int[] arr){
        int maxCount = 0;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        MaxConsequtive mc = new MaxConsequtive();
        int[] arr = {1,1,0,1,1,1,0,1};
        System.out.println(mc.maxconsequtive(arr));
    }
}
