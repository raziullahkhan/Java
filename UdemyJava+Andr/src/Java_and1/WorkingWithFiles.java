
package Java_and1;

import java.io.IOException;
import java.io.PrintWriter;

public class WorkingWithFiles {
    public static void main(String[] args) throws IOException{
        //create the file and open the file
        //if the file exist it will replace the file
        PrintWriter outputFile=new PrintWriter("Output.txt");
        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("THis is line 3");
        outputFile.close();
    }
}
