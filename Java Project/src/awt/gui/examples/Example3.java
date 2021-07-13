
package awt.gui.examples;

import java.awt.Frame;
import java.util.Date;
import java.awt.Color;
public class Example3 {
    public static void main(String[] args) {
        Frame fr=new Frame();
        Date today=new Date();
        fr.setTitle(today.toString());
        fr.setSize(600,600);
        fr.setVisible(true);
       // Color c=new Color(160,200,95);
        //fr.setBackground(c);
        fr.setBackground(Color.orange);
    }
  
}
