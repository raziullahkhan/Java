
package awt.gui.assingment;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame2 extends Frame implements ActionListener{
    Button b1,b2;
    public MyFrame2(String title){
        super(title);
        setSize(500,400);
        setLocation(300,250);
        setVisible(true);
        b1=new Button("Change Color");
        b2=new Button("Quit");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            Random rd=new Random();
            Color c=new Color(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255));
            setBackground(c);
        }
        else
            System.exit(0);
    }
    
}
public class Assingment2 {
    public static void main(String[] args) {
        MyFrame2 mf=new MyFrame2("My Colored Frame");
    }
}
