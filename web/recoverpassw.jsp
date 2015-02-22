<%-- 
    Document   : recoverpassw
    Created on : Jun 28, 2013, 11:52:48 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="mail.AuthCode,java.sql.*,rp.Config"%>
<%@page import="mail.MailVerify,javax.mail.*"%>
<%@page import="java.security.MessageDigest"%>
<%@page import="com.sun.mail.smtp.DigestMD5"%>
<%

       String email=request.getParameter("email");
       Config c = new Config();
       Connection con = c.getcon();
       String qry="Select * from register where email='"+email+"'";
       Statement st1=con.createStatement();
       ResultSet rs=st1.executeQuery(qry);
    if(rs.next())
               {
       String username = rs.getString("username");
       String id =rs.getString("email");
       String passwd = rs.getString("password");
       String msg="Login Deatails:  Username is "+username+" and Passwd is "+passwd+". Now Click on following link to Login and Reset Your Password... http://localhost:8084/blog/changepasswd.jsp?Email="+email+"";
       MailVerify mail=new MailVerify(id, msg);
       mail.verify();
    }
    out.print("Mail sent successfully Login and RESET password.");
%>

