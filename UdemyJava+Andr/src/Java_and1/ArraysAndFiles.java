
package Java_and1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ArraysAndFiles {
    public static void main(String[] args) throws IOException{
        int [] values=new int[10];
        int i=0;
        File file =new File("E:\\Java\\Core Java\\Program\\UdemyJava+Andr\\src\\Java_and1\\File.txt");
        if(file.exists()){
            Scanner inputFile=new Scanner(file);
            while(inputFile.hasNext()&&i<values.length){
                values[i]=inputFile.nextInt();
                i++;
            }
            inputFile.close();
            for(int value:values){
                System.out.println(value);
            }
        }
    }
}
