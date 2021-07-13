/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.DoubleEndedQueue;

/**
 *
 * @author HP
 */
public class DEQueue {
    private int arr[];
    private int front;
    private int rear;
    public DEQueue(int size){
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
        if((front==0 && rear==arr.length-1)||(front==rear+1)){
            return true;
        }
        return false;
    }
    public void enQueueFront(int data){
        if(isFull()){
            System.out.println("Queue Overflow!");
            return;
        }
        if(front==-1){
            front=rear=0;
        }
        else if(front==0){
            front=arr.length-1;
        }
        else{
            front--;
        }
        arr[front]=data;
        System.out.println(data+" inserted at front!");
    }
    public void enQueueRear(int data){
        if(isFull()){
            System.out.println("Queue Overflow!");
            return;
        }
        if(rear==-1){
            rear=front=0;
        }
        else if(rear==arr.length-1){
            rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=data;
        System.out.println(data+" inserted at rear!");
    }
    public void deQueueFront(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(arr[front]+" deleted from front!");
        if(rear==front){
            rear=front=-1;
        }
        else if(front==arr.length-1){
            front=0;
        }
        else{
            front++;
        }
    }
    public void deQueueRear(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(arr[rear]+" deleted from rear!");
        if(rear==front)
            front=rear=-1;
        else if(rear==0)
            rear=arr.length-1;
        else
            rear--;
    }
    public void displayFront(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return;
        }
        int i=front;
        do{
            System.out.print(arr[i]+" ");
            i=(i+1)%arr.length;
        }while(i!=(rear+1)%arr.length);
        System.out.println("");
    }
    public void displayRear(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return;
        }
        int i=rear;
        do{
            System.out.print(arr[i]+" ");
            i=(i-1)%arr.length;
        }while(i!=(front-1)%arr.length);
        System.out.println("");
    }
}
