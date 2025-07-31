import java.util.Stack;

class Solution {
    public int celebrity(int[][] mat) {
        int n = mat.length;  // Number of people
        Stack<Integer> st = new Stack<>();

        // Step 1: Push all people into the stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: Find the potential celebrity
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();

            // If v1 knows v2, then v1 can't be a celebrity
            if (mat[v1][v2] == 1) {
                st.push(v2);
            } else {
                // If v1 doesn't know v2, then v2 can't be a celebrity
                st.push(v1);
            }
        }

        // No potential celebrity
        if (st.isEmpty()) return -1;

        int candidate = st.pop();

        // Step 3: Verify the candidate
        // Check row: candidate must not know anyone (except themselves)
        for (int j = 0; j < n; j++) {
            if (j != candidate && mat[candidate][j] == 1) {
                return -1;
            }
        }

        // Check column: everyone must know candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate && mat[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }
}
