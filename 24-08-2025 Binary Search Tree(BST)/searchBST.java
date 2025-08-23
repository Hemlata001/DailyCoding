public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Insert method takes the current root node and value to insert
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        
        if(root.data == key){
            return true;
        }
        
        if(root.data > key){
            return search(root.left,key);
        }
        
        else{
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        inorder(root);
        System.out.println();
        
        if(search(root,1)){
            System.out.println("found");
        }else{
            System.out.println("no found");
        }
    }
}
