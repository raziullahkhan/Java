
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q2 {
    public static void main(String[]args){
        int num1,num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Please Enter First Number: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Please Enter Second Number: "));
        if(num1>num2)
            JOptionPane.showMessageDialog(null, num1+" is Greater Than "+num2);
        else if(num1<num2)
                JOptionPane.showMessageDialog(null, num2+" is Greater Than "+num1);
        else
            JOptionPane.showMessageDialog(null, num1+" is Equal To "+num2);
    }
}
