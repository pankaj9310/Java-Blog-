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
<form action="afterlogin.jsp" method="post">
<h3>Log in using your exisiting GenX Soft Account.</h3>
<table>
    <tr><td><input type="text" placeholder="User Name" maxlength="20" name="username" required="true"  />
</td>
</tr>
<tr><td><input type="password" placeholder="password" maxlength="20" name="password" required="true" />
</td>
</tr>
<tr><td><input type="checkbox" />&nbsp;Remember me ?</td></tr>
<tr><td><button type="submit" class="btn btn-primary btn-large">Log in</button>
	    			      <a href="#">&nbsp; &nbsp;Forgot your password?</a>
                          </td>
                          </tr>
</table>
</form>
</div>
<div class="right">
<h3>Log in using social Networking.</h3>
<table>
<tr>
<td><a href="#"><img src="images/fb.JPG" width="234" /></a></td></tr>
<tr><td><a href="#"><img src="images/gp.JPG" width="234" /></a></td></tr>
<tr><td><br /></td></tr>
<tr><td>Don't have an account?<a href="form.html">Sign up for GenxSoft</a></td></tr>
</table>
</div>
</div>
</body>
</html>
