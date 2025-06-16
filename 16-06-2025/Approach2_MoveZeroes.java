// LeetCode - 283. Move Zeroes
public class Main
{
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void moveZero(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    // swap arr[j], arr[j+1]
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
	public static void main(String[] args) {
		System.out.println("Before Moving Zero to the right");
		int[] arr = {0,5,0,3,4,2};
		printArray(arr);
		System.out.println("After Moving Zero to the right");
		moveZero(arr);
		printArray(arr);
		
	}
}
// time Complexity : O(n^2)
// space Complexity :O(1)
