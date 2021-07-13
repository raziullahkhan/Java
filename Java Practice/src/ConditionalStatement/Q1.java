
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q1 {
   public static void main(String [] args){
   int l =Integer.parseInt(JOptionPane.showInputDialog("Enter Length of Rectangle: "));
   int b =Integer.parseInt(JOptionPane.showInputDialog("Enter Breadth of Rectangle: "));
    
   if(l==b)
        JOptionPane.showMessageDialog(null, "The Given Rectangle is Square.");
   else
        JOptionPane.showMessageDialog(null, "The Given Rectangle is not Square.");
}
)