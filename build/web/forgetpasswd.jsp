<%-- 
    Document   : forgetpasswd
    Created on : Jun 25, 2013, 7:14:56 PM
    Author     : ICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
    </head>
    <body background="images/bc.jpg">
        <%@include file="header.jsp" %>
        <form action="recoverpassw.jsp" method="post">
            <table align="center">
                <tr><td>Email Id</td>
                    <td><input type="email" name="email" placeholder="Email Id"</td>
                </tr>
                <tr>
                    <td><input type="submit" value="Send" class="btn-success"/></td>
                    <td><input type="reset" value="Cancel" class="btn-info"/></td>
                </tr>
            </table>

        </form>
    </body>
</html>