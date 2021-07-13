
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q10 {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        int z=0;
        JOptionPane.showMessageDialog(null, (x==2));
        JOptionPane.showMessageDialog(null, (x!=5));
        JOptionPane.showMessageDialog(null, (x!=5&&y>=5));
        JOptionPane.showMessageDialog(null, (z!=0||x==2));
        JOptionPane.showMessageDialog(null, (!(y<10)));
    }
}
