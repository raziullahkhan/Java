
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmpDAO {
    public static boolean addEmp(Emp e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?)");
        ps.setInt(1,e.getEmpNo());
        ps.setString(2, e.getEname());
        ps.setDouble(3, e.getEmpSal());
        int result=ps.executeUpdate();
        if(result==1)
            return true;
        else
            return false;
    }
    public static Emp findEmployeeById(int empNo)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from employee where empid=?");
        ps.setInt(1, empNo);
        ResultSet rs=ps.executeQuery();
        Emp e=null;
        if(rs.next()){
            e=new Emp();
            e.setEmpNo(rs.getInt(1));
            e.setEname(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));
        }
        return e;
    }
    public static ArrayList<Emp> getAllEmployees()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<Emp> empList=new ArrayList<>();
        ResultSet rs=st.executeQuery("Select * from employee order by empid");
        while(rs.next()){
            Emp e=new Emp();
            e.setEmpNo(rs.getInt(1));
            e.setEname(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));
            empList.add(e);
        }
        return empList;
    }
    
    public static boolean updateEmp(Emp e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update employee set ename=?, sal=? where empid=?");
        ps.setString(1, e.getEname());
        ps.setDouble(2,e.getEmpSal());
        ps.setInt(3,e.getEmpNo());
        int result=ps.executeUpdate();
        if(result==1){
            return true;
        }
        else
            return false;
        
    }
    public static boolean deleteEmp(int empNo)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Delete from employee where empid=?");
        ps.setInt(1, empNo);
        int result=ps.executeUpdate();
        if(result==1)
            return true;
        else
                return false;
    }
}
