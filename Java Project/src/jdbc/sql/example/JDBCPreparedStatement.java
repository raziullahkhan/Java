import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPreparedStatement{
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//RAZI:1521/xe","scott","tiger");
            PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
            Scanner kb=new Scanner(System.in);
            System.out.println("Enter the id,name and sal: ");
            for(int i=0;i<=2;i++){
                int id=kb.nextInt();
                String name=kb.next();
                double sal=kb.nextDouble();
                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setDouble(3, sal);
                int c=pst.executeUpdate(); 
                if(c==0)
                    System.out.println("Not Row Inserted!");
                else
                    System.out.println(c+" Row Inserted!");
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