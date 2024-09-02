import java.util.*;

public class kth_level_of_a_tree {
    static class Node {
        Node right;
        Node left;
        int data;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    // public static void levelorder(Node root, int k) {
    //     if (root == null) {
    //         return;
    //     }
    //     int level = 1;
    //     Queue<Node> q = new LinkedList<>();
    //     q.add(root);
    //     q.add(null);
    //     while (!q.isEmpty()) {
    //         Node CurrNode = q.remove();

    //         if (CurrNode == null) {
    //             System.out.println();
    //             if (q.isEmpty()) {

    //                 break;
    //             } else {
                    
    //                 q.add(null);
    //             }
    //         } else {
              

    //             if (level == k) {
    //                 System.out.print(CurrNode.data + " ");
    //             }
    //                 if (CurrNode.left != null) {
                        
    //                     q.add(CurrNode.left);
    //                     level++; 
    //                 }
    //                 if (CurrNode.right != null) {
                        
    //                     q.add(CurrNode.right);
    //                     level++; 
    //                 }
                
    //         } 
    //     }
        
    // }
    public static void klevel(Node root, int level, int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.right.right = new Node(6);

        int k = 3;
        //levelorder(root, k);
        klevel(root, 1, k);
    }
}
