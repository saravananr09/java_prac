import db_con.DB_CON;
import java.sql.*;
import java.util.*;

public class Test {
  public static void main(String[] args) {
          try {
                Connection con = DB_CON.makeConnection();
                Statement stmts = con.createStatement();
                String query = "select sleep(10)";
                ResultSet rs = stmts.executeQuery(query);
                if(rs.next()){ // if you need to want print some values which is fetched from .. 
                        String name = rs.getString("Sleep(10)");
                        System.out.println(name);
                }
                stmts.close();                       
          } 
          catch (Exception e) {
                  e.printStackTrace();
          }
  }
}
