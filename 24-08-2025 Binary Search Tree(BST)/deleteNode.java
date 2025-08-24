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
    

    
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right,val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            // case 1 - leaf Node
            if(root.left == null && root.right == null){
                return null;
            }
            
            // case 2 - single Child
            if(root.left == null){
                return root.right;
            }
            
            else if(root.right == null){
                return root.left;
            }
            
            // case 3  - both children
            Node IS = findInorderSucessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    
    public static Node findInorderSucessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        inorder(root);
        System.out.println();
        
        root = delete(root,1);
        System.out.println();
        
        inorder(root);
    }
}
