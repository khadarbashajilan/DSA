import java.util.LinkedList;

public class Linked_list_one {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // To add first in linked list
    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
        size++;

    }

    // to add last in linked list
    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
        size++;
    }

    // To print in the middle of the linked list
    public void add(int idx, int data) {
        Node newnNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newnNode.next = temp.next;
        temp.next = newnNode;
        size++;
    }

    // To print linked list
    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // To remove first in ll
    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // To remove last in LL
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev:i=size-2 tail:i=size-1
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Itterative search in ll
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                // key found
                return i;
            }
            temp = temp.next;
            i++;

        }
        // Key not found
        return -1;
    }

    // Recursive search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1; // Backtracking step
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Reverse a linked list
    public void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev; // reverse link
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    // To find and remove Nth NODE from end (or from tail)
    public void deleteNthfromend(int n) {
        // calculate size
        int sz = 0;
        for (Node temp = head; temp != null; sz++) {
            temp = temp.next;
        }
        if (n == sz) {
            head = head.next; // remove first
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // To check linked list is palindrome or not {
    public boolean checkpalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // Find middle
        Node mid = findMidNode(head);

        // Reverse 2nd half * Reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // check if equall ?
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    private Node findMidNode(Node head) {
        Node slow = head;
        ;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow=mid
    }
    // }
    // public static void main(String[] args) {
    // Linked_list_one LL=new Linked_list_one();
    // //LL.printll();
    // LL.addfirst(1);
    // LL.addlast(2);
    // LL.addlast(3);
    // LL.add(3 , 4);
    // LL.add(4, 5);
    // //LL.printll();
    // LL.removefirst();
    // LL.removefirst();
    // //LL.printll();
    // LL.removeLast();
    // LL.removeLast();
    // //LL.printll();

    // LL.addlast(1);
    // LL.addlast(2);
    // LL.addlast(3);
    // LL.addlast(4);
    // LL.addlast(5);

    // LL.printll();
    // // System.out.println(LL.itrSearch(5));
    // // System.out.println(LL.itrSearch(3));
    // // System.out.println();

    // // System.out.println(LL.recSearch(5));
    // // System.out.println(LL.recSearch(100));

    // System.out.println();

    // // LL.Reverse();
    // // LL.printll();
    // LL.deleteNthfromend(2);
    // LL.printll();

    // LL.addfirst(1);
    // LL.addfirst(2);
    // LL.addfirst(1);
    // LL.addfirst(0);
    // LL.printll();
    // }

    // Merge sort in LL

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid of node
    }

    private Node merge(Node head1, Node head2) {
        {
            Node mergedll = new Node(-1);
            Node temp = mergedll;
            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }
            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergedll.next;
        }
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // leaft and right merged sord
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);
        // Merge
        return merge(newLeft, newRight);
    }
    // public static void main(String[] args) {
    // Linked_list_one LL=new Linked_list_one();
    // LL.addfirst(1);
    // LL.addfirst(2);
    // LL.addfirst(3);
    // LL.addfirst(4);
    // LL.addfirst(5);
    // LL.printll();
    // LL.head=LL.mergesort(LL.head);
    // LL.printll();
    // }

    // ZIG ZAG LL
    // Zig zag LL
    public void zigZag() {
        // Find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // Reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternate merging

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        Linked_list_one ll = new Linked_list_one();
        ll.addfirst(0);
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.printll();

        ll.zigZag();
        ll.printll();

    }
}
