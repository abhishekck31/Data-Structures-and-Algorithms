class sumofn {
    public int summation(int n) {
        if (n <= 1) {
            return n;
        }
        return n + summation(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        sumofn obj = new sumofn();
        int result = obj.summation(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}