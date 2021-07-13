/*
 Write a Java program to check if a file or directory has read and write permission
 */
package FileHandling;

import java.io.File;

public class Q2 {
    public static void main(String[] args) {
        File file=new File("D:\\Photos\\Wallpaper\\BABY\\Picture 1435.jpg");
        if(file.exists()){
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
        }
        else{
            System.out.println("File Not Found!");
        }
    }
 
}
