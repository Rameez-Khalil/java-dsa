package com.coding.quetions.BubbleSort;

public class LLSORT {
    Node head;
    private int size;

    class Node {
        int value;
        Node next;
    }


    //SORT THE LIST VIA BUBBLESORT.
    public void bubbleSort() {
        if (this.size < 2) {
            return;
        }

        //Create a node to keep track of what items have been sorted.
        Node sortedUntil = null;
        while (sortedUntil != this.head.next) {
            Node current = this.head;
            while (current.next != sortedUntil) {
                Node nextNode = current.next;
                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                }
                current = current.next;
            }
            sortedUntil = current;
        }

    }


}
