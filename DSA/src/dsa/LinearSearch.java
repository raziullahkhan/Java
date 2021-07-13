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
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,34,76,89,4,7,5};
        int size=7,element=7;
        int n=linearSearch(arr,size,element);
        if(n==-1){
            System.out.println("Element "+element+" not found!");
        }
        else{
            System.out.println("Element "+element+" found at index "+n+"!");
        }
    }
    public static int linearSearch(int arr[],int size,int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
