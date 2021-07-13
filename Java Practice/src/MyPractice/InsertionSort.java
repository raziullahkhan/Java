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
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={7,4,2,1,0};
        display(arr);
        arr=sort(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    private static int[] sort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0&&temp<arr[j];j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
