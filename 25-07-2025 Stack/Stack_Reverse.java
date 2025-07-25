import java.util.*;
public class Stack_Reverse
{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s) {
        
        for (int i = s.size() - 1; i >= 0; i--) {
            System.out.println(s.get(i));
        }
    }

	public static void main(String[] args) {
		 Stack<Integer> s = new Stack<>();
		 System.out.println("Before reverse Stack");
		 s.push(1);
		 s.push(2);
		 s.push(3);
		 s.push(4);
		 printStack(s);
		 System.out.println("After reverse Stack");
		 reverseStack(s);
		 printStack(s);
		
	}
}
