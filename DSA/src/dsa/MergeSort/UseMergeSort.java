/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.MergeSort;

/**
 *
 * @author my pc
 */
public class UseMergeSort {
    static int c=0;
    public static void main(String[] args) {
        int [] arr={5,7,3,9,23,6,98,56,45,34,76,64};
        display(arr);
        mergeSort(arr,0,arr.length-1);
        display(arr);
    }

    private static void display(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    private static void mergeSort(int[] arr,int low,int high){
       if(low<high){
           int mid=(low+high)/2;
           mergeSort(arr,low,mid);
           mergeSort(arr,mid+1,high);
           merge(arr,low,mid,high);
       }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            b[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<n1&&j<n2){
            if(a[i]<b[j]){
                arr[k]=a[i];
                k++;i++;
            }
            else{
                arr[k]=b[j];
                k++;j++;
            }
        }
        while(i<n1){
            arr[k]=a[i];
            k++;i++;
        }
        while(j<n2){
            arr[k]=b[j];
            k++;j++;
        }
    }
    
}
