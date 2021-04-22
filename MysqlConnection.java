import java.sql.*;

public class MysqlConnection {
    public static void main(String[] args) {
        // String url = "jdbc:mysql://localhost:3378/test?socket=/tmp/mysql78.sock?autoReconect=true&useSSL=false";
        // String uname = "saravanan";
        // String password = "password";
        // Connection connection = DriverManager.getConnection(url,uname,password);

        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3378/test?socket=/tmp/mysql78.sock?autoReconect=true&useSSL=false", "saravanan", "password");
            System.out.println("SQL Connection to database established!");
 
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console" + e );
            return;
        } finally {
            try
            {
                if(connection != null)
                    connection.close();
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

