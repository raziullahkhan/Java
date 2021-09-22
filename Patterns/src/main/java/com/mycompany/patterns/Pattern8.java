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
public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+++" ");
            }
            System.out.println("");
        }
            
        }
    }
