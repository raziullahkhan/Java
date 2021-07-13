package programl;
import java.util.Scanner;
public class Circle {
    public static void main(String [] args){
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double r=kb.nextDouble();
        double perimeter=2*Math.PI*r;
        double area=Math.PI*Math.pow(r, 2);
        System.out.println("Perimeter="+perimeter+"\nArea="+area);
    }
}
