package com.coding.quetions.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {

    //KTH SMALLEST AND LARGEST.

    /*
        For kth smallest.

     */

    public static int kthSmallestElement(int[] numbers, int k) {
        //Read each value and store inside of a max heap.

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int number : numbers) {
            maxHeap.offer(number);

            //Check to see if we cross the size, if so then remove.
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        if (maxHeap.peek() != null) {
            return maxHeap.peek();

        }
        return 0;
    }


    public int kthLargestElement(int[] numbers, int k){
        //Read each element.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int number : numbers){
            minHeap.offer(number);

            //maintain the size.
            if(minHeap.size()>k){
                minHeap.poll();
            }


        }

        if(minHeap.peek()!=null){
            return minHeap.peek();
        }

        return 0;
    }
}
