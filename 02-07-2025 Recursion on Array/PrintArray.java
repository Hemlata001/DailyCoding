public class Main
{
    public static void printArray(int[] arr, int idx){
        // Base Case
        if(idx==arr.length){
            return;
        }
        // Self work
        System.out.print(arr[idx] + " ");
        //recursive work
        printArray(arr, idx+1);
    }
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,3};
		printArray(arr,0);
		
		
	}
}
