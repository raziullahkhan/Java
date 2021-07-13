package Array;

import java.util.Scanner;

public class CopyReverse {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=kb.nextInt();
        int [] arr;
        arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Array Elements: ");
            arr[i]=kb.nextInt();
        }
        System.out.println("Your Array: ");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
         }
         int [] arr1;
         arr1=new int [n];
          for(int i=0;i<n;i++){
              arr1[i]=arr[(n-1)-i];
        }
          System.out.println("New Array: ");
         for(int i=0;i<n;i++){
            System.out.println(arr1[i]);
         }
    }
}
