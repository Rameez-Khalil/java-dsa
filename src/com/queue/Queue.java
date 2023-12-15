package com.queue;

public class Queue {
    //last, first and size.
    private Node first;
    private Node last;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        height = 1;
    }

    //printing the queue.
    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getLast() {
        System.out.println(last.value);
    }

    public void getFirst() {
        System.out.println(first.value);
    }

    public void getSize() {
        System.out.println(height);
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        height++;
    }

    public Node dequeue() {
        if (height == 0) {
            return null;
        }
        Node temp = first;
        if (height == 1) {
            first = null;
            last = null;

        } else {
            first = first.next;
            temp.next = null;
        }
        height--;
        return temp;
    }

}
