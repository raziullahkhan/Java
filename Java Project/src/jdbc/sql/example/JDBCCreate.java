package jdbc.sql.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreate {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//RAZI:1521/xe","scott","tiger");
            Statement st=con.createStatement();
            String qry="create table book(id number(4),bname varchar2(20),price number(6,2))";
            st.executeUpdate(qry);
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
