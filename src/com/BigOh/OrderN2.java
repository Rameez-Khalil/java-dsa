package com.BigOh;

public class OrderN2 {
    public static void main(String[] args) {
    N2(10);

    }


    //This is O(N2).
    public static void N2(int number){
        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
