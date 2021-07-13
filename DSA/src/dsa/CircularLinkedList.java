/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;
class CircularLinkedListOperation{
    private Node start;
    public boolean isEmpty(){
        if(start==null)
            return true;
        else
            return false;
    }
    public int getSize(){
        if(isEmpty())
            return 0;
        else{
            Node t=start;
            int c=1;
            do{
               t=t.getNext();
               c++;
            }while(t.getNext()!=start);
            return c;
        }
    }
    public void viewList(){
        if(isEmpty())
            System.out.println("List is Empty!");
        else{
            Node t=start;
            do{
                System.out.print(t.getData()+" ");
                t=t.getNext();
            }while(t!=start);
            System.out.println("");
        }
    }
    public void insertAtFirst(int data){
        Node n=new Node();
        n.setData(data);
        if(isEmpty()){
            start=n;
            n.setNext(n);
        }
        else{
            Node t=start;
            n.setNext(start);
            while(t.getNext()!=start){
                t=t.getNext();
            }
            t.setNext(n);
            start=n;
        }
    }
    public void insertAtLast(int data){
        Node n=new Node();
        n.setData(data);
        if(isEmpty()){
            start=n;
            n.setNext(n);
        }
        else{
            Node t=start;
            do{
               t=t.getNext(); 
            }while(t.getNext()!=start);
            n.setNext(start);
            t.setNext(n);
        }
    }
    public void insertAtPosition(int data,int pos){
        if(pos==1)
            insertAtFirst(data);
        else if(pos==getSize()+1)
            insertAtLast(data);
        else if(pos<=getSize()&&pos>0){
            Node n=new Node();
            n.setData(data);
            Node t=start;
            for(int i=2;i<pos;i++){
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
        }
        else
            System.out.println("Node can not be inserted at given poasition!");
    }
    public void deleteAtFirst(){
        if(isEmpty()){
            System.out.println("List is Empty!");
        }
        else{
            Node t=start;
            do{
               t=t.getNext();
            }while(t.getNext()!=start);
            t.setNext(start.getNext());
            start=t.getNext();
        }
    }
    public void deleteAtLast(){
        if(isEmpty()){
            System.out.println("List is Empty!");
        }
        else{
            Node t=start;
            do{
               t=t.getNext();
            }while(t.getNext().getNext()!=start);
            t.setNext(start);
            //start=t.getNext();
        }
    }
    public void deleteAtPosition(int pos){
        if(pos==1)
            deleteAtFirst();
        else if(pos==getSize()+1)
            deleteAtLast();
        else if(pos<getSize()&&pos>0){
            Node t=start;
            for(int i=2;i<pos;i++){
                t=t.getNext();
            }
            t.setNext(t.getNext().getNext());
        }
        else
            System.out.println("Node can not be deleted at given poasition!");
    }
    public void searchData(int data){
        if(isEmpty())
            System.out.println("List is Empty!");
        else{
            Node t=start;
            int i=1;
            do{
                if(t.getData()==data){
                    System.out.println(data+" found at position at position "+i+"!");
                    return;
                }
                t=t.getNext();
                i++;
            }while(t!=start);
            System.out.println(data+" not found in the list!");
        }
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedListOperation c=new CircularLinkedListOperation();
        c.insertAtFirst(25);
        c.viewList();
        c.insertAtFirst(38);
        c.viewList();
        c.insertAtLast(50);
        c.viewList();
        c.insertAtPosition(100, 2);
        c.viewList();
        c.deleteAtFirst();
        c.viewList();
        c.insertAtLast(150);
        c.insertAtFirst(20);
        c.viewList();
        System.out.println(c.getSize());
        c.deleteAtLast();
        c.viewList();
        c.deleteAtPosition(2);
        c.viewList();
        System.out.println(c.getSize());
        c.searchData(50);
    }
}
