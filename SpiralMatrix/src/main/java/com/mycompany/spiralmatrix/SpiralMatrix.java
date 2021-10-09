/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spiralmatrix;

/**
 *
 * @author Md Raziullah Khan
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4,5,6},
            {18,19,20,21,22,7},
            {17,28,29,30,23,8},
            {16,27,26,25,24,9},
            {15,14,13,12,11,10}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<10)
                    System.out.print(arr[i][j]+"   ");
                else
                    System.out.print(arr[i][j]+"  ");
            }
            System.out.println("\n");
        }
        System.out.println("");
        printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        int top=0,down=arr.length-1,left=0,right=arr[0].length-1;
        int dir=0;
        while(top<=down&&left<=right){
            
            if(dir==0){
                for(int i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }else if(dir==1){
                for(int i=top;i<=down;i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[down][i]+" ");
                }
                down--;
            }else if(dir==3){
                for(int i=down;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            dir=(dir+1)%4;
        }
    }
}
