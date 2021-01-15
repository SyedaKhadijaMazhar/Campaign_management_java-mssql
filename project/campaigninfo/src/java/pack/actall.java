

package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class actall extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out= response.getWriter();
;
try
{
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   Connection conexion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=campaign","sa","p@ssw0rd");
   if (!conexion.isClosed())
   {
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery("select * from addcamp");

      out.println("<table border=\"1\"><tr><td>Campaign Name</td><td>Start Date</td><td>End Date</td><td>license No#</td><td>Campaign Details</td><td>Actual Budget</td>");
      while (rs.next())
      {
         out.println("<tr>");
        
         out.println("<td>"+rs.getObject("campaignname")+"</td>");
         out.println("<td>"+rs.getObject("startdate")+"</td>");
         out.println("<td>"+rs.getObject("enddate")+"</td>");
         out.println("<td>"+rs.getObject("licenseno")+"</td>");
         out.println("<td>"+rs.getObject("textarea")+"</td>");
         
         out.println("<td>"+rs.getObject("actualbudget")+"</td>");
        
        
         out.println("</tr>");
      }
      out.println("</table>");

      conexion.close();
   }
   else
      out.println("fail");
}
catch (Exception e)
{
   out.println("Exception " + e);
   e.printStackTrace();
}
    }
}
   
   

