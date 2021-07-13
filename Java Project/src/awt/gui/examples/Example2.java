
package awt.gui.examples;

import java.awt.Frame;
import java.util.Date;

public class Example2 {
    public static void main(String[] args) {
        Frame fr=new Frame();
        Date today=new Date();
        fr.setTitle(today.toString());
        fr.setSize(400,400);
        fr.setVisible(true);
    }
}
