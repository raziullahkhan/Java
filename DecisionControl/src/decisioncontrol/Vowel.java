package decisioncontrol;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Any Alphabet: ");
        String s=kb.next();
        char c=s.charAt(0);
        switch(c){
            case 'a':case 'A':
            case 'e':case'E':
            case 'i':case'I':
            case 'o':case'O':
            case 'u':case 'U':{
                System.out.println("Alphabet "+(c)+" is  Vowel.");
                break;
            }
            default:{
                System.out.println("Alphabet "+(c)+" is Consonenet.");   
            }
        }
    }
}
