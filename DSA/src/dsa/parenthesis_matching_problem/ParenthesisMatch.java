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
public class ParenthesisMatch {
    public static void main(String[] args) {
        String e="(2+4)+4+((7-2)*3)()(()))";
        checkParenthesis(e);
    }

    private static void checkParenthesis(String e) {
        Stack s=new Stack(e.length());
        for(int i=0;i<e.length();i++){
            if(e.charAt(i)=='('){
                s.push(e.charAt(i));
            }
            if(e.charAt(i)==')'){
                int m=s.pop();
                if(m==0){
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        if(s.isEmpty()){
            System.out.println("Valid");
            return;
        }
        System.out.println("Invalid");
        
    }
}
