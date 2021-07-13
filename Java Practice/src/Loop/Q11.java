
package Loop;

import javax.swing.JOptionPane;


public class Q11 {
    public static void main(String[] args) {
        int input=Integer.parseInt(JOptionPane.showInputDialog("Enter The Terms: "));
        int sum=0;
        int c=0;
        int d=1;
        for(int i=1;i<=input;i++){
            System.out.println(sum);
            sum=c+d;
            d=c;
            c=sum;
            
            
        }
    }
}
