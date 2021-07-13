package Loop;

import javax.swing.JOptionPane;

public class Q4 {

    public static void main(String[] args) {
        int count = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Any Number: "));
        for (int i = num; i > 0; i--) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            JOptionPane.showMessageDialog(null, num + " is Prime Number..");
        } else {
            JOptionPane.showMessageDialog(null, num + " is Not Prime Number..");
        }
    }
}
