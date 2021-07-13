/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.QuickSort;

/**
 *
 * @author my pc
 */
public class UseQuickSort {
    public static void main(String[] args) {
        int arr[]={12,11,10,9,8,7,6,5,4,3,2,1,0};
        display(arr);
        arr=quickSort(arr,0,arr.length-1);
        display(arr);
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    private static int[] quickSort(int[] arr,int low,int high) {
        int loc;
        if(low<high){
            loc=partition(arr,low,high);
            arr=quickSort(arr,low,loc-1);
            arr=quickSort(arr,loc+1,high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int start=low;
        int end=high;
        while(start<end){
            while(start<arr.length&&arr[start]<=pivot){
                start++;
            }
            while(end>=0&&arr[end]>pivot){
                end--;
            }
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[end];
        arr[end]=temp;
        return end;
    }

}
