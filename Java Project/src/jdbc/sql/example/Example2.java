
package jdbc.sql.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//RAZI:1521/xe","scott","tiger");
            Statement st=con.createStatement();
            String qry="insert into emp values(7,'Vijay Kumar',80000,'23-jun-2018',3444.5)";
            int c=st.executeUpdate(qry);
            if(c==1)
                System.out.println("1 Row Inserted.");
            else
                System.out.println("Not Inserted");
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
