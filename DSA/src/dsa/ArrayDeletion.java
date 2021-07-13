/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author HP
 */
public class ArrayDeletion {
     public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=new int[100];
        arr[0]=4;
        arr[1]=3;
        arr[2]=5;
        arr[3]=7;
        arr[4]=9;
        int size=5,index=3;
        displayArray(arr,size);
        indDeletion(arr,size,index);
        size--;
        displayArray(arr,size);
       
    }

    private static void displayArray(int[] arr, int size) {
       for(int i=0;i<size;i++){
           System.out.print(arr[i]+" ");
           
       }
        System.out.println("");
    }

    private static void indDeletion(int[] arr, int size, int index) {
        
        for(int i=index;i<size;i++){
            arr[i]=arr[i+1];
        }
        
        
    }
}
