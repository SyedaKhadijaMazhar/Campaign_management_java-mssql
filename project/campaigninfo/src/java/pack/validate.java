/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class validate extends HttpServlet {

   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html"); 
   PrintWriter out = response.getWriter();
      
            String n=request.getParameter("username");
            String p=request.getParameter("password");
           
           
           
            if(MyClass.validate(n, p)){
                RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
                rd.forward(request,response);
                
            }
            else{                
                RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
                rd.forward(request,response);
            }
            out.close();
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
