/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_and1;

import javax.swing.JOptionPane;

public class ReadingInputUsingJOptionPane {

    public static void main(String[] args) {
       String name;
       String surname;
       name = JOptionPane.showInputDialog("Please Enter Your Name: ");
       surname=JOptionPane.showInputDialog("Please Enter Your Surname: ");
       JOptionPane.showMessageDialog(null, name+" "+surname);
       int firstnumber=Integer.parseInt(JOptionPane.showInputDialog("Please Enter First Number: "));
       int secondnumber=Integer.parseInt(JOptionPane.showInputDialog("Please Enter Second Number: "));
       double average=(firstnumber+secondnumber)/2.0;
       JOptionPane.showMessageDialog(null, "Average = "+average);
    }
    
}
