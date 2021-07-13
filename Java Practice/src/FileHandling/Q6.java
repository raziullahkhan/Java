/*
Write Java program to read input from java console. 
 */
package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args)throws IOException {
         PrintWriter file=new PrintWriter("file1.txt");
         int l=Integer.parseInt(JOptionPane.showInputDialog("How Many Line You Want to Enter: "));
         for(int i=0;i<l;i++){
            file.println(JOptionPane.showInputDialog("Enter Your Line "+(i+1)+": "));
         }
         file.close();
         File f=new File("file1.txt");
         Scanner input=new Scanner(f);
         while(input.hasNext()){
             System.out.println(input.nextLine());
         }
         input.close();
    }
}
