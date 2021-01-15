

package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addcategory extends HttpServlet {

   
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


String a = request.getParameter("productcategory");

Connection con=mypack.dataconnection.ConnectDB();
try{
    String sql="insert into addproductcategory values(?)";
        java.sql.PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1, a);
       
                    pst.execute();
                   RequestDispatcher rd=request.getRequestDispatcher("categoryreg.jsp"); 
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