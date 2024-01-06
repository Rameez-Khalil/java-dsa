package com.trees;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinaryTree bs = new BinaryTree();
        bs.insert(47);
        bs.insert(21);
        bs.insert(76);
        bs.insert(18);
        bs.insert(27);
        bs.insert(52);
        bs.insert(82);

        //sout the value.
        System.out.println(bs.BFS());
        System.out.println(bs.preOrdder());


    }
}
