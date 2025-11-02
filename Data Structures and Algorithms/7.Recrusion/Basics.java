public class Basics {
    public int recursionExample(int n){
        if(n > 0){
            recursionExample(n-1);
            System.out.println(n);
        }
        return n;
    }
    public static void main(String[] args){
        int n = 6;
        Basics obj = new Basics();
        obj.recursionExample(n);
    }
}
