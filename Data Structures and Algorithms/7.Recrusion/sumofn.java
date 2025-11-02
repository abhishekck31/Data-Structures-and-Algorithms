class sumofn {
    public int summation(int n) {
        if (n <= 1) {
            return n;
        }
        return n + summation(n - 1);
    }

    public static void main(String[] args) {
        sumofn obj = new sumofn();
        int result = obj.summation(5);
        System.out.println("Sum of first 5 natural numbers is: " + result);
    }
}