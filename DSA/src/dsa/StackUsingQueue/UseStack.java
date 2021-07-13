/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.StackUsingQueue;

/**
 *
 * @author my pc
 */
public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(35);
        int n=s.pop();
        if(n!=-1){
            System.out.println(n+" deleted!");
        }
        s.show();
    }
}
