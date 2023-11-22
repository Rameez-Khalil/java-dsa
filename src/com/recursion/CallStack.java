package com.recursion;

public class CallStack {

    /*
    Call stack is nothing rather than a can of tennis balls.
    LIFO principle gets followed.

     */

    public static void methodThree() {
        System.out.println("Method3");
    }

    public static void methodTwo() {
        methodThree();
        System.out.println("Method2");
    }

    public static void methodOne() {
        methodTwo();
        System.out.println("Methodone");
    }

    public static void main(String[] args) {
        methodOne();
    }
}
