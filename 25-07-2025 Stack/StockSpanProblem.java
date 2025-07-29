// Geeks for Geeks  Stock span problem
import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        res[0] = 1;
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - st.peek();
            }

            st.push(i);
        }

        // Convert array to ArrayList before returning
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : res) {
            result.add(num);
        }

        return result;
    }
}
