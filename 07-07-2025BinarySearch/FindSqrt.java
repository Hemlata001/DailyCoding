public class Main {
    public static int findSqrt(int num) {
        int st = 0, end = num;
        int ans = 0;

        // Binary search to find integer part of sqrt
        while (st <= end) {
            int mid = st + (end - st) / 2;
            long val = (long) mid * mid;

            if (val == num) {
                return mid; // perfect square
            } else if (val < num) {
                ans = mid;     // store last valid mid
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans; // only integer part
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(10)); // Output: 3
        System.out.println(findSqrt(25)); // Output: 5
        System.out.println(findSqrt(30)); // Output: 5
    }
}
