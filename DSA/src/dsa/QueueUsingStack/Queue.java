/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.QueueUsingStack;

/**
 *
 * @author HP
 */
public class Queue {
    private Stack s1;
    private Stack s2;
    public Queue(int size){
        s1=new Stack(size);
        s2=new Stack(size);
    }
    public boolean isEmpty(){
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(s1.isFull()){
            return true;
        }
        return false;
    }
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue Overflow!");
            return;
        }
        s1.push(data);
        System.out.println(data+" inserted!");
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.getArr()[s1.getTop()]);
            s1.pop();
        }
        int p=s2.getArr()[s2.getTop()];
        s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.getArr()[s2.getTop()]);
            s2.pop();
        }
        System.out.println(p+" deleted!");
        return p;
    }
}
