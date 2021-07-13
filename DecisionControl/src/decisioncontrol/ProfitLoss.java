package decisioncontrol;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String [] args){
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cp=kb.nextDouble();
        System.out.print("Enter Sell Price: ");
        double sp=kb.nextDouble();
        if(sp>cp){
            System.out.print("Profit="+(sp-cp)+"\nProfit%="+((sp-cp)/cp)*100);            
        }
        else if(cp>sp){
            System.out.print("Loss="+(cp-sp)+"\nLoss%="+((cp-sp)/cp)*100); 
        }
        else
            System.out.print("No profit No Loss");
    }
}
