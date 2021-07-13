package Array;

import java.util.Scanner;

public class InterchangeOddEven {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=kb.nextInt();
        int [] arr;
        arr =new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Array Elements: ");
            arr[i]=kb.nextInt();
        }
        System.out.println("Your Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
                arr[i]=arr[i]+1;
        }
        System.out.println("New Array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
