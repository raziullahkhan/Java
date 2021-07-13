
package Loop;

import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
        int hcf=0;
        for(int i=1;i<=num1||i<=num2;i++){
            if(num1%i==0&&num2%i==0)
                hcf=i;
        }
        JOptionPane.showMessageDialog(null,"H.C.F of "+num1+" And "+num2+" is "+hcf);
    }
}
