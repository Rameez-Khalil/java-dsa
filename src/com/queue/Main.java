package com.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.printQueue();
        queue.getFirst();
        queue.getLast();
        queue.getSize();
    }
}
