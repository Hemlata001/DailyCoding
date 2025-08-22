import java.util.*;

class Main {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void printKthLevel(Node root, int k) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1; // root ko level 1 maan liya

        while (!q.isEmpty()) {
            int size = q.size();
            
            // agar current level == k hai, to saare nodes print karo
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    Node curr = q.poll();
                    System.out.print(curr.data + " ");
                }
                return; // kth level mil gaya, return kar gaye
            }

            // warna next level ke nodes dalte jao
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            level++;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;
        System.out.print("Nodes at level " + k + " : ");
        printKthLevel(root, k);
    }
}
