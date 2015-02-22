<%-- 
    Document   : aftereditprofile
    Created on : Jun 22, 2013, 5:04:34 PM
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
            <%
           String email=(String)session.getAttribute("email");
           String pic=(String) session.getAttribute("pic");
           //out.println(pic);
           String username=(String)session.getAttribute("username");
           Config c = new Config();
        Connection con = c.getcon();
        String fname=request.getParameter("fname");

        String lname=request.getParameter("lname");
        //Date dob= new Date(Integer.parseInt(request.getParameter("day")), Integer.parseInt(request.getParameter("month")), Integer.parseInt(request.getParameter("year"))-1900);
       String d = request.getParameter("day");
       String m = request.getParameter("month");
       String y = request.getParameter("year");
       String dob = d+m+y;
        String sex=request.getParameter("sex");
        String phone=request.getParameter("phone");
        String ccity=request.getParameter("ccity");
        String country=request.getParameter("country");
        String address=request.getParameter("address");
        String website=request.getParameter("website");
        String aboutme=request.getParameter("aboutme");
        String l="select * from profile where email='"+email+"' ";
        Statement PStmt=con.createStatement();
        ResultSet rs=PStmt.executeQuery(l);
//       out.print(rs);
        %>
<div class="row">
<div class="span3">
<table class="table">
<tr>
    <td>
         <img src="uploadimg/<% out.println(pic);%>" height="60" width="60" alt="" />
       
     
       </td>
    <td><%out.print(username);%></td>
</tr>
<tr>
<td colspan="2"><a href="aftereditprofile.jsp">
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
        
        <p style="margin:5px; padding:5px; z-index:100; font-size:17px; font-style:normal; text-align:justify; color:#000; font-family: 'Times New Roman, Times, serif'  " align="center">
     <%
             if(rs.next())
             {
            // out.println("username");
          //   out.println(rs.getString("username"));
out.println("First name:");
out.println(rs.getString("fname"));
%><br/>
<%
 out.println("Last Name:");
out.println(rs.getString("lname"));
%><br/>
<%
out.println("DOB:");
out.println(rs.getString("dob"));
%><br/>
<%
 out.println("Gender:");
out.println(rs.getString("sex"));
%><br/>
<%
out.println("Mobile Number:");
out.println(rs.getString("phone"));
%><br/>
<%
out.println("Email:");
out.println(rs.getString("email"));
%><br/>
<%
 out.println("Current City:");
out.println(rs.getString("ccity"));
%><br/>
<%
out.println("Country:");
out.println(rs.getString("country"));
%><br/>
<%
 out.println("Address:");
out.println(rs.getString("address"));
%><br/>
<%
out.println("Website:");
out.println(rs.getString("website"));
%><br/>
<%
 out.println("About Me:");
out.println(rs.getString("aboutme"));
%><br/>
<%
}
%>
     </p>
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
</div><form action="afterblog.jsp" method="post">
<!--div class="modal-body" -->
Title<input type="text" name="title" align="center"/>
<textarea rows="15" cols="15" style="height:300px; width:95%; margin-left:5px" placeholder="create a new blog........" name="blogdetail"></textarea>
<div class="modal-footer">
<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
<button type="submit" class="btn btn-primary">Post Blog</button>
</div>
</form>
</div>