/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.BubbleSort;

/**
 *
 * @author my pc
 */
public class BubbleSort {
    public static int[] bubbleSort(int [] arr){
        int temp;
        boolean flag;
        for(int i=1;i<arr.length;i++){
            flag=false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,7};
        int res[]=bubbleSort(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println("");
    }
}
