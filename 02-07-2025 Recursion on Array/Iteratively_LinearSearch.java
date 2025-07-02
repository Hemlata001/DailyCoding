import java.util.*;
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
    public static void iteratively_LinearSearch(int[] arr, int x){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                System.out.print("Yes,it is present");
                return;
            }
        }
        System.out.print("No,it is not present");
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] arr = {5,6,7,8,3};
		System.out.print("Print an Array :  ");
		printArray(arr,0);
		
		System.out.print("\nEnter the value of target(x) : ");
		int x = sc.nextInt();
		
		
		System.out.print("Target x is present in the array or not : ");
		iteratively_LinearSearch(arr,x);
	}
}
