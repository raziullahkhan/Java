
package Loop;

import java.util.Random;
import javax.swing.JOptionPane;


public class Q12 {
    public static void main(String[] args) {
        Random rand=new Random();
        int num=rand.nextInt(1000);
        int input;
        do{
            input=Integer.parseInt(JOptionPane.showInputDialog("Guess The Number: "));
            if(input<num)
                JOptionPane.showMessageDialog(null, "You Entered Less Than The Number!");
            else if(input>num)
                JOptionPane.showMessageDialog(null, "You Entered More Than The Number!");
            else
                JOptionPane.showMessageDialog(null, "You Guessed The Number!");
        }while(num!=input);
    }
}
