import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
public class Transform_to_sumTree {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static int Transform(Node root){
        if(root==null){
            return 0;
        }
        int leftchild=Transform(root.left);
        int rightchild=Transform(root.right);

        int data=root.data;

        int newLeft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;

        root.data=newLeft+newright+leftchild+rightchild;

        return data;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Transform(root);
        preorder(root);
    }
}
