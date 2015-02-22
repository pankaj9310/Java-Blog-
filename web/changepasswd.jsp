<%-- 
    Document   : changepasswd
    Created on : Jun 25, 2013, 3:33:46 PM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
    </head>
    <body background="images/bc.jpg">
        <form action="userchangepass.jsp?Email=<% out.print(request.getParameter("Email"));%>" method="post">
            <table align="center">
    <tr>
    <td>New password: </td>
    <td width="200px">
    <input type="password" name="password" placeholder="Enter new passwd" />
    </td></tr>
    <tr><td>Re-password: </td>
    <td width="200px">
    <input type="password" name="repasswd" placeholder="Enter new passwd" />
    </td></tr>
    <tr><td colspan="2">
       <input type="submit" class="btn-primary" value="Update" />
        </td>
    </tr>
    </table>
        </form>
    </body>
</html>
