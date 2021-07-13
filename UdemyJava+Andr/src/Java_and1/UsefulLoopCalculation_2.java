
package Java_and1;

import javax.swing.JOptionPane;


public class UsefulLoopCalculation_2 {
    public static void main(String[] args) {
        //Running Totals
        int days;
        double sales;
        double total=0.0;
        String input=JOptionPane.showInputDialog("For How Many days Do You Have Sales Figures: ");
        days=Integer.parseInt(input);
        for(int count=1;count<days;count++){
            input=JOptionPane.showInputDialog("Enter The Sales For Day: "+count);
            sales=Double.parseDouble(input);
            total+=sales;
        }
        JOptionPane.showMessageDialog(null, "The Total Sales Are: $"+total);
        
        //Sentinel Values
        int value;
        int doubleValue;
        input=JOptionPane.showInputDialog("Please Enter a Value to Double"+"(0 to Stop)");
        value=Integer.parseInt(input);
        while(value != 0){
            doubleValue=value*2;
            JOptionPane.showMessageDialog(null,""+value+" Doubled is "+doubleValue);
            input=JOptionPane.showInputDialog("Please Enter a Value to Double"+"(0 to Stop)");
            value=Integer.parseInt(input);
        }
        System.exit(0);
    }
}
