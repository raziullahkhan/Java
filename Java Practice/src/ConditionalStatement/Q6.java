
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        int a1,a2,a3;
        a1=Integer.parseInt(JOptionPane.showInputDialog("Enter Age of First Person: "));
        a2=Integer.parseInt(JOptionPane.showInputDialog("Enter Age of Second Person: "));
        a3=Integer.parseInt(JOptionPane.showInputDialog("Enter Age of Third Person: "));
        JOptionPane.showMessageDialog(null, (a1>a2?(a1>a3?"First Person":"Third Person"):(a2>a3?"Second Person":"Third person"))+" is Oldest and "+(a1<a2?(a1<a3?"First Person":"Third Person"):(a2<a3?"Second Person":"Third Person"))+" is Youngest.");
    }
}
