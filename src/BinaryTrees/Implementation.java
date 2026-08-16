package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

// Binary Tree Node
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Implementation {

    public static <kth> void main(String[] args) {

        // Creating nodes
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        // Creating the binary tree
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;
        
       Kthlevel(a,0,0);

        // Normal Level Order
        System.out.println("Normal Level Order:");
        levelOrder(a);

        // Preorder Traversal
        display(a);
        System.out.println();

        // Size
        System.out.println("Size: " + size(a));

        // Sum
        System.out.println("Sum: " + sum(a));

        // Product
        System.out.println("Product: " + product(a));

        // Product of non-zero values
        System.out.println("Product of non-zero: "
                + productOfNonZero(a));

        // Maximum
        System.out.println("Maximum: " + max(a));

        // Number of levels
        System.out.println("Levels: " + levels(a));

        // Minimum
        System.out.println("Minimum: " + min(a));
    }

    private static void Kthlevel(Node root, int level, int k) {
        if(root == null) return;
        if(level==k) System.out.println(root.val);
        Kthlevel(root.left, level+1, k);
        Kthlevel(root.right, level+1, k);
    }


    // Level Order Traversal
    private static void levelOrder(Node root) {

        if (root == null) return;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (q.size() > 0) {

            // Number of nodes at current level
            int n = q.size();

            for (int i = 0; i < n; i++) {

                Node front = q.remove();

                System.out.print(front.val + " ");

                if (front.left != null) {
                    q.add(front.left);
                }

                if (front.right != null) {
                    q.add(front.right);
                }
            }

            // Move to next level
            System.out.println();
        }
    }

    // Number of levels / Height
    private static int levels(Node root) {

        if (root == null) return 0;

        return 1 + Math.max(
                levels(root.left),
                levels(root.right)
        );
    }

    // Product of non-zero values
    private static int productOfNonZero(Node root) {

        if (root == null) return 1;

        int value;

        if (root.val == 0) {
            value = 1;
        } else {
            value = root.val;
        }

        return value
                * productOfNonZero(root.left)
                * productOfNonZero(root.right);
    }

    // Number of nodes
    private static int size(Node root) {

        if (root == null) return 0;

        return 1
                + size(root.left)
                + size(root.right);
    }

    // Sum of all nodes
    private static int sum(Node root) {

        if (root == null) return 0;

        return root.val
                + sum(root.left)
                + sum(root.right);
    }

    // Product of all nodes
    private static int product(Node root) {

        if (root == null) return 1;

        return root.val
                * product(root.left)
                * product(root.right);
    }

    // Maximum value
    private static int max(Node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        return Math.max(
                root.val,
                Math.max(
                        max(root.left),
                        max(root.right)
                )
        );
    }

    // Minimum value
    private static int min(Node root) {

        if (root == null) {
            return Integer.MAX_VALUE;
        }

        return Math.min(
                root.val,
                Math.min(
                        min(root.left),
                        min(root.right)
                )
        );
    }

    // Preorder Traversal
    private static void display(Node root) {

        if (root == null) return;

        System.out.print(root.val + " ");

        display(root.left);
        display(root.right);
    }

}