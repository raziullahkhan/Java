/*
Write a Java program to get file size in bytes, kb, mb
 */
package FileHandling;

import java.io.File;
import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] args) {
        File file=new File("file1.txt");
        long b=file.length();
        double kb=b/1024.0;
        double mb=kb/1024.0;
        JOptionPane.showMessageDialog(null, "Size in Bytes = "+b);
        JOptionPane.showMessageDialog(null, "Size in Kilo Bytes = "+kb);
        JOptionPane.showMessageDialog(null, "Size in Mega Bytes = "+mb);
    }
}
