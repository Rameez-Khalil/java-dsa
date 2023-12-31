package com.basicsorting.bubblesort;

import java.util.Arrays;

public class Bubble {

    /*
        Pick the first item and then compare it with its consecutive/the entire array.
        Pick the largest item, and bubble that to the top.
        Decrease the length by 1, after each successful attempt.

        O(n*n).

        1st loop - Assign the length for each iteration.
        2nd loop - Check two consecutive items within the outer range.

     */

    public static void main(String[] args) {

        int [] arr = {50,30,20,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
