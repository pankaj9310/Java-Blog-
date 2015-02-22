<%-- 
    Document   : Verification
    Created on : 10 Jan, 2013, 11:41:23 PM
    Author     : ICT
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<jsp:scriptlet>
  String auth =  request.getParameter("Auth_Code");
  String email=  request.getParameter("Email");
    
     Config c = new Config();
       Connection con = c.getcon();
    String query="Update register set Flag=1 where Auth_code='"+auth+"' and email='"+email+"'";

//    out.print(query);
    Statement st=con.createStatement();
    st.executeUpdate(query);
    
</jsp:scriptlet>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Verification</title>
    </head>
    <body>
        <h1>You are successfully verified. </h1>
            <h3>Now Login and update your profile and enjoy the services..</h3>
        <a href="index.jsp"> Home </a>
    </body>
</html>
