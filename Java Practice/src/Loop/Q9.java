
package Loop;

import javax.swing.JOptionPane;

public class Q9 {
    public static void main(String[] args) {
      int dig;
    
    for(int i=1;i<=500;i++){
    if(i>=10&&i<=99){
        if((((i/10)*(i/10)*(i/10))+((i%10)*(i%10)*(i%10)))==i)
        JOptionPane.showMessageDialog(null,i);
    }
    else if(i>0&&i<10){
        if((i*i*i)==i)
            JOptionPane.showMessageDialog(null,i);
    }
    else{
        dig=(i/10)%10;
        if((((i%10)*(i%10)*(i%10))+((i/100)*(i/100)*(i/100))+(dig*dig*dig))==i)
            JOptionPane.showMessageDialog(null,i);
    }
    
}
}
}