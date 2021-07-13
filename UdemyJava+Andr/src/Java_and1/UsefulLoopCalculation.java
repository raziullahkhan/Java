
package Java_and1;

import javax.swing.JOptionPane;

public class UsefulLoopCalculation {
    public static void main(String[] args) {
        //Inputvalidation
        String input=JOptionPane.showInputDialog("Please Enter a Number in the Range of 1 Through 100: ");
        int number=Integer.parseInt(input);
        while(number<1||number>100){
            JOptionPane.showMessageDialog(null, "The Number is Not valid!");
            input=JOptionPane.showInputDialog("Please Enter a Number in the Range of 1 Through 100: ");
            number=Integer.parseInt(input);
        }
        JOptionPane.showMessageDialog(null, "Correct!");
        
        //UserControlledLoop
        input=JOptionPane.showInputDialog("How High Should I Go To Square The Number: ");
        int maxValue=Integer.parseInt(input);
        System.out.println("Number          Number Squared");
        System.out.println("------------------------------");
        for(int i=1;i<=maxValue;i++){
            System.out.println(i + "\t\t\t" +i*i);
        }
        
    }
}
