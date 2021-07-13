
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q9 {
    public static void main(String[] args) {
        int cla;
        int att;
        double per;
        String med = null;
        String s1="Y";
        cla=Integer.parseInt(JOptionPane.showInputDialog("Enter Total Number of Class Held: "));
        att=Integer.parseInt(JOptionPane.showInputDialog("Enter Total Number of Class You Attended: "));
        per=((double)att/(double)cla)*100.0;
        JOptionPane.showMessageDialog(null, "Your Attendance Percentage is "+per);
        if(per>=75)
            JOptionPane.showMessageDialog(null, "You are Allowed to Sit in Exam.");
        else
           med=JOptionPane.showInputDialog("Have You Medical Cause(Y/N): ");
           if(med.equalsIgnoreCase(s1))
               JOptionPane.showMessageDialog(null, "You are Allowed to Sit in Exam.");
           else
               JOptionPane.showMessageDialog(null, "You are Not Allowed to Sit in Exam.");
            
    }
 
}
