package Worker;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Work Hour and PayRate of Worker:");
        int x=kb.nextInt();
        double y=kb.nextDouble();
        Worker obj=new Worker();
        obj.setData(x, y);
        double sal;
        sal=obj.calculateSalary();
        System.out.println("Salary="+sal);
    }
}
