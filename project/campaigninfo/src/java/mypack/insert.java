

package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class insert extends HttpServlet {

   
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

String firstname,lastname,email,username,password,cellno,identityno;


String a = request.getParameter("firstname");
String b = request.getParameter("lastname");
String c = request.getParameter("email");
String d = request.getParameter("username");
String y = request.getParameter("password");
String f = request.getParameter("cellno");
String g = request.getParameter("identityno");
Connection con=mypack.dataconnection.ConnectDB();
try{
    String sql="insert into userregistration values(?,?,?,?,?,?,?)";
        java.sql.PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1, a);
        pst.setString(2, b);
        pst.setString(3, c);
        pst.setString(4, d);
        pst.setString(5, y);
        pst.setString(6, f);
        pst.setString(7, g);
                    pst.execute();
                   RequestDispatcher rd=request.getRequestDispatcher("userreg.jsp"); 
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