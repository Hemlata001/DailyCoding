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
    public static int maxInArray(int[] arr, int idx){
        //Base Case
        if(idx==arr.length-1){
            return arr[idx];
        }
        
        //small problem
        int smallAns = maxInArray(arr, idx+1);
        
        //big problem
        return Math.max(arr[idx],smallAns);
    }
	public static void main(String[] args) {
		int[] arr = {5,6,7,8,3};
		System.out.print("Print an Array :  ");
		printArray(arr,0);
		System.out.println("\nMaximum value in an  Array : "+ maxInArray(arr,0));
	}
}
