<%-- 
    Document   : afteradminlogin
    Created on : Jun 26, 2013, 11:10:05 PM
    Author     : ICT
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        try
                               {
        String user=request.getParameter("username");
        String pass=request.getParameter("password");
        Config c=new Config();
       Connection con = c.getcon();
       String l="select *  from login  where username='"+user+"'and password='"+pass+"' ";
       Statement PStmt=con.createStatement();
        ResultSet rs=PStmt.executeQuery(l);


if(rs.next())
{
    session.setAttribute("username", user);
out.println("you have Login Successfully");
response.sendRedirect("adminmain.jsp");

}
else
{
out.println("Try again"+"you are enter username or password incorrect");

response.sendRedirect("adminlogin.jsp");


}
               }
        catch(Exception e)
                        {
                        }
        %>
    </body>
</html>