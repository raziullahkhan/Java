/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patterns;

/**
 *
 * @author raziu
 */
public class Pattern12 {
    public static void main(String[] args) {
        int n=5,m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(" ");
            }
            for(int j=i;j>1;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
            m=m-1;
        }
    }
}
