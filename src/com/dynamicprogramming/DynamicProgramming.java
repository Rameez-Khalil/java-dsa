package com.dynamicprogramming;

public class DynamicProgramming {
    public static void main(String[] args) {
        int number = 18;
        int[] arr = {7,5,1};
        System.out.println(minCoins(number,arr));
    }

    public static int minCoins(int number, int[] arr) {
        //check to see if we have number as 0
        if (number == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (number - arr[i] >= 0) {
                int subAnswer = minCoins(number - arr[i], arr);
                if(subAnswer+1<ans && subAnswer!=Integer.MAX_VALUE){
                    ans = subAnswer+1;
                }
            }

        }

        return  ans;
    }
}
