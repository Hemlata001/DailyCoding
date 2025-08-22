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

        if (k == 1) {
            System.out.print(root.data + " ");
        } else {
            printKthLevel(root.left, k - 1);
            printKthLevel(root.right, k - 1);
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
        System.out.print("Nodes at level " + k + ": ");
        printKthLevel(root, k);
    }
}
