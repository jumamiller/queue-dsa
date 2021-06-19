package com.bikebuka.portal;

public class Queue {
    int SIZE=5;
    int[] items =new int[SIZE];
    int front,rear;

    Queue(){
        front=rear=0;
    }
    // check if the queue is full
    boolean isFull(){
        if(rear==SIZE){
            return true;
        }
        return false;
    }
    // check if the queue is empty
    boolean isEmpty(){
        if(front==rear){
            return true;
        }
        else {
            return false;
        }
    }
    void enqueue(int element){
        if(isFull()){
            System.out.println("The queue is full");
        }
        else{
            if(front==0){
                items[rear]=element;
                rear++;
                System.out.println("Inserted "+ element);
            }
        }
    }
    int dequeue(){
        int element;
        if(isEmpty()){
            System.out.println("The queue is empty");
            return (-1);
        }
        else{
            element=items[front];
            if(front>=rear){
                front=rear=-1;
            }
            else {
                front++;
            }
            System.out.println("Deleted element:"+ element);
            return (element);
        }
    }
    //display queue
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("The queue is empty");
        }else {
            System.out.println("\nFront element->"+ front);
            System.out.println("Items");
            for (i=front;i<=rear;i++){
                System.out.println(items[i]);
            }
            System.out.println("\nRear index->"+rear);
        }
    }
}
