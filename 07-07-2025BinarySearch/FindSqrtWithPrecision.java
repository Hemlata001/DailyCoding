public class Main {
    public static float findSqrt(int num, int precision) {
        int st = 0, end = num;
        int ans = 0;

        // Step 1: Binary search for integer part
        while (st <= end) {
            int mid = st + (end - st) / 2;
            long val = (long) mid * mid;

            if (val == num) {
                return mid;
            } else if (val < num) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Step 2: Add precision part (decimal places)
        float root = ans;
        float increment = 0.1f;

        for (int i = 0; i < precision; i++) {
            while (root * root <= num) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }

        return root;
    }

    public static void main(String[] args) {
        System.out.printf("%.4f\n", findSqrt(10, 4));  // Output: approx 3.1622
        System.out.printf("%.3f\n", findSqrt(25, 3));  // Output: 5.000
    }
}
