<%-- 
    Document   : blogdelete
    Created on : Jun 27, 2013, 2:00:45 PM
    Author     : ICT
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <%
         try{

    String username =  request.getParameter("user");
  //out.println("username"+username);
        Config c=new Config();
        Connection con = c.getcon();
    String query1="delete from blog where username='"+username+"'";
    Statement st=con.createStatement();
    st.executeUpdate(query1);
    //System.out.println(query1);

        response.sendRedirect("blogdetail.jsp");
   }
         catch(Exception e)
                        {
                        e.printStackTrace();
                         }
%>
    </body>
</html>
