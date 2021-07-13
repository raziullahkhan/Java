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
public class UseQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(20);
        q.enQueue(25);
        q.enQueue(30);
        q.display();
        int n=q.deQueue();
        if(n!=-1){
            System.out.println(n+" deleted!");
        }
        q.display();
    }
}
