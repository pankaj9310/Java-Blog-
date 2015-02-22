<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
    <meta charset="utf-8"></meta>
<title>Form</title>
<meta name="viewport" content="width=device-width"></meta>
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javacript" src="assets/js/google-code-prettify/prettify.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-button.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-alert.js"></script>
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

</head>

<body> 
<div class="container" style="background-image:url(images/bc.jpg)">
				<div class="row">
				<div class="span8">
			<form class="form-horizontal" action="afterregister.jsp" method="post">
				<h3>Create a new account on GenX Soft.</h3>
 							 <div class="control-group">
						      <label class="control-label" for="name">User Name</label>
						      <div class="controls">
                                              <input type="text" class="input-xlarge" name="name" id="name" required="true" onkeyup="loadXMLDoc()">
                                                        </input>
                                                          <span id="err"> </span>
                                                      </div>
						    </div>
                             <div class="control-group">
						      <label class="control-label" for="password">Password</label>
						      <div class="controls">
						        <input type="password" class="input-xlarge" name="password" id="password" required="true">
                                                        </input>
                                                      </div>
						    </div>
                             <div class="control-group">
						      <label class="control-label" for="c-password">Confirm Passowrd</label>
						      <div class="controls">
						        <input type="password" class="input-xlarge" name="c-password" id="c-password" required="true">
                                                        </input>
                                                      </div>
						    </div>
                             <div class="control-group">
						      <label class="control-label" for="email">Email id</label>
						      <div class="controls">
						        <input type="email" class="input-xlarge" name="email" id="email" required="true"/>
						      </div>
						    </div>
                             <div class="control-group">
						      <label class="control-label" for="phone">Mobile No.</label>
						      <div class="controls">
						        <input type="text" maxlenght="10" class="input-xlarge" name="phone" id="phone" required="true"/>
						      </div>
						    </div>
                            
                             <div class="form-actions">
			            <button type="submit" class="btn btn-primary btn-large">Submit</button>
	    			      <button type="reset" class="btn btn-error btn-large">Reset</button>
	        			</div>

						</form>
</div>
<div class"span4">
<h3>Register by  using social Networking.</h3>
<a href="#"><img src="images/fbr.jpg" width="234" /></a>
<a href="#"><img src="images/gr.JPG" width="234" /></a>

</div>
</div>
</div>
</body>
</html>
