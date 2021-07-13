
package dsa;

class Node2{
    private int data;
    private Node2 next;
    private Node2 prev;

    public Node2() {
    }

    public Node2(int data, Node2 next, Node2 prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public Node2 getPrev() {
        return prev;
    }

    public void setPrev(Node2 prev) {
        this.prev = prev;
    }
    
}
class Doubly{
    Node2 head;
    Node2 tail;
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public int getSize(){
        if(isEmpty()){
            return 0;
        }
        else{
            Node2 t=head;
            int i;
            for(i=0;t!=null;i++){
                t=t.getNext();
            }
            return i;
        }
    }
    public void viewForward(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            Node2 t=head;
            while(t!=null){
                System.out.print(t.getData()+" ");
                t=t.getNext();
            }
            System.out.println("");
        }
    }
    public void viewBackward(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            Node2 t=tail;
            while(t!=null){
                System.out.print(t.getData()+" ");
                t=t.getPrev();
            }
            System.out.println("");
        }
    }
    public void insertAtFirst(int data){
        if(isEmpty()){
            Node2 n=new Node2();
            n.setData(data);
            n.setNext(null);
            n.setPrev(null);
            head=n;
            tail=n;
        }
        else{
            Node2 t;
            Node2 n=new Node2();
            n.setData(data);
            n.setNext(head);        
            n.setPrev(null);
            head.setPrev(n);
            head=n;
        }
    }
    public void insertAtLast(int data){
        Node2 n=new Node2();
        n.setData(data);
        if(isEmpty()){
            n.setPrev(null);
            n.setNext(null);
            head=n;
            tail=n;
        }
        else{
            n.setPrev(tail);
            n.setNext(null);
            tail.setNext(n);
            tail=n;
        }
    }
    public void insertAtPosition(int data,int pos){
        if(pos==1){
            insertAtFirst(data);
        }
        else if (pos==getSize()+1){
            insertAtLast(data);
        }
        else if(pos<=getSize()&&pos>0){
            Node2 n=new Node2();
            n.setData(data);
            Node2 t=head;
            for(int i=1;i<pos-1;i++){
                t=t.getNext();
            }
            n.setPrev(t);
            n.setNext(t.getNext());
            t.getNext().setPrev(n);
            t.setNext(n);
        }
        else{
            System.out.println("Data can not be inserted at given position!");
        }
    }
    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List is empty already!");
        }
        else{
            head=head.getNext();
            head.setPrev(null);
        }
    }
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("List is already empty!");
        }
        else{
            tail=tail.getPrev();
            tail.setNext(null);
        }
    }
    public void deleteAtPosition(int pos){
        if(pos==1){
            deleteFirst();
        }
        else if(pos==getSize()){
            deleteLast();
        }
        else if(pos>0&&pos<getSize()){
            Node2 t=head;
            for(int i=1;i<pos;i++){
                t=t.getNext();
            }
            t.getPrev().setNext(t.getNext());
            t.getNext().setPrev(t.getPrev());
        }
    }
    public void searchData(int data){
        if(isEmpty())
            System.out.println("List is empty!");
        else{
            Node2 t=head;
            int c=1;
            while(t!=null){
                if(t.getData()==data){
                    System.out.println(data+" is found at position "+c+"!");
                    return;
                }
                t=t.getNext();
                c++;
            }
            System.out.println(data+" is not found in the list!");
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Doubly d=new Doubly();
        d.deleteFirst();
        d.insertAtLast(5);
        d.insertAtFirst(25);
        d.insertAtFirst(50);
        d.insertAtLast(75);
        d.insertAtPosition(6,3);
        d.viewForward();
        d.deleteAtPosition(4);
        System.out.println(d.getSize());
        d.viewBackward();
        d.searchData(500);
    }
}
