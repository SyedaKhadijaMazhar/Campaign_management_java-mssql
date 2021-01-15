/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Khadija
 */
public class adminclass {
     public static boolean validate(String username, String password) {        
        boolean status = true;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
       
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
      
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=campaign","sa","p@ssw0rd");
            pst = conn.prepareStatement("SELECT * FROM addadmin WHERE username=? AND password=?");
            pst.setString(1, username);
            pst.setString(2, password);
        
            rs = pst.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
             if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
           
        }
         return status;
     }
    
}


