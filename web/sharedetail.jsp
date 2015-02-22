<%-- 
    Document   : sharedetail
    Created on : Jun 28, 2013, 9:01:10 PM
    Author     : ICT
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Main</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
</head>

<body background="images/bc.jpg">
    <%@ include file="adminheader.jsp"
        %>
<div class="container">
<div class="row">
<div class="span3">
 <table class="table table-bordered">
<tr>
<td><a href="userdetail.jsp">User Detail</a> </td>
</tr>
<tr>
<td><a href="blogdetail.jsp">Blog Detail
</a></td></tr>
    <tr>
<td><a href="sharedetail.jsp">Share Detail
</a></td></tr>
<tr>
    <td><a href="adminchangepass.jsp" >Change Password</a></td></tr>
    <tr><td><form action="logout.jsp"> <a href="#"><button class="btn-info">Logout</button></a></form></td></tr>

</table>
</div>
<div class="span9">
     <%
            String username="";

             Config c = new Config();
             Connection con = c.getcon();

             String q="select * from share";

             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery(q);
%>
 <div class="modal-header">
                    <h3 id="myModalLabel"><center>Share Details.</center></h3>
</div>
                <table class="table table-bordered">
                     <tr>
                        <td><strong>Username</strong></td>
                        <td><strong>Date & Time</strong> </td>
                        <td colspan="3"></td>
                    </tr>
     <%
             while(rs.next())
             {
             %>

             <tr><td>

                     <%
out.print(rs.getString("username"));
%>
 </td><td>

                     <%
out.print(rs.getString("date"));
%>


                 </td><td><i class="icon-folder-open"></i>
                     <a href="shareview.jsp?shareid=<% out.print(rs.getString("shareid"));%>">view</a>
                     </td>
                     <td>
                         <a href="#">Accept Share</a>
                     </td>
                 <td><i class="icon-remove"></i><a href="sharedelete.jsp?user=<% out.print(rs.getString("username"));%>">Delete</a></td></tr>

             <% }
                 %>
                </table>
</div></div>
</div>
</body>
</html>