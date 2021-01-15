/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class dataconnection {
     private static Connection co;
    public static Connection ConnectDB(){
        if(co==null){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            co=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=campaign;user=sa;password=p@ssw0rd;");
           
            return co;
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,"Not connected");
            return null;
        }
       
}
     return co;
}
    
}
