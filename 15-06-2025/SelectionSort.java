
public class Main
{
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void selectionSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
	public static void main(String[] args) {
		System.out.println("Before SelectionSort");
		int[] arr = {5,4,1,3,2};
		printArray(arr);
		System.out.println("After SelectionSort");
		selectionSort(arr);
		printArray(arr);
		
	}
}
// time Complexity : O(n^2)
// space Complexity : O(1)
