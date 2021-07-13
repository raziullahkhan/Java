package programl;
import java.util.Scanner;
public class Reverse {
    public static void main(String [] args){
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Any Five-Digit Number: ");
        int n=kb.nextInt();
        int a=n/10000;
        int b=(n/1000)%10;
        int c=(n/100)%10;
        int d=(n/10)%10;
        int e=(n%10);
        System.out.println("Number="+n);
        System.out.print("Reverse="+(e)+(d)+(c)+(b)+(a));
    }    
}
