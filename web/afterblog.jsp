<%-- 
    Document   : afterblog
    Created on : Jun 25, 2013, 12:17:46 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Blog</title>
    </head>
    <body>
            <%
        try
        {
           
        Config c = new Config();
       Connection con = c.getcon();
        String username =(String) session.getAttribute("username");
     //   out.println(username);
       String title=request.getParameter("title");
        String blogdetail=request.getParameter("blogdetail");
        int status=0;
        String q="insert into blog(username,title,blogdetail,status)values(?,?,?,?)";
        PreparedStatement PStmt=con.prepareStatement(q);
        PStmt.setString(1, username);
        PStmt.setString(2, title);

        PStmt.setString(3, blogdetail);
        PStmt.setInt(4, status);
       // out.print(PStmt);
         int result=PStmt.executeUpdate();
if(result==1)
{

out.println("you have Successfully created blog");
response.sendRedirect("knowit.jsp");
}
else
{
out.println("Try again");
}
          }
catch(Exception e)
{
}

        %>
    </body>
</html>