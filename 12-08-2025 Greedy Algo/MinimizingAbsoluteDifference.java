import java.util.*;

class Main {
    public static int minAbsDifference(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {2, 1, 3};
        System.out.println(minAbsDifference(A, B)); // Output = 0
    }
}
