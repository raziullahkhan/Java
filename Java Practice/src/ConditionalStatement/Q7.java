
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Integer: "));
        JOptionPane.showMessageDialog(null, "Absolute Value of "+num+" is "+(num>=0?num:num*(-1)));
    }
}
