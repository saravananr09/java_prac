import java.util.*;
import java.sql.*;
import 

public class DB_CON{
        public static Connection makeConnection(){
                Connection con = null;
                try{
                        String db_name  = "test";
                        String db_username  = "saravanan";
                        String db_password  = "password";
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost/"+db_name+"?socket=/tmp/mysql78.sock?autoReconect=true&useSSL=false,user="+db_username+"&password="+db_password);
                }catch(Exception e){ 
                        System.out.println(e);
                }
                return con; 
        }
}


