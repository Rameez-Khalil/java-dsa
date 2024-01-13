package com.coding.quetions.stack;

import java.util.Stack;

public class StackCoding {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    //Reverse a string.
    /*
        Initialize an empty stack.
        Read every character from the provided string.
        Push every character from the string into the stack using push method.
        Pop every character from the string into a new string.
        Return the new string.
     */

    public static String reverseString(String s){
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        if(s.isEmpty()){
            return " ";
        }
        for(char c: s.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();

    }

    
}
