<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="shortcut icon" href="images/gnx.JPG" type="image/jpg" />
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
 <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
 <link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
<link href="style.css" rel="stylesheet" type="text/css" />
<script  src="js/modernizr-2.5.3.min.js"  type="text/javascript"></script>
         <script type="text/javascript" src="assets/js/jquery-1.7.1.min.js"></script>

	  <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-button.js"></script>
		<script type="text/javascript" src="assets/js/jquery.validate.min.js"></script>
		<script type="text/javascript" src="assets/js/prettify/prettify.js"></script>

		<script type="text/javascript" src="script.js"></script> 
        <style type="text/css">
#main
{
	height:210px;
	width:600px;
	margin:auto;
	z-index:50;
	background-image:
	url(images/bc.jpg);
	padding:5px;
}
.left
{height:190px;
	width:290px;
	float:left;
	margin:5px;
}
.right
{
	height:190px;
	width:289px;
	float:left;
	margin:5px;
	
}
        </style>
<script type="text/javascript">
function loadXMLDoc()
{
var xmlhttp;
var k=document.getElementById("id2").value;
var urls="pass.jsp?ver="+k;

if (window.XMLHttpRequest)
  {
  xmlhttp=new XMLHttpRequest();
  }
else
  {
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4)
    {
        //document.getElementById("err").style.color="red";
        document.getElementById("err").innerHTML=xmlhttp.responseText;

    }
  }
xmlhttp.open("GET",urls,true);
xmlhttp.send();
}
</script>
                <script type="text/javascript">(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/en_US/all.js#xfbml=1&appId=APP_ID";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>
</head>

<body>
<div class="container">
<div class="footer" align="center">
<a href="http://www.genxsoftindia.com">Home</a>||
<a href="http://www.genxsoftindia.com/about.php">About</a>||
Follow us
<a href="#"><img src="images/facebook.png" /></a>
<a href="#"><img src="images/twitter.png" /></a>
<a href="#"><img src="images/linkedin.png" /></a>
<a href="#"><img src="images/blogger.png" /></a><br />
All Rights Are Reserved Copyright &copy; GenX Soft Technologies Pvt.Ltd. @ 2013
</div>
</div>
</body>
</html>
<!-- Modal -->
<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:800px">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
<h3 id="myModalLabel">Create a new account on GenX Soft.</h3>
</div>
<div class="modal-body">   
<div class="container" style="background-image:url(images/bc.jpg)">
				<div class="row">
                                    <div id="maincontent" class="span5 pull-left">
                                    <div id="demo" class="tab-pane active">
						<form action="afterregister.jsp" id="contact-form" class="form-horizontal" method="post">
                                                      
						    <div class="control-group">
						      <label class="control-label" for="name">User Name</label>
						      <div class="controls">
                                                          <div class="input-prepend">
				<span class="add-on"><i class="icon-user"></i></span>
	     <input type="text" class="input-large" name="username" id="username" placeholder="User Name" onkeyup="loadXMLDoc()"/>
						     <span id="err"> </span>
                                                          </div>
                                                      </div>
						    </div>
                            <div class="control-group">
						      <label class="control-label" for="password">Password</label>
						      <div class="controls">
                                                          <div class="input-prepend">
				<span class="add-on"><i class="icon-lock"></i></span>
						        <input type="password" class="input-large" name="passwd" id="passwd" placeholder="******"/>
						      </div>
						    </div>
                            </div>
                             <div class="control-group">
						      <label class="control-label" for="conpassword">Confirm Password</label>
						      <div class="controls">
                                                          <div class="input-prepend">
				<span class="add-on"><i class="icon-lock"></i></span>
						        <input type="password" class="input-large" name="conpasswd" id="conpasswd" placeholder="******"/>
						      </div>
						    </div>
                             </div>
						    <div class="control-group">
						      <label class="control-label" for="email">Email Address</label>
						      <div class="controls">
                                                          <div class="input-prepend">
				<span class="add-on"><i class="icon-envelope"></i></span>
						        <input type="text" class="input-large" name="email" id="email" placeholder="Email address"/>
						      </div>
						    </div>
                                                    </div>
						    <div class="control-group">
						      <label class="control-label" for="phone">Mobile No.</label>
						      <div class="controls">
                                                <div class="input-prepend">
				<span class="add-on"><i class="icon-iphone-shake"></i></span>
						        <input type="text" class="input-large" name="phone" id="phone" maxlength="10" placeholder="Mobile number"/>
						      
                                                        
                                                          </div>
						    </div>
                                                    </div>
						   
                           
	              <div class="control-group">
		<label class="control-label"></label>
	      <div class="controls">
			             <button type="submit" class="btn btn-success">Create My Account</button>
	    			      <button type="reset" class="btn">Cancel</button>
	        			</div>
						</div>
						</form>
                                    </div>
</div>
</div>
</div>    
</div>
</div>


<div id="myModal1" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style=" width:625px">
<div class="modal-header">
<button type="button" class="close" data-dismiss="modal" aria-hidden="true">x</button>
<h3 id="myModalLabel">Log in using your any exisiting GenX Soft Account.</h3>
</div>
<div class="modal-body">

    
    
    
    <div id="main">

<div class="left">
<form action="afterlogin.jsp" method="post">

<table>
    <tr><td><div class="input-prepend">
				<span class="add-on"><i class="icon-envelope"></i></span>
            <input type="text" placeholder="User Name" maxlength="20" name="username" required="true"  />
            </div>
        </td>
</tr>
<tr><td><div class="input-prepend">
				<span class="add-on"><i class="icon-envelope"></i></span> <input type="password" placeholder="password" maxlength="20" name="password" required="true" />
        </div>
    </td>
</tr>
<tr><td><input type="checkbox" />&nbsp;Remember me ?</td></tr>
<tr><td><button type="submit" class="btn btn-primary btn-large">Log in</button>
	    			      <a href="forgetpasswd.jsp">&nbsp; &nbsp;Forgot your password?</a>
                          </td>
                          </tr>
</table>
</form>
</div>
<div class="right">

<table>
<tr>
    <td>
       <div id="fb-root"></div>

       <div class="fb-login-button" data-show-faces="false" data-width="200" data-max-rows="1"></div>
        <img src="images/fb.JPG" width="234" alt="" />
        </td></tr>
    <tr><td><a href="#"><img src="images/gp.JPG" width="234" alt="" /></a></td></tr>
<tr><td><br /></td></tr>


</table>
</div>
</div>
</div>
</div>
