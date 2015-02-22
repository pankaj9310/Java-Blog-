<%-- 
    Document   : blog
    Created on : Jun 26, 2013, 5:16:01 PM
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
   <%@include file="header2.jsp" %>
   
<div class="container">
<div class="row">
    <div class="span8" style="margin-left: 100px">
 <p style="margin:8px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify; background-color: #FFF ">
   <img src="images/user.jpg" style="width:60px; height:60px; margin: 5px; padding: 3px; z-index: 300" alt="" align="left"/>
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
             %>
             <a href="#?user=<% out.print(rs.getString("username"));%>"><% out.print(rs.getString("username")); %></a>
<br/>
 <%
out.print(rs.getString("date"));
%>
<br/>
 <%
out.print(rs.getString("title"));
%>
<br/>
 <%
        out.print(rs.getString("blogdetail"));
}
             }
%>
</p>
<form action="blogcomment.jsp" method="post">
<i class="icon-comment"></i>Comment<br />

<textarea rows="1" cols="1" class="span8" name="comment"></textarea>
<br/>
<button type="submit" class="btn-primary" >Post</button>
</form> 
</div>
<div class="span2" style="height:400px; background-color:#FFF; float:right;margin:1px; margin-right: 100px; overflow: auto; ">
   <h3>Blog Archive</h3>
     <%
             Config c=new Config();
             Connection con = c.getcon();
             String bu="select * from blog order by blogid desc";
             Statement stmt7=con.createStatement();
             ResultSet rs7=stmt7.executeQuery(bu);
            %>
            <%
             while(rs7.next())
             {

    %>

    <p style=" margin: 10px; font-weight: bold"> <a href="blog.jsp?blogid=<% out.print(rs7.getString("blogid"));%>"><% out.print(rs7.getString("title")); %>
        </a></p>
    <%
 }
    %>

    <br/>
</div>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>