package com.mycompany.patterns;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raziu
 */
public class Pattern2 {
    public static void main(String[] args) {
        int n=4,m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
