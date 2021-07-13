
package awt.gui.examples;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends Frame  implements ActionListener{
    Button b;
    Button b2;
    public MyFrame3(String title){
        super(title);
        setSize(400,400);
        b=new Button("Close App");
        b2=new Button("Show Message");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);  
        add(b);
        add(b2);
        setVisible(true);
        b.addActionListener(this);//It is Registering Event Source and Event Listener
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == b)
           System.exit(0);
       else
            System.out.println("Good Morning");
    }
}
    public class Example6 {
    public static void main(String[] args) {
        MyFrame3 mf=new MyFrame3("My Buttoned frame");
    }
}
