import java.util.*;

public class Main
{
    public static class circularQueueArray{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];
        
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is Full!");
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear<arr.length-1){    // normal case
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            else{
                int val = arr[front];
                if(front == arr.length-1){
                    front = 0;
                }else{
                    front++;
                }
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
           if(size==0){
                throw new Exception("Queue is Empty!");
            }else{
                return arr[front];
            } 
        }
        public boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            else if(front<= rear){
                for(int i = front;i<= rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i = front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i = 0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) throws Exception {
		circularQueueArray cQA = new circularQueueArray();
		System.out.println("Display");
		cQA.display();
		System.out.println("Add");
		cQA.add(1);
		cQA.add(2);
		cQA.add(3);
		cQA.add(4);
		cQA.add(5);
		cQA.add(6);
		cQA.display();
		System.out.println("Remove");
		cQA.remove();
		cQA.display();
		System.out.println("Add");
		cQA.add(7);
		cQA.display();
		cQA.add(8);
		cQA.display();
	}
		
}
