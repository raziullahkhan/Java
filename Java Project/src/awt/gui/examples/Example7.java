
package awt.gui.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends Frame implements ActionListener{
    Button b1;
    Button b2,b3,b4;
    public MyFrame4(String title){
        super(title);
        b1=new Button("RED");
        b2=new Button("GREEN");
        b3=new Button("Blue");
        b4=new Button("QUIT");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(500,400);
        setLocation(200,200);
        setVisible(true);
        b1.addActionListener(this);//It is Registering Event Source and Event Listener
        b2.addActionListener(this);
        b3.addActionListener(this);//It is Registering Event Source and Event Listener
        b4.addActionListener(this);
    }
     @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == b1)
           setBackground(Color.red);
       else if(ae.getSource()==b2)
           setBackground(Color.GREEN);
       else if(ae.getSource()==b3)
           setBackground(Color.BLUE);
       else
           System.exit(0);
    }
}
public class Example7 {
    public static void main(String[] args) {
        MyFrame4 mf=new MyFrame4("My Multi Button Frame");
    }
}
