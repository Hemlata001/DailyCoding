import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Queue<Integer>q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q);
		System.out.println("Size : "+ q.size());
		System.out.println("---------");
		q.remove();
		System.out.println(q);
		System.out.println("Size : "+ q.size());
		System.out.println("---------");
		q.poll();
		System.out.println(q);
		System.out.println("Size : "+ q.size());
		System.out.println("---------");
		System.out.println("element : "+ q.element());
	    System.out.println("---------");
		System.out.println("peek : "+ q.peek());
		System.out.println("---------");
		System.out.println(q.isEmpty());
		System.out.println("---------");
		
		
		
	}
}
