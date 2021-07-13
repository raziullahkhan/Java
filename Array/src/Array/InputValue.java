package Array;

import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int a=kb.nextInt();
        int [] arr;
        int sum=0;
        arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter Value: ");
            arr[i]=kb.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("\n\n\n");
        for(int i=0;i<a;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+((float)sum/a));
    }
}
