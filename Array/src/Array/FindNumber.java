package Array;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=kb.nextInt();
        int c=0,m=0;
        int [] arr=new int[] {23,56,23,87,98,56,45,23,54,23,54,67,89,34,56,23,45,87,23,98,23,76,23,87,23};
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                c=c+1;
                m=i;
                System.out.print("At "+(m+1)+", ");
            }
        }
        if(c==0)
               System.out.println("Number Not Found"); 
        else
            System.out.println("\n"+(n)+" is found "+(c)+" Times.");
}
}
