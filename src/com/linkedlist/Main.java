package com.linkedlist;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(10);
        ll.append(20);
        ll.prepend(100);
        ll.removeFirst();
        ll.printList();

    }
}
