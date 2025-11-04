public class Taylorseries {
    public static void main(String[] args) {
        double x = 2.0;   // value to compute e^x for
        int n = 10;       // number of terms (0..n)
        System.out.println("Taylor series approximation: " + taylor(x, n));
    }

    // public wrapper
    public static double taylor(double x, int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        return taylorRec(x, n, 1.0); // start with 0th term = 1
    }

    // recursive helper: term is the current term for k (starts at k=0)
    private static double taylorRec(double x, int n, double term) {
        if (n == 0) return term;
        // add current term and compute next term = term * x / (k+1)
        return term + taylorRec(x, n - 1, term * x / n);
    }
}
