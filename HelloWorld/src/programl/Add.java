package programl;

import java.util.Scanner;
class Add
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a=kb.nextInt();
        System.out.print("Enter Second Number: ");
        b=kb.nextInt();
        c=a+b;
        System.out.println("Sum="+c);
   }
}
