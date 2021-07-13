
package ConditionalStatement;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int age;
        char sex;
        char mar;
        System.out.print("Enter Your Age: ");
        age=kb.nextInt();
        System.out.print("Enter Your Sex(M/F): ");
        sex=kb.next().charAt(0);
        System.out.print("Are You Married(Y/N): ");
        mar=kb.next().charAt(0);
        if(sex=='F')
            System.out.println("You Will Work in Urban Area");
        else if(sex=='M'){
            if(age>=20&&age<40)
                System.out.println("You Will Work Anywhere");
            else if(age>=40&&age<60)
                System.out.println("You will Work in Urban Area");
        }
        else
            System.out.println("Wrong Input");
        }
        
    }
}
