package com.basicsorting.selectionsort;

import java.util.Arrays;

public class Selection {

    /*
        1. We start with first item.
        2. We try to find out the index with the lowest value.

        3. Outer loop - start from 0 till the end of the array.
            MinIndex - will be initialized to i.
        4. Inner Loop - start j from i+1 till the length.
            make sure j gets initialized with i+1
            if(jthItem<ithItem) then minIndex = jthIndex.
        5. Once we are out of the inner loop, then for every ith we would've found
        the minValue's index AND if ith value is not equal to the minIndex, then swap.
     */

    public static void main(String[] args) {
        int[] arr = {50,40,40,20};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
