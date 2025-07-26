import java.util.Stack;
public class Display
{
	public static void main(String[] args) {
		Stack<Integer>s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("First way");
		System.out.println(s);
		System.out.println("Second way");
		while(!s.isEmpty()){
		    System.out.println(s.pop());
		}
	}
}
