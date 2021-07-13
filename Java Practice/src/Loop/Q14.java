
package Loop;

import javax.swing.JOptionPane;


public class Q14 {
    public static void main(String[] args) {
        int first=Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
        int second=Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
        int third=Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number: "));
        int c=0;
        do{
            first--;
            second--;
            third--;
            c+=1;
    }while(first!=0&&second!=0&&third!=0);
        JOptionPane.showMessageDialog(null,c+ " is Smallest.");
        System.exit(0);
    }
}
