package Loop;

import java.util.Scanner;

class AddNos {
    public static void main(String[] args) {
        {
            Scanner kb=new Scanner(System.in);
            String s;
            do{
                System.out.print("Enter Two Number: ");
                int a=kb.nextInt();
                int b= kb.nextInt();
                System.out.println("Sum is "+(a+b));
                System.out.print("Any More(yes/no): ");
                kb.nextLine();
                s=kb.next();
            }while(s.equalsIgnoreCase("Yes"));
            System.out.println("Thank You!");
        }
    }
}
