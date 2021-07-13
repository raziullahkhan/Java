/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.CircularQueue;


public class Queue {
   private int arr[];
   private int size;
   private int front;
   private int rear;
   public Queue(int size){
       this.size=size;
       arr=new int[size];
       front=-1;
       rear=-1;
   }
   public boolean isEmpty(){
       if(front==-1)
           return true;
       else
           return false;
   }
   public boolean isFull(){
       if(front==0&&rear==size-1){
           return true;
       }
       if(front==rear+1){
           return true;
       }
       return false;
   }
   public void enQueue(int data){
       if(isFull()){
           System.out.println("Queue Overflow!");
       }
       else{
           if(front==-1)
               front=0;
           rear=(rear+1)%size;
           arr[rear]=data;
           System.out.println(data+" Inserted");
       }
   }
   public int deQueue(){
       int data;
       if(isEmpty()){
           System.out.println("Queue Underflow!");
           return -1;
       }
       else{
           data=arr[front];
           if(front==rear){
               front=-1;
               rear=-1;
           }
           else{
               front=(front+1)%size;
           }
           return data;
       }
   }
   public void display(){
       if(isEmpty()){
           System.out.println("Queue Underflow!");
       }
       else{
           for(int i=front;i!=rear;i=(i+1)%size){
               System.out.println(arr[i]+" ");
           }
       }
   }
}
