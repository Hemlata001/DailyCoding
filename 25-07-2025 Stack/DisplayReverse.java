import java.util.Stack;
public class Main
{
    public static void displayReverseStack(Stack<Integer>s){
        if(s.size()==0)return;
        int top = s.pop();
        System.out.println(top + " ");
        displayReverseStack(s);
        s.push(top);
    }
	public static void main(String[] args) {
		Stack<Integer>s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		displayReverseStack(s);
	}
}
