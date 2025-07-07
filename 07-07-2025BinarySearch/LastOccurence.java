public class LastOccurence
{
    static int lastOccurence(int[] arr, int x){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int lastOcc = -1; 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                lastOcc = mid;       
                start = mid + 1;     
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return lastOcc;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int x = 5;
        System.out.println(lastOccurence(arr, x)); // Output: 3
    }
}
