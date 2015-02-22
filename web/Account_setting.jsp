
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Account Setting</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />

<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<link href="assets/css/search.css" type="text/css" rel="stylesheet" />
<script src="assets/js/jquery-1.4.2.js" type="text/javascript"></script>
<script>
		  $(document).ready(function(){
				$('#login-trigger').click(function(){
					$(this).next('#login-content').slideToggle();
					$(this).toggleClass('active');					
					
					if ($(this).hasClass('active')) $(this).find('span').html('&#x25B2;')
						else $(this).find('span').html('&#x25BC;')
					})
				$('#signup-trigger').click(function(){
					$(this).next('#signup-content').slideToggle();
					$(this).toggleClass('active');	
									
					
					if ($(this).hasClass('active')) $(this).find('span').html('&#x25B2;')
						else $(this).find('span').html('&#x25BC;')
					})	
		  });
	</script>
	

</head>

<body background="images/bc.jpg">
    <%@include file="header1.jsp" %>
<div class="container">
<div class="row">
<div class="span10">
<h3>General Account Settings</h3>
<table class="table table-bordered">
<tr>
<td>User Name :</td>
<td>
       <%
        {
        Config c = new Config();
        Connection con = c.getcon();
        String username =(String) session.getAttribute("username");
        out.println(username);
        }
       %>

</td>
<td>
<a href="#"><i class="icon-pencil"></i>Edit</a>
</td>
</tr>

<tr>
<td> Email:</td>
<td> <%
        {
        Config c = new Config();
        Connection con = c.getcon();
        String email =(String) session.getAttribute("email");
        out.println(email);
        }
       %>
 </td>
<td><a href="#"><i class="icon-pencil"></i>Edit</a>
</td></tr>

<tr>
<td> Password:</td>
<td>Update password about one month</td>
				
<td>

<div class="signup">
			<a id="signup-trigger" href="#">
				<i class="icon-pencil"></i>Edit
			</a>
			<div style="display: block;" id="signup-content">			
                            <form action="forgetpass.jsp" method="post">
                            <table class="table table-bordered">
			<tr><td>Previous Password</td>
                            <td><input type="password" name="prepasswd" placeholder="Previous Password"  /></td></tr>
			<tr><td>New Password</td>
                            <td><input type="password" name="newpasswd" placeholder="New Password"  /></td></tr>
			<tr><td>Re Password</td>
                            <td><input type="password" name="rpassword" placeholder="Re Password"  /></td></tr>
			<tr><td colspan="2"><input type="submit" value="send" class="btn-large btn-success"  /></td></tr>
			</table>
                            </form>
						
			</div></div>

</td></tr>
</table>
</div>
</div>
</div>

</body>
</html>