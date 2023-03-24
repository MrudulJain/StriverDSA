package Trees;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BasicTreesOps {
    Node root;

    public static Node insertNode(Node root, int val)
    {
        if(root == null)
        {
            return new Node(val);
        }
        if(val < root.data)
        {
            root.left = insertNode(root.left, val);
        }
        else
        {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public static int getSize(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int l = getSize(root.left);
        int r = getSize(root.right);

        return( l + r + 1);
        //for every node found on left side check if it is not null, and then return the sum of the number of nodes in its subtree
    }

    public static int countLeaves(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else if(root.left == null && root.right == null)
        {
            return 1;
        }
        else
        {
            int l = countLeaves(root.left);
            int r = countLeaves(root.right);
            return ( l + r);
        }
    }

    static int sumBT(Node root){
        if(root == null)
        {
            return 0;
        }
        int l = sumBT(root.left);
        int r = sumBT(root.right);
        return (root.data + l + r);
    }

    static ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        result.add(root.data);
        result.addAll(preOrder(root.left));
        result.addAll(preOrder(root.right));
        return result;
    }

    static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        result.addAll(inOrder(root.left));
        result.add(root.data);
        result.addAll(inOrder(root.right));
        return result;
    }

    static ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        result.addAll(postOrder(root.left));
        result.addAll(postOrder(root.right));
        result.add(root.data);
        return result;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insertNode(root,1);
        root = insertNode(root,2);
        root = insertNode(root,3);
        root = insertNode(root,4);
        root = insertNode(root,5);
        root = insertNode(root,6);
        root = insertNode(root,7);

        System.out.println("No. of nodes in the tree:"+getSize(root));
        System.out.println("No. of leaf nodes in the tree:"+countLeaves(root));
        System.out.println("Sum of data in the nodes of the tree: "+sumBT(root));

        ArrayList<Integer> preorderList = preOrder(root);
        System.out.println("Preorder Traversal: " +preorderList);

        ArrayList<Integer> inorderList = inOrder(root);
        System.out.println("Inorder Traversal: " +inorderList);

        ArrayList<Integer> postorderList = postOrder(root);
        System.out.println("Postorder Traversal: " +postorderList);
    }
}
