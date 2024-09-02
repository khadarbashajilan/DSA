import java.util.*;
public class ConvertBST_to_balancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer>inorder){
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node CreatingBST(ArrayList<Integer>inorder, int st, int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left=CreatingBST(inorder, st, mid-1);
        root.right=CreatingBST(inorder,mid+1, end);
        return root;
    }
    public static Node balancedBST(Node root){
        //Inorder sequence
        ArrayList<Integer>inorder=new ArrayList<>();
        getInorder(root, inorder);

        //Sorted inorder -> Balanced BST
        root=CreatingBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left=new Node(6);
        root.right= new Node(10);
        root.left.left=new Node(5);
        root.right.right=new Node(11);
        root.left.left.left= new Node(3);
        root.right.right.right= new Node(12);

       Node root1 =  balancedBST(root);
       Inorder(root1);

    }
}
