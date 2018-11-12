/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gia Hieu
 */
public class ConnectionDB {

    public static Connection getConn() {
        try {
            String connectionUrl
                    = "jdbc:sqlserver://localhost:1433;databaseName=BausGear_Database;user=sa;password=123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con
                    = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
