<%-- 
    Document   : pro
    Created on : Jun 30, 2013, 10:08:46 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,org.apache.commons.fileupload.*,org.apache.commons.io.*,com.oreilly.servlet.MultipartRequest,rp.Config"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/bootstrap.min.js"></script> 
    </head>
    <body background="images/bc.jpg">
        <%@include file="header1.jsp" %>
        <%@include file="header2.jsp"  %>
        <div class="container">
<div class="row">
<div class="span3">
<table class="table">
<tr>
    <td><img src="images/hackman.gif" height="60" width="60" alt="" /></td>
<td>User Name</td>
</tr>
<tr>
<td colspan="2"><a href="Profile.jsp">
Profile</a></td></tr>
<tr>
    <td colspan="2"><a href="#" >Message</a></td></tr>
    <tr><td colspan="2"><a href="#" >My Activity</a></td></tr>
    <tr><td colspan="2"><a href="#myModal2"  data-toggle="modal">Create Blog</a></td></tr>

</table>
</div>
<div class="span9">
        <div class="modal-header">
                    <h3 id="myModalLabel"><center>Profile Details.</center></h3>
</div>
<%
try{
    String email=(String)session.getAttribute("email");
    String username=(String)session.getAttribute("username");
           Config c=new Config();
           Connection con = c.getcon();
           MultipartRequest m=new MultipartRequest(request,"C:/Users/ICT/Desktop/blog1/web/uploadimg/");
           String pic=m.getFilesystemName("pic");
           out.println("pic is"+pic);
           String fname=m.getParameter("fname");
           String lname=m.getParameter("lname");
           String d = m.getParameter("day");
           String ma = m.getParameter("month");
           String y = m.getParameter("year");
           String dob = d+ma+y;
         //  String dob=m.getParameter("dob");
           String sex=m.getParameter("sex");
           String phone=m.getParameter("phone");
           String ccity=m.getParameter("ccity");
           String country=m.getParameter("country");
           String address=m.getParameter("address");
           String website=m.getParameter("website");
           String aboutme=m.getParameter("aboutme");
          String q="insert into profile(username,pic,email,fname,lname,dob,sex,phone,ccity,country,address,website,aboutme)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement PStmt=con.prepareStatement(q);
        PStmt.setString(1, username);
        PStmt.setString(2, pic);
        out.println(pic);
%>
     <img src="uploadimg/<%= pic %>" height="120px" width="120px" alt="" />

    <%
        PStmt.setString(3, email);
        out.print(email);
        PStmt.setString(4, fname);
        out.print(fname);
        PStmt.setString(5, lname);
        out.print(lname);
        PStmt.setString(6, dob);
        out.print(dob);
        PStmt.setString(7, sex);
        out.print(sex);
        PStmt.setString(8, phone);
        out.print(phone);
        PStmt.setString(9, ccity);
        out.print(ccity);
        PStmt.setString(10, country);
        out.print(country);
        PStmt.setString(11, address);
        out.print(address);
        PStmt.setString(12, website);
        out.print(website);
        PStmt.setString(13, aboutme);
        out.print(aboutme);
        int result=PStmt.executeUpdate();
  //      out.println(result);

if(result==1)
{
session.setAttribute("pic", pic);

//session.setAttribute("fname", fname);
//session.setAttribute("lanme", lname);
//session.setAttribute("dob",dob );
//session.setAttribute("sex", sex);
//session.setAttribute("phone", phone);
//session.setAttribute("ccity", ccity);
//session.setAttribute("country", country);
//session.setAttribute("address", address);
//session.setAttribute("website", website);
//session.setAttribute("aboutme", aboutme);
out.println("you have Successfully sqved your data");
response.sendRedirect("aftereditprofile.jsp");

}
else
{
out.println("Try again");

response.sendRedirect("Profile.jsp");


}
    }
          catch(Exception e2)
{
     e2.printStackTrace();
}
        %>
       
</div>
</div>
        </div>
<%@include file="footer.jsp" %>
<script type="text/javascript" src="assets/js/bootstrap-button.js"></script>
		<script type="text/javascript" src="assets/js/jquery.validate.min.js"></script>
		<script type="text/javascript" src="assets/js/prettify/prettify.js"></script>

		<script type="text/javascript" src="script.js"></script>
    </body>
</html>
<!-- Modal -->
<div id="myModal2" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
<h3 id="myModalLabel">Create Blog</h3>
</div><form action="afterblog.jsp" method="post" enctype="multipart/form-data" >
<!--div class="modal-body" -->
Title<input type="text" name="title" align="center"/>
<textarea rows="15" cols="15" style="height:300px; width:95%; margin-left:5px" placeholder="create a new blog........" name="blogdetail"></textarea>
<div class="modal-footer">
<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
<button type="submit" class="btn btn-primary">Post Blog</button>
</div>
</form>
</div>