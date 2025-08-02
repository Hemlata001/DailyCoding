public class Main
{
    public static class Node{ 
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        
        // Add
        public void add(int x){
            Node temp = new Node(x);
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        
        // Peek
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }
        
        // Remove
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            return x;
        }

        // Display
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        // isEmpty
        public boolean isEmpty(){
            return size == 0;
        }
    }

    public static void main(String[] args) {
        queueLL qll = new queueLL();
        qll.display();

        qll.add(1);
        qll.add(2);
        qll.add(3);
        qll.add(4);

        qll.display();

        System.out.println(qll.peek());  // Shows head value

        qll.remove();                    // Removes head

        qll.display();                   // Displays the remaining queue

        System.out.println(qll.isEmpty());// false

        System.out.println(qll.size);     // 3
    }
}
