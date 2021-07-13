/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.QueueLinkedList;

/**
 *
 * @author HP
 */
public class Queue {
    private Node front;
    private Node rear;
    public Queue(){
        front=rear=null;
    }
    public boolean isEmpty(){
        if(rear==null||front==null){
            return true;
        }
        return false;
    }
    public void enQueue(int data){
        Node n=new Node(data);
        if(isEmpty()){
            rear=n;
            front=n;
            System.out.println(data+" inserted in Queue!");
            return;
        }
        rear.setNext(n);
        rear=n;
        System.out.println(data+" inserted in Queue!");
    }
    public int deQueue(){
        if(isEmpty()){
            return -1;
        }
        Node t=front;
        front=front.getNext();
        if(front==null){
            rear=null;
        }
        return t.getData();
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue Underflow!");
            return;
        }
        Node t=front;
        do{
            System.out.print(t.getData()+" ");
            t=t.getNext();
        }while(t!=null);
        System.out.println();
    }
}
