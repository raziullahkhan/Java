package awt.gui.assingment;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener{
    Button b1,b2;
    int a=0;
    public MyFrame(){
        setTitle(Integer.toString(a));
        setSize(400,400);
        setBackground(Color.RED);
        setVisible(true);
        b1=new Button("Click Me");
        b2=new Button("Exit");
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
            a+=1;
            this.setTitle(Integer.toString(a));
        }
        else{
            System.exit(0);
        }
    }
    
}
public class Assingment1 {
    public static void main(String[] args) {
        MyFrame mf=new MyFrame();
    }
}
