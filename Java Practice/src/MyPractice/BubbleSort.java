/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPractice;

/**
 *
 * @author my pc
 */
public class BubbleSort {
    public static void main(String[] args) {
        int []arr={3,78,56,45,34,23,79,345,1};
        display(arr);
        sort(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    private static void sort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

   