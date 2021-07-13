/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPractice;

import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
       int arr[]={9,8,7,6,5,4,3,2,1,0};
       display(arr);
       arr=SelectionSort(arr);
       display(arr);
    }

    private static int[] SelectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(arr[min]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        return arr;
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
