package linkedlist;

import java.util.*;


public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data) {
        
        //  Step 1create a new node 
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 = newnode next head
        newNode.next =head;

        // step 3 new node = head
        head = newNode;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
        
    }
    
}
