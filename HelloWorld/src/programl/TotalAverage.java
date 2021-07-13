package programl;
import java.util.Scanner;

public class TotalAverage {
   public static void main(String [] args){
      Scanner kb=new Scanner(System.in);
      System.out.print("Enter Marks in English: ");
      int eng=kb.nextInt();
      System.out.print("Enter Marks in Hindi: ");
      int hin=kb.nextInt();
      System.out.print("Enter Marks in Math: ");
      int math=kb.nextInt();
      System.out.print("Enter Marks in Science: ");
      int sci=kb.nextInt();
      System.out.print("Enter Marks in Social Science: ");
      int sst=kb.nextInt();
      int total=eng+hin+math+sci+sst;
      System.out.println("Total Marks="+total);
      System.out.print("Percentage="+(float)total/500*100);
   } 
}
