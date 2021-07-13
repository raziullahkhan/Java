
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q4 {
    public static void main(String[] args) {
        double sal;
        int year;
        double bonus;
        sal=Double.parseDouble(JOptionPane.showInputDialog("Enter Your Salary: "));
        year=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Year of Service: "));
        if(year>=5){
            bonus=0.05*sal;
            JOptionPane.showMessageDialog(null, "Your Net Bonus Salary is "+(bonus+sal));
        }
        else
            JOptionPane.showMessageDialog(null, "Your Net Salary is "+sal);
    }
}
