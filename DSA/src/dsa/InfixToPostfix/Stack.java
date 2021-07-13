/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.InfixToPostfix;

public class Stack {
    private char [] arr;
    private int top;
    public Stack(int size){
        arr=new char[size];
        top=-1;
    }

    public char[] getArr() {
        return arr;
    }

    public void setArr(char[] arr) {
        this.arr = arr;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
    public boolean isEmpty(){
        if(top<0){
            return true;
        }
        return false;
    }
    public void push(char data){
        arr[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            return 0;
        }
        top--;
        return 1;
    }
    public char getHead(){
        if(isEmpty()){
            return 'n';
        }
        return arr[top];
    }
}
