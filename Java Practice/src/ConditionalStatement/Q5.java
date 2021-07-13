
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        double marks,percentage;
        marks=Double.parseDouble(JOptionPane.showInputDialog("Enter Your Marks: "));
        percentage=(marks/500.0)*100.0;
        if(percentage>=80)
            JOptionPane.showMessageDialog(null,"Your Grade is 'A'");
        else if(percentage>=60&&percentage<80)
            JOptionPane.showMessageDialog(null,"Your Grade is 'B'");
        else if(percentage>=50&&percentage<60)
            JOptionPane.showMessageDialog(null,"Your Grade is 'C'");
        else if(percentage>=45&&percentage<50)
            JOptionPane.showMessageDialog(null,"Your Grade is 'D'");
        else if(percentage>=25&&percentage<45)
            JOptionPane.showMessageDialog(null,"Your Grade is 'E'");
        else
            JOptionPane.showMessageDialog(null,"Your Grade is 'F'");
    }
}
