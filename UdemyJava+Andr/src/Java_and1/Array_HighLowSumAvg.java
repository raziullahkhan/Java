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
public class Array_HighLowSumAvg {
    public static void main(String[] args) {
        int [] numbers={2,6,10,12,15,17,1};
        int highest=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>highest){
                highest=numbers[i];
            }
        }
        System.out.println("The highest value is: "+highest);
        
        int lowest=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<lowest){
                lowest=numbers[i];
            }
        }
        System.out.println("The lowest valoue is: "+lowest);
        
        int [] values={1,2,3};
        int sum=0;
        for(int i=0;i<values.length;i++){
            sum=sum+values[i];
        }
        double average=(double)sum/values.length;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
    }
}
