import db_con.DB_CON;
import java.io.*;
import java.sql.*;
import java.util.*;

class trx_mysql {

  static boolean get_insert() {
    boolean trx = false;
    try {
      Connection con = DB_CON.makeConnection();
      //   Statement st = con.createStatement();
      con.setAutoCommit(false);

      String sql = "insert into testo(name) values('getlast')";

      PreparedStatement ps = con.prepareStatement(
        sql,
        Statement.RETURN_GENERATED_KEYS
      );

      ps.executeUpdate();

      ResultSet rs = ps.getGeneratedKeys();
      int generatedKey = 0;
      if (rs.next()) {
        generatedKey = rs.getInt(1);
      }

      System.out.println("Inserted record's ID: " + generatedKey);
      //         Statement stmt = db.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
      // numero = stmt.executeUpdate();

      // ResultSet rs = stmt.getGeneratedKeys();
      // if (rs.next()){
      //     risultato=rs.getString(1);
      // }
      con.commit();
      //   st.executeUpdate("insert into testo(name) values('vicky')");
      //   con.commit();
      //   st.executeUpdate("insert into testo(name) values('mysql_dba')");
      //   con.commit();
      //   st.executeUpdate("insert into testo(name) values('postgresql_dba')");
      //   con.commit();

    } catch (Exception e) {
      System.out.println(e);
    }
    return trx = true;
  }

  public static void main(String[] args) {
    System.out.println(get_insert());
  }
}
