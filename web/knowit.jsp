<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Web design india, website design india, Website development india, Website development Jaipur</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>

<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
</head>

<body background="images/bc.jpg">
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

<div class="row" style="width:100%;">

<div class="span4">

	<div id="this-carousel-id" class="carousel slide" style="margin-right:30px; height:410px; background-color:#fff; font-size:20px">
            
 
            <p style="margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify ">
             <img src="images/user.jpg" style="width:60px; height:60px; margin: 2px; padding: 2px" alt="" align="left"/>
   <%
Config c = new Config();
             Connection con = c.getcon();
        String username=request.getParameter("username");
        String date =request.getParameter("date");
        String title=request.getParameter("title");
        String blogdetail=request.getParameter("blogdetail");
        String l="select * from blog order by blogid desc";
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery(l);
             //rs.getString('').substring(0,500);
%>
 <%
             if(rs.next())
             {
             %>
              <a href="aftereditprofile.jsp?user=<% out.print(rs.getString("username"));%>"><% out.print(rs.getString("username")); %></a>
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
 if(rs.getString("blogdetail").length()>845)
     {
out.print(rs.getString("blogdetail").substring(0, 845));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}
%>
<a href="blog.jsp?blogid=<% out.print(rs.getString("blogid"));%>">Read more....</a>
</p>
      </div>

     </div>

     <div class="span3" style="height:200px; background-color:#FFF; margin:3px; font-size:20px">
         <p style="margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify ">
             <img src="images/user.jpg" style="width:60px; height:60px; margin: 2px; padding: 2px" alt="" align="left"/>
            <%
             if(rs.next())
             {
             %>
              <a href="aftereditprofile.jsp?user=<% out.print(rs.getString("username"));%>"><% out.print(rs.getString("username")); %></a>
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
 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}
%>
<a href="blog.jsp?blogid=<% out.print(rs.getString("blogid"));%>">Read more....</a>
        </p>

     </div>
	  <div class="span3" style="height:200px; background-color:#FFF; margin:3px; font-size:20px">
               <p style="margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify ">
                   <img src="images/user.jpg" style="width:60px; height:60px; margin: 5px; padding: 3px; z-index: 300" alt="" align="left"/>
     <%
             String l2="select * from blog order by blogid desc";
             Statement stmt2=con.createStatement();
             ResultSet rs2=stmt2.executeQuery(l2);
            %>
            <%
             if(rs.next())
             {
             %>
              <a href="aftereditprofile.jsp?user=<% out.print(rs.getString("username"));%>"><% out.print(rs.getString("username")); %></a>
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
 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}
             %>
           <a href="blog.jsp?blogid=<% out.print(rs.getString("blogid"));%>">Read more....</a>
               </p>
     </div>
    <div class="span2" style="height:400px; background-color:#FFF; float:right;margin:1px; overflow: auto;">
    <h3>Blog Archive</h3>
     <%
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

    <div class="span3" style="height:200px; background-color:#FFF; margin:3px; font-size:20px">
        <p style="margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify ">
            <img src="images/user.jpg" style="width:60px; height:60px; margin: 5px; padding: 3px; z-index: 300" alt="" align="left"/>

      <%
             String l5="select * from blog order by blogid desc";
             Statement stmt5=con.createStatement();
             ResultSet rs5=stmt5.executeQuery(l5);
            %>
            <%
             if(rs.next())
             {
             %>
             <a href="aftereditprofile.jsp?user=<% out.print(rs.getString("username"));%>"><% out.print(rs.getString("username")); %></a>
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
 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}
%>
    <a href="blog.jsp?blogid=<% out.print(rs.getString("blogid"));%>">Read more....</a>
        </p>
    </div>
    <div class="span3" style="height:200px; background-color:#FFF; margin:3px; font-size:20px">
     <p style="margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify ">
             <img src="images/user.jpg" style="width:60px; height:60px; margin: 2px; padding: 2px" alt="" align="left"/>
             <%
             String l4="select * from blog order by blogid desc";
             Statement stmt4=con.createStatement();
             ResultSet rs4=stmt4.executeQuery(l4);
            %>
            <%
             if(rs.next())
             {
             %>
              <a href="aftereditprofile.jsp?user=<% out.print(rs.getString("username"));%>"><% out.print(rs.getString("username")); %></a>
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
 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}
%>
     <a href="blog.jsp?blogid=<% out.print(rs.getString("blogid"));%>">Read more....</a>
     </p>
    </div>
</div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>