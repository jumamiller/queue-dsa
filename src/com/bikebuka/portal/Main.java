package com.bikebuka.portal;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(7);
        queue.enqueue(6);

        queue.display();

        queue.dequeue();
        queue.display();
    }
}
