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
public class Arrays {
    public static void main(String[] args) {
        /*int [] numbers=new int[10];
        int numbers2[]=new int[10];
        int [] numbers3,numbers4,numbers5;//all three are arrays
        int numbers6[],numbers7,numbers8;//only numbers6 is array
        */
        int [] numbers=new int[4];
        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=20;
        numbers[3]=25;
        int [] numbers2={10,15,20,25};
        System.out.println(numbers2[1]);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        for(int val:numbers){
            System.out.println(val);
        }
    }
 
}
