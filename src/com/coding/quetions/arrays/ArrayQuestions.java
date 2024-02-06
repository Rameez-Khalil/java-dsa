package com.coding.quetions.arrays;

import java.util.Arrays;

public class ArrayQuestions {
    //********************REMOVE INPLACE********************//

    /*
        Remove the item in place and return an index.
        Initialize a new index.
        Read every item from the array.
        Check to see if the item is not the item to be removed .i.e arr[i]!=val.
            If true: arr[index] = arr[i]
                     index++;

       Return index.
     */

    public static int removeItem(int[] arr, int val) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }

        return index;
    }

    /*
        Remove the duplicates in place.
        Initialize a temp index at 1.
        Read every item from the array, and check if its not equal to the index before it. arr[i]!=arr[i-1}.
            If true:
                    arr[temp] = arr[i].
                    temp++;

        Return temp;
     */

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        return index;
    }

    //********************MAX AND MIN********************//
    /*
        Initialize the max and min at arr[0]
        for every item getting read, check if its greater/less than the max.
            if(arr[i]<min)-> min =arr[i].
            if(arr[i]>max -> max = arr[i].
     */

    public static int[] minAndMax(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        return new int[]{max, min};
    }

    //*******************LONGEST STRING******************//
    /*
        Initialize the first item as longest.
        Loop through the entire array and perform swap if the currentItem's length is greater than what we have.
        Return the string.
     */

    public static String longestString(String[] arr) {
        if (arr.length == 0) {
            return null;
        }
        String longest = arr[0];
        for (String s : arr) {
            if (!s.isEmpty() && s.length() > longest.length()) {
                longest = s;
            }
        }

        return longest;
    }

    //********************MAX PROFIT**********************//
//    Let's consider an example with the array arr = [7, 1, 5, 3, 6, 4].
        public static int maxProfit(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: arr){
           minPrice = Math.min(minPrice, price);
           int currentProfit = price-minPrice;
           maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
    }


    //*******************MAX SUB ARRAY*******************//

    public static int maxSubArray(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int maxSubArr = arr[0];
        int currentSum = arr[0];

        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i], currentSum+arr[i]);
            maxSubArr = Math.max(currentSum, maxSubArr);
        }

        return  maxSubArr;
    }

    public static int rotateArr(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int currentSum = arr[0];
        int maxSubArr  = arr[0];

        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i], arr[i]+currentSum);
            maxSubArr = Math.max(currentSum,maxSubArr);
        }

        return maxSubArr;
//        arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

    }
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
        if (k < 0) {
            k = k + arr.length;
        }

        //Call reverse 3 times.
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        efficientRotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
