public class Main {

    // Function to calculate factorial
    public static long factorial(int num) {
        long fact = 1;
        for(int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to compute number of grid ways using nCr formula
    public static long computeWays(int n, int m) {
        long numerator = factorial(n - 1 + m - 1);
        long denominator = factorial(n - 1) * factorial(m - 1);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(computeWays(n, m));  // Output: 6
    }
}
