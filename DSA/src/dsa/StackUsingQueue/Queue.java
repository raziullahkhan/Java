/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.StackUsingQueue;

/**
 *
 * @author my pc
 */
public class Queue {
    public int arr[];
    private int front;
    private int rear;
    public Queue(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(front==(rear+1)%arr.length){
            return true;
        }
        return false;
    }
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue Overflow!");
            return;
        }
        if(rear==-1)
            front=rear=0;
        else
            rear=(rear+1)%arr.length;
        arr[rear]=data;
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return -1;
        }
        int temp=arr[front];
        if(front==rear)
            rear=front=-1;
        else{
            front=(front+1)%arr.length;
        }
        return temp;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return;
        }
        int i=front;
        do{
            System.out.print(arr[i]+" ");
            i=(i+1)%arr.length;
        }while(i!=(rear+1)%arr.length);
        System.out.println("");
    }
}
