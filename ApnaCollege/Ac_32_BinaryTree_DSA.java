import java.util.LinkedList;
import java.util.Queue;

public class Ac_32_BinaryTree_DSA {
//    Node class...
    public static class Node{
        int data;
        Node left;
        Node right;

//        constructor Node class..
    public Node(int d){
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

// BinaryTree class...
    public static class BinaryTree{
       public static int idx = -1;
        public Node buildTree(int [] nodes){
        idx++;
        if (nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
}

// preOrder method...
    public static void preOrder(Node root){
        if (root == null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

//    inOrder method...
    public static void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

//    postOrder method...

    public static void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //    levelOrder method...
    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null){
                   q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

//    countOfNodes method...
    public static int countOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;

    }

//    sumOfNodes method...
    public static int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

//    nodeHeight method...
    public static int nodeHeight(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = nodeHeight(root.left);
        int rightHeight = nodeHeight(root.right);

        int myHeight = Math.max(leftHeight, rightHeight + 1);
        return myHeight;
    }

//    diameter method...
    public static int diameter(Node root){
        if (root == null){
            return 0;
        }
        int dim1 = diameter(root.left);
        int dim2 = diameter(root.right);
        int dim3 = nodeHeight(root.left) + nodeHeight(root.right) + 1;

        return Math.max(dim3, Math.max(dim1, dim2));
    }

    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("preOrder...");
        preOrder(root);
        System.out.println("\ninOrder...");
        inOrder(root);
        System.out.println("\npostOrder...");
        postOrder(root);
        System.out.println("\nlevelOrder...");
        levelOrder(root);
        System.out.println("countOfNodes...");
        int count = countOfNodes(root);
        System.out.println(count);
        System.out.println("sumOfNodes...");
        int sum = sumOfNodes(root);
        System.out.println(sum);
        System.out.println("nodeHeight...");
        int height = nodeHeight(root);
        System.out.println(height);
        System.out.println("diameter...");
         int d = diameter(root);
        System.out.println(d);
    }
}
