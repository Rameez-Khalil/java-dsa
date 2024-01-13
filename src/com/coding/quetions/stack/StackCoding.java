package com.coding.quetions.stack;

import java.util.Stack;

public class StackCoding {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        System.out.println(isValidParenthesis("()"));
        System.out.println(isValidParenthesis("()()["));
    }

    //Reverse a string.
    /*
        Initialize an empty stack.
        Read every character from the provided string.
        Push every character from the string into the stack using push method.
        Pop every character from the string into a new string.
        Return the new string.
     */

    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        if (s.isEmpty()) {
            return " ";
        }
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();

    }

    //Stack balanced parenthesis.
        /*
            Initialize an empty character stack.
            Read every item from the string and push it into the stack as long as it's an opening bracket.
            If we encounter a closing bracket, then we must apply peek function to see if a corresponding opening
            bracket was pushed, if not then we must return false.
            If we were successfully able to pop all the elements from the stack then it means it was a valid string.
         */
    public static boolean isValidParenthesis(String s){
        Stack<Character> stack = new Stack<Character>();
        if(s.isEmpty()){
            return false;
        }
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                    stack.push(ch);
            }
            else if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(ch==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else{
                return false;
            }
        }

        return stack.isEmpty();
    }


}
