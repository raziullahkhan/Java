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
public class UseDEQueue {
    public static void main(String[] args) {
        DEQueue dq=new DEQueue(5);
        dq.enQueueFront(10);
        dq.enQueueRear(20);
        dq.enQueueFront(30);
        dq.enQueueRear(40);
        dq.enQueueFront(50);
        dq.deQueueFront();
        dq.deQueueRear();
        dq.deQueueFront();
       /* dq.enQueueRear(30);
        dq.enQueueRear(40);
        dq.enQueueRear(50);*/
        dq.displayFront();
        dq.displayRear();
    }
}
