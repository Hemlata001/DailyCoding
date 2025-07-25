import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> st_original = new Stack<>();
		st_original.push(1);
		st_original.push(2);
		st_original.push(3);
		st_original.push(4);
		System.out.println(st_original);
		Stack<Integer> st_reversed = new Stack<>();
		while(!st_original.isEmpty()){
		    st_reversed.push(st_original.pop());
		}
		System.out.println((st_reversed));
		
	}
}
