<%--
    Document   : aftershare
    Created on : Jun 26, 2013, 12:17:46 AM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Share It</title>
    </head>
    <body>
            <%
        try
        {

        Config c = new Config();
       Connection con = c.getcon();
        String username =(String) session.getAttribute("username");
      //out.println(username);
       String share=request.getParameter("share");
        int status=0;
        String q="insert into share(username,share,status)values(?,?,?)";
        PreparedStatement PStmt=con.prepareStatement(q);
        PStmt.setString(1, username);
        PStmt.setString(2, share);
        PStmt.setInt(3, status);
        //out.print(PStmt);
         int result=PStmt.executeUpdate();
if(result==1)
{
out.println("you have Successfully Share Your view");
response.sendRedirect("shareit.jsp");
}
else
{
out.println("Try again");
response.sendRedirect("shareit.jsp");
}
          }
catch(Exception e)
{
}

        %>
    </body>
</html>