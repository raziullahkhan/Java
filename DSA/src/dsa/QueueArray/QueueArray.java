/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.QueueArray;

/**
 *
 * @author HP
 */
class Queue{
    private int arr[];
    private int front;
    private int rear;
    public Queue(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        if(front==rear){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(rear>=arr.length-1){
            return true;
        }
        return false;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue Overflow!");
            return;
        }
        arr[++rear]=data;
        System.out.println("Data Inserted!");
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return 0;
        }
        front++;
        return arr[front];
    }
    public void display(){
       if(isEmpty()){
           System.out.println("Queue Underflow!");
           return;
       }
       for(int i=front+1;i<=rear;i++){
           System.out.println(arr[i]+" ");
       }
    }
}
public class QueueArray {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(25);
        q.enqueue(30);
        q.enqueue(35);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("new");
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
    }
}
