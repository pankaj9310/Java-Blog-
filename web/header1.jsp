<%-- 
    Document   : header1
    Created on : Jun 18, 2013, 11:42:22 AM
    Author     : ICT
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-dropdown.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-typeahead.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-button.js"></script>
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
  <%

       String pic1=(String) session.getAttribute("pic");
       //out.print(pic1);
       %>
<div class="navbar">
<div class="navbar-inner">
<div class="container">
<a href="#" class="brand"><img src="images/logo.jpg" height="60px" width="auto" /></a>
<ul class="nav pull-right" >
<li ><a href="#"><img src="images/meassag1.jpg" height="23px" width="25px" align="middle"/></a></li>
<li class="dropdown">
<a class="dropdown-toggle" data-toggle="dropdown" href="#"><img src="uploadimg/<% out.println(pic1);%>" height="23" width="23" alt=""  class="img-rounded"  /></a>
<ul class="dropdown-menu">
<li><a href="aftereditprofile.jsp"> 
        <%
        
       String user=(String) session.getAttribute("username");
        String e =(String) session.getAttribute("email");
        out.println(user);
        
       %>
    </a></li>
       <li><a href="Profile.jsp?e=<% out.print(e); %>">Edit Profile</a></li>
</ul>
</li>
<li class="dropdown">
<a class="dropdown-toggle" data-toggle="dropdown" href="#"><img src="images/images_096.jpg" height="23px" width="25px" align="middle"/></a>
<ul class="dropdown-menu">
<li><a href="Account_setting.jsp">Account Setting</a></li>
<li><form action="logout.jsp"> <a href="#"><button class="btn-info">Logout</button></a></form></li>
</ul>
</li>
</ul>
</div>
</div>
</div>
</body>
</html>