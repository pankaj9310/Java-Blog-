<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login Form</title>
<link rel="shortcut icon" href="images/gnx.JPG" type="image/jpg" />
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<style type="text/css">
#main
{
	height:300px;
	width:600px;
	margin:auto;
	z-index:50;
	background-image:
	url(images/bc.jpg);
	padding:5px;
}
.left
{height:290px;
	width:290px;
	float:left;
	margin:5px;
}
.right
{
	height:290px;
	width:289px;
	float:left;
	margin:5px;
	
}
</style>
</head>

<body>
<div id="main">

<div class="left">
<form action="" method="post">
<h3>Create a new account on GenX Soft.</h3>
<table>
<tr><td><input type="text" placeholder="User Name" maxlength="20" name="username" required="true" />
</td>
</tr>
    <tr><td><input type="password" placeholder="Password" maxlength="20" name="password" required="true" />
</td>
</tr>
<tr><td><input type="password" placeholder="Confirm Password" maxlength="20" name="conpassword" required="true" />
</td>
</tr>
    <tr><td><input type="email" placeholder="Email Address" name="email" required="ture" />
</td>
</tr>
    <tr><td><input type="text" placeholder="Phone Number" maxlength="10" name="phone" required="true" />
</td>
</tr>
<tr><td>
 <button type="submit" class="btn btn-primary btn-large">Submit</button>
	    			      <button type="reset" class="btn btn-error btn-large">Reset</button>
                          </td></tr>
</table>
</form>
</div>
<div class="right">
<h3>Register by  using social Networking.</h3>
<table>
<tr>
    <td><a href="#"><img src="images/fbr.JPG" width="234" /></a></td></tr>
<tr><td><a href="#"><img src="images/gr.JPG" width="234" /></a></td></tr>
</table>
</div>
</div>
</body>
</html>
