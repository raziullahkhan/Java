
package Loop;

import javax.swing.JOptionPane;

public class Q2 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Number: "));
        System.out.print("Reverse Number is ");
        while(num!=0){
            System.out.print(num%10);
            num=num/10;
        }
        System.out.println("");
    }
}
