public class exponent {
    public int power(int base,int exp){
        if(exp==0){
            return 1;
        }
        return base*power(base,exp-1);
    }
    public static void main(String[] args){
        exponent obj = new exponent();
        int result = obj.power(2,5);
        System.out.println("2 raised to the power 5 is: " + result);
    }
}
