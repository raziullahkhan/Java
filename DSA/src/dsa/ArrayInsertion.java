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
public class ArrayInsertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=new int[100];
        arr[0]=4;
        arr[1]=3;
        arr[2]=5;
        arr[3]=7;
        arr[4]=9;
        int size=5,element=10,capacity=100,index=3;
        displayArray(arr,size);
        int n=indInsertion(arr,size,element,capacity,index);
        if(n==1){
            size++;
             displayArray(arr,size);
        }
        else{
            System.out.println("Not Inserted!");
        }
       
    }

    private static void displayArray(int[] arr, int size) {
       for(int i=0;i<size;i++){
           System.out.print(arr[i]+" ");
           
       }
        System.out.println("");
    }

    private static int indInsertion(int[] arr, int size, int element, int capacity, int index) {
        if(size>=capacity){
            return -1;
        }
        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        return 1;
    }
    
}
