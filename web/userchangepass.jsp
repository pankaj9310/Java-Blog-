<%-- 
    Document   : userchangepass
    Created on : Jun 29, 2013, 12:41:07 PM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
             <%
             String apass=null;
  String fpass= request.getParameter("password");
  out.print("password:  "+fpass);
  String email=   request.getParameter("Email");
  out.println("email :"+email);
  MessageDigest MD5=MessageDigest.getInstance("MD5");
try{
               MD5.update(fpass.getBytes(),0,fpass.getBytes().length);
        byte[] hashvalue=MD5.digest();
         apass=new BASE64Encoder().encode(hashvalue);
                             }
            catch(Exception e){e.getStackTrace();}
             Config c = new Config();
             Connection con = c.getcon();
    String query="Update register set password = '"+apass+"' where email='"+email+"' ";
    out.print(query);
    Statement st=con.createStatement();
    st.executeUpdate(query);
%>
    </body>
</html>
