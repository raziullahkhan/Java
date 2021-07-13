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
public class UseQueue {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(20);
        q.enQueue(25);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
    }
}
