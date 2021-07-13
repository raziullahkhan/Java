/*
Write a Java program to check if given pathname is a directory or a file
 */
package FileHandling;

import java.io.File;

public class Q3 {
    public static void main(String[] args) {
        File file=new File("D:\\Photos\\Wallpaper\\BABY");
        if(file.isDirectory())
        System.out.println("It is Directory!");
        else
        System.out.println("It is File!");
        File file2=new File("D:\\Photos\\Wallpaper\\BABY\\Picture 1435");
        if(file2.isDirectory())
        System.out.println("It is Directory!");
        else
        System.out.println("It is File!");
        file.
    }
}
