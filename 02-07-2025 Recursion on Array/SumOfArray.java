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
    public static int sumOfArray(int[] arr, int idx){
        //Base Case
        if(idx==arr.length){
            return 0;
        }
        
        //small problem
        int smallAns = sumOfArray(arr, idx+1);
        
        //self work
        return smallAns + arr[idx];
    }
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,3};
		System.out.print("Print an Array :  ");
		printArray(arr,0);
		System.out.println("\nSum of the Array : "+ sumOfArray(arr,0));
	}
}
