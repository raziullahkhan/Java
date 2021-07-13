
package Java_and1;

import javax.swing.JOptionPane;

public class TheSwitch_Statement {
    public static void main(String[] args) {
        int number;
        String input=JOptionPane.showInputDialog("Please Enter 1, 2 or 3: ");
        number=Integer.parseInt(input);
        switch(number){
            case 1:
                JOptionPane.showMessageDialog(null,"You Entered 1!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"You Entered 2!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"You Entered 3!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"You Entered Wrong Input!");
        }
        char letter;
        input=JOptionPane.showInputDialog("Please Enter a, b or c: ");
        letter=input.charAt(0);
        switch(letter){
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null, "You Entered a!");
                break;
            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null, "You Entered b!");
                break;
            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null, "You Entered c!");
                break;
            default:
                  JOptionPane.showMessageDialog(null, "You Entered Wrong Input!");
        }
        System.exit(0);
    }
}
