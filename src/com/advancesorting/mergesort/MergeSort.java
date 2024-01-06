package com.advancesorting.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int combinedIndex = 0;
        int i = 0;
        int j = 0;

        //This while loop will only run until one of these arrays is empty.
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[combinedIndex] = arr1[i];
                combinedIndex++;
                i++;
            } else {
                combined[combinedIndex] = arr2[j];
                combinedIndex++;
                j++;
            }
        }

        while (i<arr1.length){
            combined[combinedIndex] = arr1[i];
            combinedIndex++;
            i++;
        }
        while (j<arr2.length){
            combined[combinedIndex] = arr2[j];
            combinedIndex++;
            j++;
        }

        return combined;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,7,8};
        int[] arr2 = {2,4,5,6};

        System.out.println(Arrays.toString(mergeSort(arr1,arr2)));

    }
}
