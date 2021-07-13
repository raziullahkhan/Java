/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.InfixToPostfix;


public class InfixToPostfix {
    public static void main(String[] args) {
        String infix="8*3+4-3*2+5";
        Stack s=new Stack(infix.length()+1);
        StringBuffer postfix=new StringBuffer("");
        
        int ans=0;
        for(int i=0;i<infix.length();i++){
            if(isOperator(infix.charAt(i))==false){
                postfix.append(infix.charAt(i));
            }
            else{
                char p=s.getHead();
                if(p=='n'){
                    s.push(infix.charAt(i));
                }
                else if(getPrecedence(infix.charAt(i))>getPrecedence(p)){
                    s.push(infix.charAt(i));
                }
                else{
                    while(!s.isEmpty()){
                        postfix.append(s.getHead());
                        int n=s.pop();
                        if(n==0){
                        System.out.println("Invalid");
                        return;
                     }
                }
                     s.push(infix.charAt(i));
                
            }
        }
        }
         while(!s.isEmpty()){
                        postfix.append(s.getHead());
                        int n=s.pop();
                        if(n==0){
                        System.out.println("Invalid");
                        return;
                     }
         }
        System.out.println("Infix = "+infix);
        System.out.println("Postfix = "+postfix);
        StackInt sn=new StackInt(postfix.length());
        for(int i=0;i<postfix.length();i++){
            if(!isOperator(postfix.charAt(i))){
                sn.push(Integer.parseInt(String.valueOf(postfix.charAt(i))));
            }
            else{
                int a=sn.getHead();
                sn.pop();
                int b=sn.getHead();
                sn.pop();
                if(postfix.charAt(i)=='+'){
                    ans=b+a;
                }
                else if(postfix.charAt(i)=='-'){
                    ans=b-a;
                }
                else if(postfix.charAt(i)=='*'){
                    ans=b*a;
                }
                else{
                    ans=b/a;
                }
                sn.push(ans);
            }
            System.out.println(sn.getHead());
        }
        System.out.println("Answer = "+sn.getHead());
    }

    private static boolean isOperator(char op) {
        switch(op){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                return false;
        }
    }

    private static int getPrecedence(char ch) {
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
    }
        return 0;
    }
 
}
