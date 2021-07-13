
package ConditionalStatement;

import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String [] args){
        int quantity;
        double cost;
        double discount;
        quantity=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Quantity of Items: "));
        if(quantity>=1000){
           discount=0.1*(quantity*100.0);
           cost=(quantity*100.0)-discount;
        }
        else
            cost=quantity*100.0;
        
        JOptionPane.showMessageDialog(null, "Total Cost is " + cost);
    }
}
