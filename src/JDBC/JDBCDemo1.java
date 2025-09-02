package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating connection
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/school";

        //  int var = ob.getMyValue();

        Connection con = DriverManager.getConnection(url,username,password);

        // 3 .  creating a statement
        Statement st = con.createStatement();

        // 4. execute query

        // DML Queries
    //    String sql = "insert into employee value(6,'Shashi','shashi@gmail.com','67676767')";
     //   String sql = "update employee set phoneno='10000' where id=6";
        String sql = "delete from employee where id=6";
        st.executeUpdate(sql);

        st.close();
        con.close();

    }
}
