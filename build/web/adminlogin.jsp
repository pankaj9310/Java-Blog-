<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Admin Login</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
</head>

<body background="images/bc.jpg">
    <%@include file="adminheader.jsp" %>
    <div class="container">
<div class="row-fluid">
<div class="modal-header" align="center">
    <h4 style="color: blue">Please enter your username and password to log in</h4></div>
<form action="afteradminlogin.jsp" method="post">
    <table align="center" style="border: 2px solid #ccc; width: 400px">
        <tr align="center"><td><strong>Username</strong></td></tr><tr align="center">
<td><input type="text" name="username" placeholder="Username" class="span3" /></td></tr>
        <tr align="center"><td><strong>Password</strong></td></tr><tr align="center">
<td><input type="password" name="password" placeholder="password" class="span3" /></td></tr>
        <tr align="center"><td><input type="submit" value="Login" class=" btn-primary" /></td>
</tr>
</table>
</form>
</div>
</div>
</body>
</html>
