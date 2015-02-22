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
<h2>Admin Change Password</h2></div>
    <form action="afteradminchangepass.jsp" method="post">
        <table align="center">
<tr><td>Previous Password:</td>
<td><input type="password" name="prepasswd" placeholder="Previous Password" class="span3" /></td></tr>
<tr><td>New Password</td>
<td><input type="password" name="newpasswd" placeholder="new password" class="span3" /></td></tr>
<tr><td>Re Password</td>
<td><input type="password" name="repasswd" placeholder="re password" class="span3" /></td></tr>
<tr><td><input type="submit" value="Login" class="btn-large btn-primary" /></td>
<td><input type="reset" value="Reset" class="btn-large" /></td></tr>
</table>
</form>
</div>
</div>
</body>
</html>
