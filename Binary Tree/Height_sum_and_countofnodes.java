public class Height_sum_and_countofnodes {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data=data;
            this.right=null;
            this.left=null;

        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh= height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=count(root.left);
        int rightcount=count(root.right);
        return leftcount+rightcount+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static void main(String[] args) {
        /*
         *              1
         *            /  \ 
         *           2    3   
         *          / \  /  \
         *         4   5 6   7       */
        Node root= new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.right.left= new Node(6);
        root.left.right= new Node(5);

        System.out.println("Height of tree = "+height(root));
        System.out.println("Count of nodes = "+count(root));
        System.out.println("Sum of nodes = "+sum(root));

        
        

    }
}
