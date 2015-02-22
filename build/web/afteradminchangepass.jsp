<%-- 
    Document   : afteradminchangepass
    Created on : Jun 27, 2013, 11:30:02 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Change Password</title>
    </head>
    <body>
        <%
          Config c = new Config();
          Connection con = c.getcon();

            String prepass=request.getParameter("prepasswd");
            String newpass=request.getParameter("newpasswd");

            String q="update login set password='"+newpass+"'";

            PreparedStatement pstmt=con.prepareStatement(q);

             int result=pstmt.executeUpdate();

             if(result==1)
             {
                 out.println("password change successfull");
             }
             else
             {
                 out.println("try again");
             }
        %>
    </body>
</html>
