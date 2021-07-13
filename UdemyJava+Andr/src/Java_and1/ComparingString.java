
package Java_and1;

import javax.swing.JOptionPane;

public class ComparingString {
    public static void main(String[] args) {
        String name1=JOptionPane.showInputDialog("Please Enter Name 1: ");
        String name2=JOptionPane.showInputDialog("Please Enter Name 2: ");
        if((name1.compareTo(name2))==0){//also use equals()
            System.out.println("Same");
        }
        if(name1.compareTo(name2)<0)
            System.out.println("Name 1 is Greater");
        if(name1.compareTo(name2)>0)
            System.out.println("Name 2 is greater");
    }
    
}
