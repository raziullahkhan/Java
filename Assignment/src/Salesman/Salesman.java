package Salesman;

import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("How many Salesman?");
        int n=kb.nextInt();
        int [][] arr=new int [n][];
        for(int i=0;i<n;i++){
            System.out.println("How Many Sales for Salesman"+(i+1)+("?"));
            arr[i]=new int [kb.nextInt()];
            System.out.println("Enter Sale Value: ");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println("Sale Record: ");
        for(int i=0;i<arr.length;i++){
            System.out.print("Salesman"+(i+1)+(" "));
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        double a=0;
        int sm=0;
        for(int i=0;i<arr.length;i++){
             float avg;
             int sum=0,cnt=0;
            for(int j=0;j<arr[i].length;j++){
                sum=arr[i][j]+sum;
                cnt=cnt+1;
            }
            avg=(float)sum/cnt;
            System.out.println("Average Sale of Salesman"+(i+1)+(": ")+(avg));
            if(a>avg){
                a=avg;
                sm=i;
            }
            }
            System.out.println("Salesman"+(sm+1)+(" is Most Efficient."));
        }
}
