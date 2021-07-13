/*
Write a Java Program to get a list of all file/directory names from the given
 */
package FileHandling;

import java.io.File;
import javax.swing.JOptionPane;


public class Q1 {
    public static void main(String[] args) {
        File file=new File("D:\\Videos");
        if(file.exists()){
            String[] fileList=file.list();
            for(String name:fileList){
                System.out.println(name);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "File is not Found!");
        }
    }
}
