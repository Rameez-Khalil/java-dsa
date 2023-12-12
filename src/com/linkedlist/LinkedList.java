package com.linkedlist;

public class LinkedList {

    //LL class members.
    private Node head;
    private Node tail;
    private int size;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    LinkedList(int value) {
        //Create node.
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    //Printing the list.
    public boolean printList() {
        if (size == 0) {
            return false;
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }

        return true;
    }

    //Append (Adding at the end).
    public void append(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {

            //Add at the end and reset the tail to the last node
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //Remove last.
    public Node removeLast() {
        /*
            Create two pointers:
                first pointer will take us to last node.
                second pointer will be used to get the 2nd last item.
         */
        if (size == 0) {
            return null;
        }
        Node curr = head;
        Node prev = head;
        //Move forward as long as you can reach to the end.
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        //Now curr and prev will be holding last and second last items.
        //let's reset the tail
        tail = prev;
        tail.next = null;
        size--;

        if (size == 0) {
            head = null;
            tail = null;
        }

        return curr;

    }

    //Adding at the beginning.
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        }
        //take head and assign it to the newNode, this will not break the chain.
        newNode.next = head;
        head = newNode;
        size++;
    }

    //removing first.
    public Node removeFirst() {
        //assign temp to head.
        //move head one step further.
        //assign temp.next = null so we can break the chain.

        Node temp = head;
        if (size == 0) {
            return null;
        }
        head = head.next;
        temp.next = null;
        size--;

        //Since head would've already become null if there was only one node.
        if (size == 0) {
            tail = null;
        }

        return temp;
    }
}
