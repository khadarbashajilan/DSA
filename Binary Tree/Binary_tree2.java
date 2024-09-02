public class Binary_tree2{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right= null;
        }
    }//to find diameter of binary tree 
    //Approach 1 :
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh= height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root){//0(n^2)
    if(root == null){
        return 0;
    }
    int leftdia=diameter(root.left);
    int leftht=height(root.left);
    int rightdia=diameter(root.right);
    int rightht=height(root.right);

    int selfdia=leftht+rightht+1;

    return Math.max(selfdia, Math.max(leftdia,rightdia));
}


static class Info{
    int dia;
    int ht;
    public Info(int diam,int ht){
        this.dia=diam;
        this.ht=ht;
    }
}
//Approach 2 :
public static Info diameter2(Node root){
    if(root==null)
    return new Info(0, 0);
    Info leftInfo=diameter2(root.left);
    Info rightInfo=diameter2(root.right);

    int diam = Math.max(Math.max(leftInfo.dia, rightInfo.dia),leftInfo.ht+rightInfo.ht+1);
    int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

    return new Info(diam, ht);
}

//subtree of another tree : 
public static boolean isIdentical(Node node, Node Subroot){
    if(node==null && Subroot==null){
        return true;
    }
    else if(node==null || Subroot==null || node.data!= Subroot.data){
        return false;
    }
    if(!isIdentical(node.left, Subroot.left)){
        return false;
    }
    if(!isIdentical(node.right, Subroot.right)){
        return false;
    }
    return true;
}

public static boolean isSubtree(Node root, Node Subroot){
    if(root==null){
        return false;
    }
    if(root.data == Subroot.data){
        if(isIdentical(root, Subroot)){
            return true;
        }
    }
    return isSubtree(root.left, Subroot)||isSubtree(root.right, Subroot);
}
public static void main(String[] args) {
    Node root = new Node(1);
    root.left= new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.left.left=new Node(4);
    root.right.right=new Node(7);

  //System.out.println(diameter2(root).dia);

    Node Subtree = new Node(2);
    Subtree.right= new Node(5);
    Subtree.left=new Node(4);

    System.out.println(isSubtree(root, Subtree));


}
}