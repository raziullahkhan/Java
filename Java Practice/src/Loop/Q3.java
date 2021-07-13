
package Loop;

import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        int sEven=0;
        int sOdd=0;
        int num;
        char ch;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Number: "));
            if(num%2==0)
                sEven+=num;
            else
                sOdd+=num;
            ch=JOptionPane.showInputDialog("Do You want to Continue(Y/N): ").charAt(0);
        }while(ch=='Y');
        JOptionPane.showMessageDialog(null, "Sum Of Even Number is "+sEven);
        JOptionPane.showMessageDialog(null, "Sum Of Odd Number is "+sOdd);
    }
 
}
