import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Deque<Integer> dq = new LinkedList<>();
	    // add, remove/poll, peek/element
	    dq.addLast(1);
	    dq.addLast(2);
	    dq.addLast(3);
	    dq.addLast(4);
	    System.out.println(dq);
	    dq.addFirst(5);
	    System.out.println(dq);
	    dq.removeLast();
	    System.out.println(dq);
	    dq.removeFirst();
	    System.out.println(dq);
	    System.out.println(dq.getFirst());
	    System.out.println(dq.getLast());
	}
}
