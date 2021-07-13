/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.CircularQueue;

/**
 *
 * @author HP
 */
public class UseCircuarQueue {
    public static void main(String[] args) {
        Queue q=new Queue(25);
        q.deQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.display();
        int e=q.deQueue();
        if(e!=-1){
            System.out.println(e+" Deleted!");
        }
        q.display();
        q.enQueue(7);
        q.display();
        q.enQueue(8);
    }
}
