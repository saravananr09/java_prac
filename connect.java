import java.sql.*;
import java.util.concurrent.TimeUnit;
//  java -cp .:mysql-connector-java-5.1.49-bin.jar connect.class file
class connect {
    public static void main(String[] args) {
      try {
          String url = "jdbc:mysql://localhost:3378/test?autoReconect=true&useSSL=false";
          String uname = "saravanan";
          String password = "password";
        //   String socket = "/tmp/mysql78.sock";
          String query = "select categoryName from test.ces limit 1";
        // Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3378/world", "saravanan","password" );
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection got established !!!!");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

         rs.next(); 
        String name = rs.getString("CategoryName");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(name);
        st.close();
        // con.close();

        // String socketFactory = AFUNIXDatabaseSocketFactory.class.getName();
        // System.out.println("saravanan !");
        // con.close();
      } catch (Exception e) {
        System.out.println(e);
      }

    } 
}