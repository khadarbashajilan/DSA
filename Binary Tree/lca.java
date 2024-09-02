import java.text.BreakIterator;
import java.util.*;

public class lca {
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
    //Approch 1 :
    public static boolean getpath(Node root, int n, ArrayList<Node> path){

        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundleft= getpath(root.left, n, path);
        boolean foundright=getpath(root.right, n, path);

        if(foundleft||foundright){
            return true;
        }
        path.remove(path.size()-1);
            return false;
        
    }
    public static Node Approach1(Node root, int n1, int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        //LCA
        int i =0;
        for(;i<path1.size()&&i<path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //Last equall node -> i-1^th

        Node lca = path2.get(i-1);
        
        return lca;
    }
    //Approch 2 :
    public static Node Approach2(Node root, int n1, int n2){
        if(root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node Leftlca= Approach2(root.left, n1, n2);
        Node Rightlca = Approach2(root.right, n1, n2);

        if(Rightlca==null){
            return Leftlca;
        }
        if(Leftlca==null){
            return Rightlca;
        }
        return root;
    }

    public static void main(String[] args) {
    Node root = new Node(1);
    root.right=new Node(3);
    root.left=new Node(2);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    int n1=4,n2=7;
    System.out.print(Approach2(root, n1, n2).data);        
    }
}
