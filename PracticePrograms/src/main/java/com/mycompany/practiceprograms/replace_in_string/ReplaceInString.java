/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practiceprograms.replace_in_string;

import java.util.Scanner;

/**
 *
 * @author Md Raziullah Khan
 */
public class ReplaceInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String: ");
        String s=sc.nextLine();
        System.out.println("Original String: "+s);
        String s2=s.replace('e', 'i');
        System.out.println("Changed String: "+s2);
    }
}

hg