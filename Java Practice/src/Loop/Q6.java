
package Loop;

import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        int total=0;
        char ch;
        do{
            int input=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Number: "));
            total+=input;
            ch=JOptionPane.showInputDialog("Do You Want To Continue(Y/N): ").charAt(0);
    }while(ch=='Y'||ch=='y');
        JOptionPane.showMessageDialog(null, "Total Sum is "+total+"!");
    }
}
