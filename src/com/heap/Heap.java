package com.heap;

import java.util.*;

/*
Heap is a binary tree (complete - filling from left to right must be satisfied).
Max and Min heaps are popular
Parent's node value must be greater than of its both children.
left node = 2*parent.
right node = 2*parent + 1.
parent node = child/2.
HEAP ALLOWS EFFICIENT INSERTION AND REMOVAL  - PRIORITY QUEUE.
 */
public class Heap {
    //A heap variable.
    private List<Integer> heap;

    //Constructor.
    Heap() {
        this.heap = new ArrayList<Integer>();
    }

    //Get heap.
    public List<Integer> getHeap() {
        return new ArrayList<Integer>(heap);
    }

    //Left child.
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    //Right child.
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    //Left child.
    private int parent(int index) {
        return (index - 1) / 2;
    }

    //swap.
    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }


    //insert method.
    public void insert(int value) {
        heap.add(value);
        //Since the element added was at the last index
        int current = heap.size() - 1;
        //swap the items.

        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            //terminating condition.
            current = parent(current);
        }


    }

    //remove method.
    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }

        //Getting the firt and last item.
        int maxItem = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return maxItem;

    }

    //SinkDown (Compare parent with its child elements.
    // sinkDown (Compare parent with its child elements)
    private void sinkDown(int index) {
        int maxIndex = index;
        while (true) {
            int leftChildIndex = leftChild(maxIndex);
            int rightChildIndex = rightChild(maxIndex);

            // Find the index of the maximum child
            if (leftChildIndex < heap.size() && heap.get(leftChildIndex) > heap.get(maxIndex)) {
                maxIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
                maxIndex = rightChildIndex;
            }

            // Swap elements if necessary or terminate the loop
            if (index != maxIndex) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }


}


