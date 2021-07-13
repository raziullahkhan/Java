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
public class Stack {
    public Queue q1;
    private Queue q2;
    public Stack(int size){
        q1=new Queue(size);
        q2=new Queue(size);
    }
    public void push(int data){
        if(q1.isFull()){
            System.out.println("Stack Overflow!");
            return;
        }
        if(q1.isEmpty()){
            q1.enQueue(data);
            System.out.println(data+" inserted!");
            return;
        }
        int temp;
        while(!q1.isEmpty()){
            temp=q1.deQueue();
            q2.enQueue(temp);
        }
        q1.enQueue(data);
        while(!q2.isEmpty()){
            temp=q2.deQueue();
            q1.enQueue(temp);
        }
        System.out.println(data+" inserted!");
    }
    public int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack Underflow!");
            return -1;
        }
        return q1.deQueue(); 
    }
    public void show(){
        q1.display();
    }
}
