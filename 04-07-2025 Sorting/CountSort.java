import java.util.*;
public class Main
{
    static int largest(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    static void countSort(int[] arr){
        // step 1 - find maximum values
        int max = largest(arr);
        // step 2 - count  the frequency
        int[] count = new int[max+1];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // Step 3: Overwrite original array
        int k = 0;
        for(int i = 0;i<count.length;i++){
            for(int j = 0;j<count[i];j++){
                arr[k++]= i;
            }
        }
    }
    
    
    public static void printArr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int[] arr = {6,3,9,5,2,8};
		System.out.println("Before Count Sort");
		printArr(arr);
		System.out.println("Maximum value in the array : "+largest(arr));
		System.out.println("After count Sort");
		countSort(arr);
		printArr(arr);
		
	}
}
// tc = O(n+k)
// sc = O(k)
