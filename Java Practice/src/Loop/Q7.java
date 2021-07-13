
package Loop;

import javax.swing.JOptionPane;

public class Q7 {
    public static void main(String[] args) {
        int neg=0,pos=0,zer=0;
        char ch;
        do{
            int input=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Integer: "));
            if(input<0)
                neg++;
            else if(input>0)
                pos++;
            else
                zer++;
            ch=JOptionPane.showInputDialog("Do You Want To Continue(Y/N):").charAt(0);
        }while(ch=='Y'||ch=='y');
         JOptionPane.showMessageDialog(null,"You Entered:\n"+neg+" Negative Numbers!\n"+pos+" Positive Numbers!\n"+zer+" Zero!");
    }
}
