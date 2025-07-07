public class Main
{
    static int firstOccurence(int[] arr, int x){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int firstOcc = 0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==x){
                firstOcc = mid;
                end = mid-1;
            }
            if(arr[mid]<x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return firstOcc;
    }
	public static void main(String[] args) {
		int[] arr = {2,5,5,5,6,6,8,9,9,9};
		int x = 5;
		System.out.println(firstOccurence(arr,x));
	}
}
