
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q12 {
    public static void main(String[] args) {
        int year=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Year: "));
        if(year%100==0){
            if(year%400==0)
                JOptionPane.showMessageDialog(null, year+" is Leap Year....");
            else
                JOptionPane.showMessageDialog(null, year+" is Not Leap Year....");
        }
        else
            if(year%4==0)
                JOptionPane.showMessageDialog(null, year+" is Leap Year....");
            else
                JOptionPane.showMessageDialog(null, year+" is Not Leap Year....");
}
}
