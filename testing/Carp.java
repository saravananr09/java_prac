import java.sql.*;

class Carp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection.con=DriverManager.getConnection(
                "jdbc:mysql://DESKTOP-O7T942J:3378/world","root",""
            );
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from emp");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                con.close();  
            }catch(Exception e)
            { System.out.println(e);

            }
    }
}