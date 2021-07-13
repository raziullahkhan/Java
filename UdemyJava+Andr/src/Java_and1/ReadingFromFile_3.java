
package Java_and1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ReadingFromFile_3 {
    public static void main(String[] args) throws IOException{
        int sum=0;
        int count=0;
        double average;
        File file=new File("Output.txt");
        if(file.exists()){
            Scanner inputFile=new Scanner(file);
            while(inputFile.hasNext()){
                sum=sum+inputFile.nextInt();
                count++;
            }
            inputFile.close();
            average=(double)sum/count;
            JOptionPane.showMessageDialog(null,"Sum is "+sum+"!\nThe Average is "+average+"!");
        }
        else
            JOptionPane.showMessageDialog(null, "The File "+file+" Does Not Exists");
    }
}
