public class Main
{

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
   
    static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int count = 0;
        for(int i = start+1;i<=end;i++){
            if(arr[i]<=pivot)count++;
        }
        int pivotIndex = start + count;
        swap(arr, start, pivotIndex);
        int i = start;
        int j = end;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
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
