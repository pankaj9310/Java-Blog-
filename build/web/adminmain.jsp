<%-- 
    Document   : adminmain
    Created on : Jun 24, 2013, 2:09:38 PM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Main</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
<style type="text/css">
         .navbar-inner{
			 background:#000;
			 border-bottom:5px solid #007AF4;
			 height:70px;

			 }
			.navbar-inner .brand{color:#FFF}

</style>
</head>


<body background="images/bc.jpg">
    <%@include file="adminheader.jsp" %>

<div class="container">
<div class="row">

    <div class="span3" align="center">
    <table class="table table-bordered" align="center">
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
    
</div></div>
</div>
</body>
</html>