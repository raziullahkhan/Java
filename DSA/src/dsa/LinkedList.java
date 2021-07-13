/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author HP
 */
class Node{
    private int data;
    private Node next;
    public Node(){
        data=0;
        next=null;
    }
    public Node(int d,Node n){
        data=d;
        next=n;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedListOperation{
    private int size;
    private Node start;
    public LinkedListOperation(){
        size=0;
        start=null;
    }
    public boolean isEmpty(){
        if(start==null){
            return true;
        }
        else{
            return false;
        }
    }
    public int getListSize(){
        return size;
    }
    public void viewList(){
        Node t;
        if(isEmpty()){
            System.out.println("List is empty!");
        }
        else{
            t=start;
            for(int i=1;i<=size;i++){
                System.out.print(t.getData()+" ");
                t=t.getNext();
            }
            System.out.println("");
        }
    }
    public void insertAtFirst(int val){
        Node n;
        n=new Node();
        n.setData(val);
        n.setNext(start);
        start=n;
        size++;
    }
    public void insertAtLast(int val){
        Node n,t;
        n=new Node();
        n.setData(val);
        t=start;
        if(t==null)
            start=n;
        else{
            while(t.getNext()!=null){
                t=t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }
    public void insertAtPos(int val,int pos){
        if(pos==1)
            insertAtFirst(val);
        else if(pos==size+1)
            insertAtLast(val);
        else if(pos>1&&pos<=size){
            Node n,t;
            n=new Node(val,null);
            t=start;
            for(int i=0;i<pos-1;i++){
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else
            System.out.println("Insertion not possible at position "+pos);
    }
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List is already empty!");
        }
        else{
            start=start.getNext();
            size--;
        }
    }
    public void deleteLast(){
        Node n;
        n=start;
        if(isEmpty()){
            System.out.println("List is already empty!");
        }
        else if(start.getNext()==null){
            start.setNext(null);
            size--;
        }
        else{
           for(int i=1;i<size-1;i++)
               n=n.getNext();
           n.setNext(null);
           size--;
        }
    }
    public void deleteAtPosition(int pos){
        if(start==null)
            System.out.println("List is already empty!");
        else if(pos<1||pos>size)
            System.out.println("Invalid position!");
        else if(pos==1)
            deleteFirst();
        else if(pos==size)
            deleteLast();
        else{
            Node t,t1;
            t=start;
            for(int i=0;i<pos-1;i++){
                t=t.getNext();
            }
            t1=t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
    public void searchData(int data){
        if(isEmpty()){
            System.out.println("List is empty!");
        }
        else{
            Node t=start;
            for(int i=1;t.getNext()!=null;i++){
                if(t.getData()==data){
                    System.out.println(data+" found at position "+i+"!");
                    return;
                }
                t=t.getNext();
            }
            System.out.println(data+" not found in the list!");
        }
    }
}

public class LinkedList {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       LinkedListOperation list=new LinkedListOperation();
       boolean flag=true;
       while(flag){
        System.out.println("1. Add item to the list at start");
        System.out.println("2. Add item to the list at last");
        System.out.println("3. Add item to the list at position");
        System.out.println("4. Delete first item from list");
        System.out.println("5. Delete last item from list");
        System.out.println("6. Delete item from the list with given position");
        System.out.println("0. Search item from the list");
        System.out.println("7. View List");
           System.out.println("8. Exit");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        int pos;
        int value;
        switch(choice){
            case 0:
                System.out.println("Enter data:");
                value=sc.nextInt();
                list.searchData(value);
                break;
            case 1:
                System.out.println("Enter Value: ");
                value=sc.nextInt();
                list.insertAtFirst(value);
                break;
            case 2:
                System.out.println("Enter Value: ");
                value=sc.nextInt();
                list.insertAtLast(value);
                break;
            case 3:
                System.out.println("Enter Position: ");
                pos=sc.nextInt();
                System.out.println("Enter Value: ");
                value=sc.nextInt();
                list.insertAtPos(value, pos);
                break;
            case 4:
                list.deleteFirst();
                break;
            case 5:
                list.deleteLast();
                break;
            case 6:
                System.out.println("Enter position: ");
                pos=sc.nextInt();
                list.deleteAtPosition(pos);
                break;
            case 7:
                  list.viewList();
                  break;
            case 8:
                  flag=false;
                  break;
            default:
                System.out.println("Invalid Choice!");
        }
       }
      
    }
}

