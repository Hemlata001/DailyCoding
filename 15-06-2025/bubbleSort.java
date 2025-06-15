public class Main
{
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        for(int turn = 0; turn<arr.length-1;turn++){
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("Before BubbleSort");
		int[] arr = {5,4,1,3,2};
		printArray(arr);
		System.out.println("After BubbleSort");
		bubbleSort(arr);
		printArray(arr);
		
	}
}
// time Complexity : O(n^2)
// space Complexity : O(1)
