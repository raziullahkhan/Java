package jdbc.sql.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example4 {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//RAZI:1521/xe","scott","tiger");
            Statement st=con.createStatement();
            String qry="delete from emp where id=7";
            int c=st.executeUpdate(qry);
            if(c==0)
                System.out.println("Not Deleted.");
            else
                System.out.println("Deleted.");
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
