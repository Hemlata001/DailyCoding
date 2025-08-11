// naukri coding 360 by coding ninjaa
//  Reversing Queue
import java.util.* ;
import java.io.*; 
import java.util.Queue;

public class Solution {
    public static void reverse(Queue < Integer > q) {
        // Write your code here.
        Stack<Integer> stack = new Stack<>();

        // Step 1: Queue se Stack me push karo
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        // Step 2: Stack se Queue me wapas push karo
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }
}
