/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;
class SNode{
    private int data;
    private SNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SNode getNext() {
        return next;
    }

    public void setNext(SNode next) {
        this.next = next;
    }
    
}
class LStack{
    SNode top;
    public boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }
    public void push(int data){
        SNode s=new SNode();
        s.setData(data);
        if(isEmpty()){
            top=s;
        }
        else{
            s.setNext(top);
            top=s;
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
        }
        else{
            if(top.getNext()==null){
                top=null;
            }
            else{
                top=top.getNext();
            }
                    
        }
    }
    public int getTop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        return top.getData();
    }
    public int getBottom(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            SNode s=top;
            while(s.getNext()!=null){
                s=s.getNext();
            }
            return s.getData();
        }
    }
    public int peek(int pos){
        SNode s=top;
        int i=1;
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        while(s!=null){
            if(pos==i){
                return s.getData();
            }
            s=s.getNext();
            i++;
        }
        return 0;
    }
}
public class UseStackLinkedList {
    public static void main(String[] args) {
        LStack l=new LStack();
        l.push(5);
        l.push(8);
        l.push(9);
        l.pop();
        System.out.println(l.getTop());
        System.out.println(l.getBottom());
        l.push(18);
        l.push(20);
        l.push(34);
        System.out.println(l.peek(5));
    }
}
