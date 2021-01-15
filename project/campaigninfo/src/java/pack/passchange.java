

package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class passchange extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request,response);
      
PrintWriter out= response.getWriter();







String a = request.getParameter("password");
String b = request.getParameter("emailid");

Connection con=mypack.dataconnection.ConnectDB();
try{
    String sql="update userregistration set password=? where emailid=?";
        java.sql.PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1, a);
        pst.setString(2, b);
       
                    pst.executeUpdate();
                   RequestDispatcher rd=request.getRequestDispatcher("passwordmsg.jsp"); 
                      rd.forward(request,response);  
                   
}
catch(Exception e){
    out.println(e);
}
finally{
    out.close();
}
    }
    }