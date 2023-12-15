package com.stack;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(4);
        st.getTop();
        st.getHeight();
        st.printStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Printing after pushing 10,20,30");
        st.printStack();

        st.pop();
        System.out.println("Printing after removing ");
        st.printStack();


    }
}
