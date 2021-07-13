
package Loop;

import javax.swing.JOptionPane;


public class Q8 {
    public static void main(String[] args) {
        int lar,small;
        char ch;
        int input=Integer.parseInt(JOptionPane.showInputDialog("Entter Any Number: "));
        lar=input;
        small=input;
        do{
            input=Integer.parseInt(JOptionPane.showInputDialog("Entter Any Number: "));
            if(input>lar)
                lar=input;
            if(input<small)
                small=input;
            ch=JOptionPane.showInputDialog("Do You Want To Enter More(Y/N):").charAt(0);
        }while(ch=='Y'||ch=='y');
        JOptionPane.showMessageDialog(null,"Largest Number is "+lar+"!\nSmallest Number is"+small+"!");
    }
 
}
