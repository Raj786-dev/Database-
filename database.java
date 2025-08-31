import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseIntegrationMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";


        String databaseName = "My_DB";
        String userName = "root";      
        String password = "1234";  


        try {
           
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");


           
            Statement stmt = conn.createStatement();




            ResultSet rs = stmt.executeQuery("SELECT * FROM students");


           
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name"));
            }


           
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
