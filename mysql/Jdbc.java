import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;  
import java.util.*;  
import java.io.*; 

public class Jdbc {

    public static void main(String args[]) {
        FileInputStream in = null;
        Connection con = null;
        try {

            Properties props = new Properties();
            in = new FileInputStream("/home/saravanan/java_prac/mysql/db.txt");
            props.load(in);
            in.close();
            String driver = props.getProperty("driver");
            if (driver != null) {
                Class.forName(driver);
            }
            String url = props.getProperty("url");
            String username = props.getProperty("username");
            String password = props.getProperty("password");
            String socket = props.getProperty("socket");

            System.out.println(socket);
            // url = Class.forName("com.mysql.jdbc.Driver"); 
            // username = "saravanan";
            // password = "password";
            // socket = "/tmp/mysql78.sock";
            // con = DriverManager.getConnection(url, username, password, socket);

        } catch (Exception ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception ex) {
                    Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}