/*
 Write a Java program to get last modified time of a file
 */
package FileHandling;

import java.io.File;
import javax.swing.JOptionPane;


public class Q5 {
    public static void main(String[] args) {
        File file=new File("file1.txt");
        long l=file.lastModified();
        JOptionPane.showMessageDialog(null, "File Last Modified On "+l);
        file.
    }
}
