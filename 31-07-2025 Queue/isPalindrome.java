import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        // Initializing the deque
        for (Character c: input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            Character front = deque.removeFirst();
            Character rear = deque.removeLast();

            if (front != rear) return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("cacc"));
    }
}
