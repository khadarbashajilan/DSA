import java.lang.annotation.Retention;
import java.util.*;
public class min_dist_bw2nodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    } 
    public static Node lca(Node root, int n1, int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=lca(root.left, n1, n2);
        Node rightlca=lca(root.right, n1, n2);

        if(rightlca==null){
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
    }
    public static int lcadist(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftldist=lcadist(root.left, n);
        int rightdist=lcadist(root.right, n);

        if(leftldist==-1 && rightdist==-1){
            return -1;
        }else if(leftldist==-1){
            return rightdist+1;
        }else{
            return leftldist+1;
        }
    }
    public static int mindist(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);
        int dist1=lcadist(lca,n1);
        int dist2 = lcadist(lca, n2);
        return dist1+dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int n1=4, n2=6;
        System.out.print(mindist(root, n1, n2));
    }
}
