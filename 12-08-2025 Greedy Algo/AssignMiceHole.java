// geeks for geeks
// Assign Mice Holes

class Solution {
    static int assignMiceHoles(int N, int[] M, int[] H) {
        // code here
        Arrays.sort(M);
        Arrays.sort(H);
        
        int maxDist = 0;
        for(int i = 0;i<N;i++){
            maxDist = Math.max(maxDist,Math.abs(M[i] - H[i]));
        }
        return maxDist;
        
    }
}
