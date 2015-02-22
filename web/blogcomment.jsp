<%--
    Document   : comment
    Created on : Jun 27, 2013, 10:03:57 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comment</title>
    </head>
    <body>
            <%
        try
        {
        Config c = new Config();
        Connection con = c.getcon();
        String username =(String) session.getAttribute("username");
       // out.println(username);
        String comment=request.getParameter("comment");
        int blogc=0;
        String q="insert into blogcomment (username,comment,blogc) values(?,?,?)";
        PreparedStatement PStmt=con.prepareStatement(q);
        PStmt.setString(1, username);
        PStmt.setString(2, comment);
        PStmt.setInt(3, blogc);
        //out.print(PStmt);
        int result=PStmt.executeUpdate();
        if(result==1)
        {
        //out.println("you have Successfully Share Your view");
        response.sendRedirect("blogcomment.jsp");
        }
        else
        {
        //out.println("Try again");
        response.sendRedirect("blogcomment.jsp");
        }
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
        %>
    </body>
</html>
