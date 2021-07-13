

package dsa;
class StackArray{
    int top;
    int[] arr;
    public StackArray(int size){
        arr=new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(top==arr.length-1)
            return true;
        else
            return false;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow!");
        }
        else{
            arr[++top]=data;
            System.out.println("Data inserted!");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            int val=arr[top--];
            return val;
        }
    }
    public int peek(int pos){
        if(top-pos+1<0){
            System.out.println("Invalid Position");
            return -1;
        }
        else{
            return arr[top-pos+1];
        }
    }
    public int getTop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            return arr[top];
        }
    }
    public int getBottom(){
     if(isEmpty()){
         System.out.println("Stack Underflow!");
         return 0;
     }
     else{
         return arr[0];
     }
    }
}
public class UseStackArray {
    public static void main(String[] args) {
        StackArray s=new StackArray(10);
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.pop());
        System.out.println(s.peek(1));
        System.out.println(s.getTop());
        System.out.println(s.getBottom());
    }
}
