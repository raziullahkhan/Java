/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPractice;

/**
 *
 * @author HP
 */
public class Queue {
   Stack s;
   public Queue(int data){
       s=new Stack(data);
   }
   public boolean isEmpty(){
       if(s.head==-1){
           return true;
       }
       return false;
   }
   public boolean isFull(){
       if(s.head>=s.arr.length-1){
           return true;
       }
       return false;
   }
   public void enQueue(int data){
       if(isFull()){
           System.out.println("Queue Overflow!");
           return;
       }
       s.push(data);
       System.out.println(data+" enQueued");
   }
   public int deQueue(){
       if(isEmpty()){
           System.out.println("Queue Underflow!");
           return -1;
       }
       Stack n=new Stack(s.arr.length);
       while(!isEmpty()){
           n.push(s.pop());    
       }
       int m=n.pop();
       while(n.head!=-1){
           s.push(n.pop());
       }
       return m;
   }
   public int peek(){
       if(isEmpty()){
           System.out.println("Queue Underflow!");
           return -1;
       }
       return s.arr[0];
   }
}
