
import java.sql.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MysqlConnection{
    public static void main(String[] args)
    {
        // socketFactory=org.newsclub.net.mysql.AFUNIXDatabaseSocketFactory;


        Class.forName("com.mysql.jdbc.Driver").newInstance();

        Properties props = new Properties(); 
        props.put("user", "saravanan"); 
        props.put("password", "password"); 
        props.put("socketFactory", AFUNIXDatabaseSocketFactory.class.getName()); 
        props.put("junixsocket.file", "/tmp/mysql78.sock");

        Connection conn = DriverManager.getConnection("jdbc:mysql://", props);









      
      /*  try {
        class.forName("com.mysql.jdbc.Driver");

        Connection dbConnection = DriverManager.getConnection(
            "jdbc:mysql://(host=localhost,port=3378,socket=/tmp/mysql78.sock)/world"
        )
      } catch (Exception e) {
        System.out.println(e)
    }
        System.out.println("from mysql !");
}
        */
}
}