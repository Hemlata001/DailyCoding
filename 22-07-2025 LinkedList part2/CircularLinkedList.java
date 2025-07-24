public class Solution {

    // Node definition
    static class Node {
        int data;
        Node next;
    }

    // Add to empty circular linked list
    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;

        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;  // Points to itself
        return last;
    }

    // Add node at the front
    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;  // new node points to first node
        last.next = newNode;       // last node now points to new node
        return last;
    }

    // Add node at the end
    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    // Add a node after a specific item
    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;

        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;

                if (p == last)
                    last = newNode;

                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " is not present in the list.");
        return last;
    }

    // Delete a node by value (key)
    static Node deleteNode(Node last, int key) {
        if (last == null)
            return null;

        // Only one node in the list
        if (last.data == key && last.next == last) {
            return null;
        }

        Node temp = last;

        // If the node to delete is the last node
        if (last.data == key) {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp.next;
            return last;
        }

        // Search for the node to delete
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        // Node found
        if (temp.next.data == key) {
            temp.next = temp.next.next;
        }

        return last;
    }

    // Traverse and print the circular linked list
    static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);

        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 6);        // List: 6
        last = addEnd(last, 8);            // List: 6 -> 8
        last = addFront(last, 2);          // List: 2 -> 6 -> 8
        last = addAfter(last, 10, 2);      // List: 2 -> 10 -> 6 -> 8

        System.out.print("List after insertions: ");
        traverse(last);                    // Output: 2 10 6 8

        last = deleteNode(last, 8);        // Delete node with data = 8

        System.out.print("List after deletion: ");
        traverse(last);                    // Output: 2 10 6
    }
}
