package jdbc.sql.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCSelect{
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//RAZI:1521/xe","scott","tiger");
            Statement st=con.createStatement();
            String qry="select id,ename,salary from emp";
            ResultSet rs=st.executeQuery(qry);
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("ename");
                double sal=rs.getDouble("salary");
                System.out.println(id+"\t"+name+"\t"+sal );
            
            
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
