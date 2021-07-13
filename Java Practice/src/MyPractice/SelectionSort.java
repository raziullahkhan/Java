/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPractice;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,4,5,2,6,1,34,23};
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
        
        for(int i=0;i<arr.length-1;i++){
            int m=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
            }
            int temp=arr[m];
            arr[m]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
