
package Java_and1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ReadingFromFile_2 {
    public static void main(String[] args)throws IOException {
        File file=new File("Output.txt");
        if(file.exists()){
            Scanner inputFile=new Scanner(file);
            while(inputFile.hasNext()){
                System.out.println(inputFile.nextLine());
            }
            inputFile.close();
        }
        else
            JOptionPane.showMessageDialog(null,"The File "+file+" Does Not Found");
    }
}
