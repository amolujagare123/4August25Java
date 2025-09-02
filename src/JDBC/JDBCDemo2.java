package JDBC;

import java.sql.*;

public class JDBCDemo2 {
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

        // DDL Queries
        String sql = "select * from employee";
        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("email")+"\t");
            System.out.println(rs.getString("phoneNo"));
        }

        st.close();
        con.close();

    }
}
