# Leetcode 234. Palindrome Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // slow fast approach
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  
    } 
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        // step 1 - find midnode
        ListNode midNode = findMid(head);

        // step 2 - reverse 2nd half
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right  = prev;
        ListNode left = head;

        // step 3 - check find left half and right half
        while(right!=null){
            if(left.val  != right.val){
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;   
    }   
}
