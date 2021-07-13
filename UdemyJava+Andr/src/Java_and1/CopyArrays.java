/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_and1;

/**
 *
 * @author HP
 */
public class CopyArrays {
    public static void main(String[] args) {
        /*int [] array1={2,4,6,8,10};
        int [] array2=array1;
        array1[1]=5;
        printArray(array1);
        System.out.println("");
        printArray(array2);*/
        
        int [] array1={2,4,6,8,10};
        int [] array2=new int[array1.length];
        for(int i=0;i<array1.length;i++){
            array2[i]=array1[i];
        }
        array1[1]=5;
        printArray(array1);
        System.out.println("");
        printArray(array2);
    }
    public static void printArray(int [] array){
        for(int value:array)
        {
            System.out.println(value);
        }}
}
