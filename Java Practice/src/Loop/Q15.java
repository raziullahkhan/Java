
package Loop;

import javax.swing.JOptionPane;

public class Q15 {
    public static void main(String[] args) {
    int input=Integer.parseInt(JOptionPane.showInputDialog("How Many Rows Do You Want in This Pattern: "));
    for(int i=1;i<=input;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        for(int j=i-1;j>0;j--){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}
}
