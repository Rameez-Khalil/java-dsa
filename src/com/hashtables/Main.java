package com.hashtables;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.setMethod(100, "nails");
        ht.setMethod(50, "title");
        ht.setMethod(80, "lumber");
        ht.setMethod(200, "bolts");
        ht.setMethod(140, "screws");
        System.out.println("Get Keys");
        System.out.println(ht.keys());

    }
}
