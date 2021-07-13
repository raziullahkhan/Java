package decisioncontrol;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=kb.nextInt();
        if(n%2==0){
            System.out.print(n+" is Even Number");
        }
        else{
            System.out.print(n+" is Odd Number");
        }
    }
}
