
package awt.gui.examples;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

/*class MyButtonFrame extends Frame{
    Button b1;
    public MyButtonFrame(){
        setTitle("Razi Frame");
        setSize(400,400);
        setLocation(200,200);
        setVisible(true);
        setBackground(Color.yellow);
        B=new Button("Close App");
        FlowLayout l=new FlowLayout();
        setLayout(l);
        add(B);
    }
}
public class Example5 {
    public static void main(String[] args) {
        MyButtonFrame fr=new MyButtonFrame();
    }
}*/
class MyFrame2 extends Frame{
    Button b1;
    Button b2;
    public MyFrame2(String title){
        super(title);
        b1=new Button("Close App");
        b2=new Button("Change Color");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        setSize(400,400);
        setLocation(200,200);
        setVisible(true);
        setBackground(Color.RED);
    }
}
class Example5{
    public static void main(String[] args) {
        MyFrame2 mf=new MyFrame2("My Buttoned Frame");
    }
}
