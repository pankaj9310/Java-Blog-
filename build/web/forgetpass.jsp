<%-- 
    Document   : forgetpass
    Created on : Jun 26, 2013, 11:58:47 PM
    Author     : ICT
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <%
        Config c = new Config();
        Connection con = c.getcon();
        String apss=null;
  String apass= request.getParameter("prepasswd");
  out.print("password:  "+apass);
  String fpass= request.getParameter("newpasswd");
  out.print("password:  "+fpass);
  String username=(String)session.getAttribute("username");
  out.println("username :"+username);
  MessageDigest MD5=MessageDigest.getInstance("MD5");
try{
               MD5.update(fpass.getBytes(),0,fpass.getBytes().length);
        byte[] hashvalue=MD5.digest();
         apass=new BASE64Encoder().encode(hashvalue);
                             }
            catch(Exception e){e.getStackTrace();}
             
    String query="Update register set password = '"+apass+"' where username='"+username+"' ";
    out.print(query);
    Statement st=con.createStatement();
    st.executeUpdate(query);
%>
    </body>
    <h1>Congrats!!! Your Password Changed Successfully.</h1>
</html>