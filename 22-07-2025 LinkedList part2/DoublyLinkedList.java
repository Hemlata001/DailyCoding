public class DoubleLL
{
    public class Node{
        int data;
        Node prev;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    // AddFirst
    // step1 create Node
    // step 2 newNode.next = head
    // step3 head.prev = newNode
    // step 4 head = newNode
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    // AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    
    //RemoveFirst
    public int RemoveFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        
       if(size == 1){
           int val = head.data;
           head = tail = null;
           size--;
           return val;
       } 
       int val = head.data;
       head = head.next;
       head.prev = null;
       size--;
       return val;
    }
    //RemoveLast
     public void RemoveLast() {
        if (head == null) {
            return; 
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        if (curr.prev != null) {
            curr.prev.next = null;
        }
    }
    
    // Print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
	    DoubleLL Dll  = new DoubleLL();
	    Dll.addFirst(3);
	    Dll.addFirst(2);
	    Dll.addFirst(1);
	    Dll.addLast(4);
	    Dll.addLast(5);
	    Dll.addLast(6);
	    
	    Dll.print();
	    System.out.println("Size of doubly linkedlist : " + Dll.size);
	    Dll.RemoveFirst();
	    Dll.RemoveLast();
	    Dll.print();
	    
	}
}
