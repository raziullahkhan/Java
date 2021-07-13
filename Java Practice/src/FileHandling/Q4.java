/*
 Write a Java program to compare two files lexicographically
 */
package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Q4 {
    public static void main(String[] args)throws IOException{
       PrintWriter file1=new PrintWriter("file1.txt");
       file1.println("This is line 1!");
       file1.println("This is line 2!");
       file1.close();
       PrintWriter file2=new PrintWriter("file2.txt");
       file2.println("This is line 1!");
       file2.println("This is line 2!");
       file2.close();
       File f1=new File("file1.txt");
       File f2=new File("file2.txt");
       int i=f1.compareTo(f2);
       if(i==0){
           JOptionPane.showMessageDialog(null,"Both Files are Lexicographically Equal!");
       }
       else
            JOptionPane.showMessageDialog(null,"Both Files are Not Lexicographically Equal!");
       i=f1.compareTo(f1);
       if(i==0){
           JOptionPane.showMessageDialog(null,"Both Files are Lexicographically Equal!");
       }
       else
            JOptionPane.showMessageDialog(null,"Both Files are Not Lexicographically Equal!");
       
    }
}
