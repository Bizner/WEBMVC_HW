
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Best
 */
public class ConnectionToDatabase {
    
    public static Connection getConnection()
    {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "hr";
        String password = "1111";
        String driver = "oracle.jdbc.OracleDriver"; 
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            return null;
        }
     }
}
