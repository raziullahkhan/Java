package jdbc.sql.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example5{
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//RAZI:1521/xe","scott","tiger");
            Statement st=con.createStatement();
            Scanner kb=new Scanner(System.in);
            for(int i=1;i<=2;i++){
                System.out.println("Enter id,name,salary: ");
                int id=kb.nextInt();
                String name=kb.next();
                double sal=kb.nextDouble();
                String qry="insert into emp(id,ename,salary) values("+id+",'"+name+"',"+sal+")";
                int c=st.executeUpdate(qry);
                if(c==1)
                    System.out.println("1 Row Inserted.");
                else
                    System.out.println("Not Inserted");
        
            }   
            con.close();
        }
        catch(ClassNotFoundException e){
            System.out.println("error: "+e);
        }
        catch(SQLException ex){
            System.out.println("Error: "+ex);
        }
    }
}
