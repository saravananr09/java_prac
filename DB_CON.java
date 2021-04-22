package db_con;
import java.util.*;
import java.sql.*;

public class DB_CON {
        public static Connection makeConnection(){
                Connection con = null;
                try{
                        String db_name  = "test";
                        String db_username  = "saravanan";
                        String db_password  = "password";
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3378/test?socket=/tmp/mysql78.sock?autoReconect=true&useSSL=false", "saravanan", "password");
                        // .getConnection("jdbc:mysql://localhost/"+db_name+"?user="+db_username+"&password="+db_password);
                }catch(Exception e){ 
                        System.out.println(e);
                }
                // try {
                //         Statement stm = con.createStatement();
                // String sql = "select sleep(100)";
                // ResultSet rs = stm.executeQuery(sql); 
                // stm.close();
                // } catch (Exception e) {
                //         //TODO: handle exception
                //         e.printStackTrace();
                // }
                
                return con; 
        }

}


