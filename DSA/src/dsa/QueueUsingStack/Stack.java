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
public class Stack {
    private int top;
    private int arr[];
    public Stack(int size){
        top=-1;
        arr=new int[size];
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        return false;
    }
    public boolean push(int data){
        if(isFull()){
           return false;
        }
        arr[++top]=data;
        return true;
    }
    public boolean pop(){
        if(isEmpty()){
            return false;
        }
        top--;
        return true;
    }
}
