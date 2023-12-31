package com.basicsorting.insertionsort;

import java.util.Arrays;

public class Insertion {

    /*
        Always start from the second item.
        Check the second item with its previous.
        Compare the above two, if the second is smaller than the first then swap.
     */


    public static void main(String[] args) {
        int[] arr=  {10,20,30,40,5,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>-1 && temp<arr[j]){

                //arr[j] - prev value.
                //arr[j+1]- next value.
                //temp = arr[i] = arr[j+1]

                // swap the two items.
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
