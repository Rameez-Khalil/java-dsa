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
}
