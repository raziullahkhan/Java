/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={3,534,54,33,56,75,36,98,2,7,4};
        printArray(arr);
        sort(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void sort(int[] arr) {
        int temp;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            int j;
            for(j=i-1;j>=0&&arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }
}
