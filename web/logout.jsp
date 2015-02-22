<%-- 
    Document   : logout
    Created on : Jun 18, 2013, 11:27:34 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config" %>
<!DOCTYPE html>
<html>
    <head>
     
    </head>
    <body>
        <%
       //con.destroy();
      // session.destroy();
        session.invalidate();
       response.sendRedirect("index.jsp");
      
    
       %>
    </body>
</html>
