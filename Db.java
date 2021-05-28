import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
    public static void main(String[] args) {
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("select Name from country where Population<1000;");
          while(rs.next()){
              System.out.println(rs.getString(1));
          }
          con.close(); 
        }
        catch(Exception e){
            System.out.println(e);
        }    
    }
}
