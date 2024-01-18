package com.coding.quetions.arrays;

import java.util.Arrays;

public class ArrayQuestions {
    //********************ROTATE**************************//

    //LEFT ROTATION BY 1.
            /*
                Pick the first item and store it inside the temp.
                Read the loop from i-1 till the end and in every step=> a[i-1]=a[i].
                At the end just assign temp value to the end.
             */
    public static void rotateOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    //ROTATE FUNCTION
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;  //this will ensure we don't repeat ourselves.
        if (k < 0) {
            k = k + arr.length; //this will right rotate the array.
        }

        for (int i = 1; i <= k; i++) {
            rotateOne(arr);
        }
    }



    ///EFFICIENT ROTATE.
    //We will reverse the array 3 times.
    //The first portion, the second portion and at the end the entire array.
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void efficientRotate(int[] arr, int k) {
        k = k % arr.length;
        if(k<0){
            k = k+ arr.length;
        }

        //Call reverse 3 times.
        reverse(arr, 0,k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        efficientRotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
