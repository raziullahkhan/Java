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
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,5,8,23,56,78,98,112};
        int size=8,element=5 ;
        int n=binarySearch(arr,size,element);
        if(n==-1){
            System.out.println("Element "+element+" not found!");
        }
        else{
            System.out.println("Element "+element+" found at index "+n+"!");
        }
    }
    public static int binarySearch(int [] arr,int size,int element){
        int low=0,mid,high=size-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]<element){
                low=mid+1;
            }
            else if(arr[mid]>element){
                high=mid-1;
            }
        }
        return -1;
    }
}
