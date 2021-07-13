/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Tree;

/**
 *
 * @author my pc
 */
public class UseTree {
    public static void main(String[] args) {
        /*Node n7,n1,n2,n3,n4,n5,n6;
        Tree t=new Tree();
        n1=t.create(5);
        n2=t.create(10);
        n3=t.create(15);
        n4=t.create(20);
        n5=t.create(25);
        n6=t.create(30);
        n7=t.create(35);
        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);*/
        
        Node n;
        Tree t=new Tree();
        n=t.createTree();
        System.out.print("PreOrder: ");
        t.preOrderTraversal(n);
        System.out.println("");
        System.out.print("InOrder: ");
        t.inOrderTraversal(n);
        System.out.println("");
        System.out.print("PostOrder: ");
        t.postOrderTraversal(n);
    }
}
