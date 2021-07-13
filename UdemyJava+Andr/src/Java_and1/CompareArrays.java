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
public class CompareArrays {
    public static void main(String[] args) {
       /* int[] numbers1={2,4,6,8,10};
        int [] numbers2={2,4,6,8,10};
        if(numbers1==numbers2){
            System.out.println("They are thw same!");
        }
        else{
            System.out.println("They are not same!");
        }
    }*/
       int [] numbers1={2,4,6,8,10};
       int [] numbers2={2,4,6,8,10};
       boolean arrayEqual=true;
       int i=0;
       if(numbers1.length!=numbers2.length){
           arrayEqual=false;
       }
       while(arrayEqual&&i<numbers1.length){
           if(numbers1[i]!=numbers2[i]){
               arrayEqual=false;
           }
           i++;
       }
        
       if(arrayEqual){
           System.out.println("They are Same!");
       }
       else{
           System.out.println("They are not same");
       }
    }
}
