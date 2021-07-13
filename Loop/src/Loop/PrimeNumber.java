package Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Range: ");
        int a=kb.nextInt();
        for(int i=1;i<=a;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c=c+1;
            }
            if (c==2)
                System.out.println(i);
        }
    }
}
