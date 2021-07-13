
package awt.gui.examples;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

class MyFrame extends Frame{
    public MyFrame(String title){
       super(title);
       //setTitle(title);
       setSize(400,400);
       setVisible(true);
       setBackground(Color.yellow);
    }
}
public class Example4 {
    public static void main(String[] args) {
       // MyFrame mf=new MyFrame("Razi Title");
       Date today=new Date();
       MyFrame fr=new MyFrame(today.toString());
    }
}
