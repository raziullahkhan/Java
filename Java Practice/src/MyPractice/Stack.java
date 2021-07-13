package MyPractice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my pc
 */
public class Stack {
    int arr[];
    int head;
    public Stack(int data){
        arr=new int[data];
        head=-1;
    }
    public void push(int data){
        if(head>=arr.length-1){
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++head]=data;
    }
    public int pop(){
        if(head==-1){
            System.out.println("Stack Underflow!");
            return -1;
        }
        int m=arr[head];
        head--;
        return m;
    }
}
