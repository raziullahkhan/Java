package Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int a=kb.nextInt();
        int fact=1,n=a;
        while(a>1){
         fact=fact*a;
         a--;
    }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
