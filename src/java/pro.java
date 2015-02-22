/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
 import java.util.*;
 import java.io.PrintWriter;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import com.oreilly.servlet.MultipartRequest;
 import org.apache.commons.fileupload.*;

/**
 *
 * @author ICT
 */
public class pro extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             MultipartRequest m=new MultipartRequest(request, "C:/Users/ICT/Desktop/blog1/web/uploadimg/");
           String pic=m.getFilesystemName("pic");
           out.println("pic is"+pic);
             //String email =(String) session.getAttribute("email");
            //String username =(String) session.getAttribute("username");
           String fname=m.getFilesystemName("fname");
           String lname=m.getParameter("lname");
           String dob=m.getParameter("dob");
           String sex=m.getParameter("sex");
           String phone=m.getParameter("phone");
           //String email=m.getParameter("email");
           String ccity=m.getParameter("ccity");
           String country=m.getParameter("country");
           String address=m.getParameter("address");
           String website=m.getParameter("website");
           String aboutme=m.getParameter("aboutme");
           out.println("<body bgcolor=gray><center><h1>Student Information</h1>");
           out.println("<table bgcolor=lightblue><tr><td>Photo of "+fname+" :</td><td><img src=/images/" +pic + " width=120px height=150px><br/></td></tr>");
           out.println("<tr><td>First Name:</td><td>"+fname+"</td></tr>");
           out.println("<tr><td>Last Name:</td><td>"+lname+"</td></tr>");
           out.println("<tr><td>DOB:</td><td>"+dob+"</td></tr>");
           out.println("<tr><td>Gender:</td><td>"+sex+"</td></tr>");
           out.println("<tr><td>Phone:</td><td>"+phone+"</td></tr>");
           //out.println("<tr><td>Email:</td><td>"+email+"</td></tr>");
           out.println("<tr><td>Current City:</td><td>"+ccity+"</td></tr>");
           out.println("<tr><td>Country:</td><td>"+country+"</td></tr>");
           out.println("<tr><td>Address:</td><td>"+address+"</td></tr>");
           out.println("<tr><td>Website:</td><td>"+website+"</td></tr>");
           out.println("<tr><td>About Me:</td><td>"+aboutme+"</td></tr>");
           out.println("</center></body>");
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
