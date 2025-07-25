import java.util.Stack;
public class basicStack
{
	public static void main(String[] args) {
		Stack<Integer>st = new Stack<>();
		// operation push
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		// print the Stack
		System.out.println(st);
		
		// operation peek 
		System.out.println(st.peek());
		
		//operation pop
		st.pop();
		st.pop();
		
		// print the Stack
		System.out.println(st);
	}
}
