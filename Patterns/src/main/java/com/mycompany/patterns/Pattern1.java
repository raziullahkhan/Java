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
public class Pattern1 {
    public static void main(String[] args) {
        int n=4,m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
