package com.hashtables;

import java.util.HashMap;

public class InterviewQuestion {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40};
        int [] arr2 = {10,50,60,70};
        System.out.println(itemsInCommon(arr1,arr2));

    }

    public static boolean itemsInCommon(int [] arr1, int[] arr2){
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
        for(int i:arr1){
            hm.put(i, true);
        }

        for(int j: arr2){
            if(hm.get(j)!=null) {
//                System.out.println(hm.get(j));
                return true;
            }
        }
        return false;
    }
}



