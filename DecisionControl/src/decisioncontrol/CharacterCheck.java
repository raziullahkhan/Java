/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisioncontrol;

import java.util.Scanner;

class CharacterCheck {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter any Character: ");
        String str=kb.next();
        char ch=str.charAt(0);
        if(ch>64&&ch<91)
            System.out.println("Upper Case Letter");
        else if(ch>96&&ch<123)
            System.out.println("Lower Case Letter");
        else if(ch>47&&ch<58)
            System.out.println("Number");
        else if((ch>=0&&ch<48)||(ch>57&&ch<65)||(ch>90&&ch<96)||(ch>122&&ch<=127))
            System.out.println("Special Symbol");
        else
            System.out.println("Invalid!");
    }
}
