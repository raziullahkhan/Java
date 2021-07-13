
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q11 {
    public static void main(String[] args) {
        char ch;
        ch=JOptionPane.showInputDialog("Enter Any Alphabet: ").charAt(0);
        if(ch>=65&&ch<=90)
            JOptionPane.showMessageDialog(null, "You Entered UpperCase Alphabet....");
        else if(ch>=97&&ch<=122)
            JOptionPane.showMessageDialog(null, "You Entered LowerCase Alphabet....");
        else
            JOptionPane.showMessageDialog(null, "You Entered Wrong Alphabet....");
    }
}
