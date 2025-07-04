public class Main
{
    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start -1;// to make place for else smaller than pivot
        
        for(int j = start;j<end;j++){
            if(arr[j]<= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
        
    }  
    
     static void quickSort(int[] arr, int start, int end){
        if(start>= end)return;
        int pi = partition(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }
    
    
    public static void printArr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int[] arr = {6,3,9,5,2,8};
		System.out.println("Before QuickSort");
		printArr(arr);
		System.out.println("After QuickSort");
		quickSort(arr, 0,arr.length-1);
		printArr(arr);
	}
}
// tc = O(nlogn)
// sc = O(1)
// worst cast tc = O(n^2)
