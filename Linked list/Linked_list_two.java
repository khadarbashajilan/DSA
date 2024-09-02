import java.util.*;

public class Linked_list_two {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while( fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
            
            
        }
        return false;
        
    }

    public static void removecycle(){
        //Detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle=false;

    while(fast != null && fast.next!=null)
    {
        slow = slow.next;
        fast= fast.next.next;
        if(fast == slow)
        {
            cycle=true;
            break;
        }
    }
    if(cycle == false){
        return;
    }
    //Find meeting point
    slow = head;
    Node prev=null;//last node
    while(slow != fast)
    {
    prev = fast;
    slow = slow.next;
    fast = fast.next;
    
    }
    //Remove cycle
    prev.next=null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= head;
        System.out.println(isCycle());

        head = new Node(1);
        Node temp = new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        
        //1->2->3->2
           
       
        System.out.println(isCycle());
        
        removecycle();
        System.out.println(isCycle());
        
    }
        
}


    