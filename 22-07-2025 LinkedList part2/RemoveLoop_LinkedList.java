# Geeks for Geeks
  class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while( fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
            
        }
        if(cycle == false){
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            
        }
        // remove cycle -> last.next = null
        prev.next = null;
        
    }
}
