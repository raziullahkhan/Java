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
public class Methods {
    public static void main(String[] args) {
        //printAverage(20,30);
        //double average=getAverage(30,30);
        //System.out.println("Average: "+average);
        //String fullName=fullName("John","Rambo");
        //System.out.println(fullName);
        int value=20;
        if(isValid(value)){
            System.out.println("The value is in range");
        }
        else{
            System.out.println("The value is not in range");
        }
    }
    /**
     * This Method print average of numbers
     * @param val1
     * @param val2 
     */
    public static void printAverage(int val1,int val2){
        double average=(val1+val2)/2.0;
        System.out.println("Average: "+average);
    }
    /**
     * This method calculate average and return it
     * @param val1
     * @param val2
     * @return The average of two values
     */
    public static double getAverage(int val1,int val2){
        //double average=(val1+val2)/2.0;
        //return average;
        return (val1+val2)+2.0;
    }
    public static String fullName(String name,String surname){
        //String fullName=name+" "+surname;
        //return fullName;
        return name+" "+surname;
    }
    private static boolean isValid(int number){
         return(number>=1&& number<=100);     
    }
}
