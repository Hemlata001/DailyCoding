import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer>s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);// 1 2 3 4 5
		s.pop();
		System.out.println(s);// 1 2 3 4
		s.pop();
		System.out.println(s);// 1 2 3
		s.pop();
		System.out.println(s);// 1 2
		s.pop();
		System.out.println(s);// 1
		s.pop(); 
		System.out.println(s);//
		s.pop(); // error - empty stack exception - underflow
		// s.peek(); error - empty stack exception - underflow
		System.out.println(s);
		
		
	}
}
