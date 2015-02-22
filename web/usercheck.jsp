<%--     Document   : usercheck
    Created on : Jun 28, 2013, 11:50:21 PM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>JSP Page</title>
    </head>
    <body>
              <%
               Config c=new Config();
       Connection con = c.getcon();
        String username=request.getParameter("username");
       String l="select *  from register  where username="+username+"";
         Statement PStmt=con.createStatement();
        ResultSet rs=PStmt.executeQuery(l);
try{Thread.sleep(5000);}catch(Exception e){}
if(rs.equals(username)){
%>
<font color="red" ><strong>User already exists</strong></font>
<%
}else{
%>
<font color="green" ><strong>User  name available</strong></font>
<%
}
%>
    </body>
</html>
