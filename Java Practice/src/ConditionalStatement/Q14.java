
package ConditionalStatement;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter Any 4 Digit Number: ");
        Scanner kb=new Scanner(System.in);
        num=kb.nextInt();
        int a=num%10;
        int b=(num/10)%10;
        int c=(num/100)%10;
        int d=(num/1000);
        System.out.println("Reverse of "+num+" is "+a+b+c+d);
    }
}
