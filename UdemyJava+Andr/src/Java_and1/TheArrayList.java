/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_and1;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TheArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("James");
        names.add("Peter");
        names.add("John");
        names.add("Jakes");
        names.add(3,"Paul");
        names.set(1,"Peters");
        names.remove(0);
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
