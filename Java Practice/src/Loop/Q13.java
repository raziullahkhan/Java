/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

import javax.swing.JOptionPane;

public class Q13 {
    public static void main(String[] args) {
        int input=Integer.parseInt(JOptionPane.showInputDialog("Enter Terms: "));
        String s="*";
        for(int i=0;i<input;i++){
            for(int j=0;j<i;j++){
                System.out.print(s);
            
            }
            System.out.println("");
    }
}
}