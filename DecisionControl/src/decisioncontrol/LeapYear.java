package decisioncontrol;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Any Year");
        int year=kb.nextInt();
        String s=(year%100==0)?(year%400==0)?("Leap Year"):("Not Leap Year"):(year%4==0)?("Leap Year"):("Not Leap Year");
        System.out.println(s);
    }
}
