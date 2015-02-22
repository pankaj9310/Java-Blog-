<%-- 
    Document   : blogview
    Created on : Jun 28, 2013, 1:45:17 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Blog</title>
<link rel="shortcut icon" href="images/gnx.JPG" type="image/jpg" />
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-tab.js"></script>
</head>

    <body  background="images/bc.jpg">
 <%
    String User =(String) session.getAttribute("username");
    if(User!=null)
               {%>

        <%@include file="header1.jsp" %>
        <%  }
                else
                {%>
                 <%@ include file="header.jsp" %>
                 <% }
   %>

<div class="container">
<div class="row">
    <div class="span8" style="margin-left: 100px">
 <p style="margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify; background-color: #FFF ">
     <%
         {
        String blogid =request.getParameter("blogid");
        Config c=new Config();
        Connection con = c.getcon();
        String l="select * from blog where blogid='"+blogid+"'";
        Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery(l);
             if(rs.next())
             {
        out.print(rs.getString("blogdetail"));
}
             }
%>
</p>
    </div>
</div></div>
    </body>
</html>
