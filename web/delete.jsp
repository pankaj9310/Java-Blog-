<%-- 
    Document   : delete.jsp
    Created on : Jun 26, 2013, 11:36:05 PM
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
    String query1="delete from register where username='"+username+"'";
    Statement st=con.createStatement();
    st.executeUpdate(query1);
    //System.out.println(query1);

        response.sendRedirect("userdetail.jsp");
   }
         catch(Exception e)
                        {
                        e.printStackTrace();
                         }
%>
    </body>
</html>