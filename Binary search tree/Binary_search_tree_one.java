import java.util.*;

import javax.swing.plaf.synth.SynthStyle;



public class Binary_search_tree_one {
    static class Node{
        int data;
        Node right;
        Node left;

    Node(int data){
            this.data=data;
            
        }

    }

    // To build a binary search tree :
    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //To search in a BST
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    //To delete a node in BST

    public static Node delete(Node root, int val){
        if(root.data<val){
            root.right=delete(root.right, val);
        }
        else if(root.data>val){
            root.left=delete(root.left, val);
        }
        else{
            //voila
            ///Case 1 : leaf node 
            if(root.left==null && root.right==null){
                return null;
            }
            //Case 2 : single child
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            //Case 3 : Both childreen
            //Inorder successor in BST = Left most node in right subtree
            Node IS=FindInorderSuccessor(root.right);
            root.data=IS.data;      //value is placed
            root.right=delete(root.right, IS.data); //IS.data is deleted (*.* of duplicate .....)
        }
        return root;
    }
    public static Node FindInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    // Print in given range
    public static void printinRange(Node root,int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 &&root.data<=k2){
            printinRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinRange(root.right, k1, k2);
        }else if(root.data<k1){
            printinRange(root.left, k1, k2);
        }else{
            printinRange(root.right, k1, k2);
        }
    }
    //Print  total paths from root to leaf

    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("NULL");
    }

    public static void print2leaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printpath(path);
        }
        print2leaf(root.left, path);
        print2leaf(root.right, path);
        path.remove(path.size()-1);
    }

    // to check BST is valid or not
    public static boolean isvalidbst(Node root, Node min, Node max){
        if(root==null){
            return true;
        }
        if(min !=null && root.data<=min.data){
            return false;
        }
        else if(max != null && root.data>=max.data){
            return false;
        }
        return isvalidbst(root.left, min, root) && isvalidbst(root.right, root, max);
    }
    /*To create a mirror of a given BST
    ex:
            2               2
           / \      ->     / \
          3   4           4   3   */

          public static Node createMirror(Node root){
            if(root==null){
                return null;
            }
            Node leftMirror=createMirror(root.left);
            Node rightMirror=createMirror(root.right);

            root.left=rightMirror;
            root.right=leftMirror;
            return root;
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
    int values[]={5,1,3,4,2,7};
    Node root = null;

    for(int i=0; i<values.length; i++){
        root=insert(root, values[i]);
    }
    inorder(root);
    System.out.println();
    if(search(root, 7)){
        System.out.println("Found");
    }else{
        System.out.println("Not found");
    }
    delete(root, 4);
    inorder(root);
    System.out.println();
printinRange(root, 5, 10);

System.out.println();

 print2leaf(root,new ArrayList<>());    

 inorder(root);
 System.out.println();
     if(isvalidbst(root, null, null)){
        System.out.print("Valid");
     }else{

        System.out.println("Not valid");
     }

     System.out.println();
     inorder(root);

     createMirror(root);
     System.out.println();
     //inorder(root);
     preorder(root);
}
}
