public class Ac_33_BinarySearchTree{

    // Node class...
    public static class Node{
        int data;
        Node left;
        Node right;

        // constructor Node class...
        public Node(int d){
            this.data = d;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // insert left Subtree...
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    // inOrder traversal method...
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int [] values = {5,1,3,4,2,7};
        Node root = null;

        for (int i : values) {
            root = insert(root, i);
        }

        inOrder(root);
        System.out.println();
    }
}