import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer>s = new Stack<>();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		int new_element = 50;
		Stack<Integer>s_temp = new Stack<>();
		while(s.size()>0){
		    s_temp.push(s.pop());
		}
		s.push(new_element);
		while(s_temp.size()>0){
		    s.push(s_temp.pop());
		}
		// print
		while(!s.isEmpty()){
		    System.out.println(s.pop());
		}
	}
}
