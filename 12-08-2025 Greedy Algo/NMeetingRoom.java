// geeks for geeks
// N meetings in one room
import java.util.*;
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
            
        }
        Arrays.sort(arr,Comparator.comparingInt(a -> a[1]));
        
        int count = 1;
        int j = arr[0][1];
        for(int i = 1;i<n;i++){
            if(arr[i][0] > j){
                count++;
                j = arr[i][1];
            }
        }
        return count;
    }
}
