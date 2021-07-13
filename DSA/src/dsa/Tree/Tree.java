/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Tree;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
public class Tree {
    Scanner kb=new Scanner(System.in);
    public Node create(int data){
        Node n=new Node();
        n.setData(data);
        return n;
    }
    public Node createTree(){
        int x;
        Node n=new Node();
        System.out.print("Enter data(-1 for no node): ");
        x=kb.nextInt();
        if(x==-1){
            return null;
        }
        n.setData(x);
        System.out.print("Enter left child of "+x+": ");
        n.setLeft(createTree());
        System.out.print("Enter right child of "+x+": ");
        n.setRight(createTree());
        return n;
    }
    public void inOrderTraversal(Node n){
        if(n!=null){
            inOrderTraversal(n.getLeft());
            System.out.print(n.getData()+" ");
            inOrderTraversal(n.getRight());
        }
    }  
    public void preOrderTraversal(Node n){
        if(n!=null){
            System.out.print(n.getData()+" ");
            preOrderTraversal(n.getLeft());
            preOrderTraversal(n.getRight());
        }
    }
    public void postOrderTraversal(Node n){
        if(n!=null){
            postOrderTraversal(n.getLeft());
            postOrderTraversal(n.getRight());
            System.out.print(n.getData()+" ");
        }
    }
}
