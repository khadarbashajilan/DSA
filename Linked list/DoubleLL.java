import java.util.*;

public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;
       
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node Head;
    public static Node tail;
    public static int size;

    // To add first in DLL

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = tail = newNode;
            return;
        }
        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;
    }

    // To print ll

    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    // To remove first in DLL

    public int removeFirst() {
        if (Head == null) {
            System.out.print("DLL is empty");

            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = Head.data;
            Head = tail = null;
            size--;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        Head.prev = null;
        size--;
        return val;
    }

    // To add last in dll

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = tail = newNode;
            return;
        }
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
    }

    // to remove last in dll

    
    public int removeLast() {
        
        if (Head == null) {
            System.out.print("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = Head.data;
            Head = tail = null;
            size--;
            return val;
        }
        
        int val = tail.data;

        // Node tempNode;
        // tail=tail.prev;      <-????????????????????????????->
        // tail.next=null;
        // tempNode=tail;
        
        size--;
        return val;
        
        
    }

    // public static void main(String[] args) {
    //     DoubleLL dll = new DoubleLL();

    //     // dll.addFirst(3);
    //     // dll.addFirst(2);
    //     // dll.addFirst(1);
    //     // dll.print();
    //     // dll.removeFirst();
    //     // dll.print();
    //     // dll.removeFirst();
    //     // dll.print();
    //     dll.addLast(1);
    //     dll.addLast(2);
    //     dll.addLast(3);
    //     dll.addLast(4);
    //     dll.print();
    //     dll.removeLast();
    //     dll.print();
    // }


    //To reverse a doubly LL
    public void reverse()
    {
        Node curr = Head;
        Node prev = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        Head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
