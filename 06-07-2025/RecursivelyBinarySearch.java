class RecursivelyBinarySearch {
    public int recbinarysearch(int[] arr, int start, int end, int k) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == k) {
            return mid;
        }

        if (arr[mid] < k) {
            return recbinarysearch(arr, mid + 1, end, k);
        } else {
            return recbinarysearch(arr, start, mid - 1, k);
        }
    }
}
