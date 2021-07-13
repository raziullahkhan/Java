package programl;
import java.util.Scanner;
public class Rectangle {
  public static void main(String [] args){
      Scanner kb=new Scanner(System.in);
      System.out.println("Enter Length of Rectangle: ");
      int l=kb.nextInt();
      System.out.println("Enter Breadth of Rectangle: ");
      int b=kb.nextInt();
      System.out.println("Perimeter="+2*(l+b));
      System.out.println("Area="+l*b);
  }  
}
