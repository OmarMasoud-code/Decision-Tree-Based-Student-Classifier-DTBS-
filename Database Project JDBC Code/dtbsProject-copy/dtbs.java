

 import java.sql.*;
public class dtbs
{
   public static void main(String[] args) {
              
      Connection conn = null;
      try
      {
         // load and register JDBC driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        conn = DriverManager.getConnection("jdbc:mysql://localhost/coursework01?user=root");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM AGENT");
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("\n Agent Name: " + rs.getString("Agent_name"));
            System.out.print("\n Agent Job: " + rs.getString("Agent_job"));
            System.out.print("\n Agent ID: " + rs.getString("Agent_ID"));
             System.out.print("\n");
         }
      }catch(Exception e)
      {
          e.printStackTrace();
      }
   }     
}
