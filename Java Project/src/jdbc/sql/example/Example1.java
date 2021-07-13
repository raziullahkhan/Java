
package jdbc.sql.example;

public class Example1 {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded!");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found!");
        }
    }
}
