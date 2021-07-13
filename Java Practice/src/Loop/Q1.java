
package Loop;

import javax.swing.JOptionPane;

public class Q1 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Number: "));
        int pow=Integer.parseInt(JOptionPane.showInputDialog("Enter Power: "));
        int total=1;
        for(int i=pow;i>0;i--){
            total=total*num;
        }
        JOptionPane.showMessageDialog(null, num+" Raised To The Power "+pow+" = "+total);
    }
  
}
