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
        int left = 0;
        for(int right = 0; right<n;right++){
            if(arr[right]!= 0){
                // swap
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
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
