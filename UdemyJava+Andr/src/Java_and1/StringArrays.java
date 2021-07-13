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
public class StringArrays {
    public static void main(String[] args) {
        String [] names=getNames();
        for(int i=0;i<names.length;i++){
            if(names[i]!=null){
                System.out.println(names[i].charAt(0));
            }
            
        }
    }
    
    public static String[] getNames(){
        String[] names=new String[6];
        names[0]="John";
        names[1]="Peter";
        names[2]="Paul";
        names[3]="Simon";
        names[4]="Chuck";
        
        return names;
    }
}
