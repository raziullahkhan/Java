package jdbc.sql.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example3 {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//RAZI:1521/xe","scott","tiger");
            Statement st=con.createStatement();
            String qry="update emp set salary=salary-300";
            int c=st.executeUpdate(qry);
            if(c==0)
                System.out.println("Not Updated.");
            else
                System.out.println("Updated");
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
