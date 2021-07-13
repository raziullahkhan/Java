/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.parenthesis_matching_problem;

/**
 *
 * @author HP
 */
public class MultiParenthesis{
    public static void main(String[] args) {
        String str="[2+{3+(9*3)3-4}+3]";
        int m=5;
        Stack s=new Stack(str.length());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
                s.push(str.charAt(i));
            }
            if(str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']'){
                if(str.charAt(i)==')'&&s.getOpen()=='('){
                    m=s.pop();
                }
                else if(str.charAt(i)=='}'&&s.getOpen()=='{'){
                    m=s.pop();
                }
                else if(str.charAt(i)==']'&&s.getOpen()=='['){
                    m=s.pop();
                }
                else{
                    System.out.println("Invalid!");
                    return;
                }
            }
            if(m==0){
                System.out.println("Invalid");
                return;
            }
        }
        if(s.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

