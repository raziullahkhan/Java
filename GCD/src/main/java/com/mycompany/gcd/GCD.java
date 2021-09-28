/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gcd;

import java.util.Scanner;

/**
 *
 * @author raziullah
 */
public class GCD {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is "+findGCD(a,b)+".");
    }
    private static int findGCD(int a,int b){
        int divisor;
        int dividend;
        int remainder;
        if(a<b){
            divisor=a;
            dividend=b;
        }else{
            divisor=b;
            dividend=a;
        }
        do{
            remainder=dividend%divisor;
            if(remainder==0){
                break;
            }
            dividend=divisor;
            divisor=remainder;
        }while(true);
        return divisor;
    }
}
