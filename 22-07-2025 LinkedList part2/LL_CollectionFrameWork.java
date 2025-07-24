import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
		LinkedList<Integer>ll= new LinkedList<>();
		
		// ADD
		ll.addLast(1);
		ll.addLast(2);
		ll.addFirst(0);
		
		System.out.println(ll);
		
		// Remove
		ll.removeLast();
		ll.removeFirst();
		
		System.out.println(ll);
	}
	
}
