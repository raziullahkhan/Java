/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPractice;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Prime {
    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num=kb.nextInt();
        for (int i=1;i<=num;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count+=1;
            }
            if(count==2){
                System.out.println(i);
            }
        }
      
    }
}
