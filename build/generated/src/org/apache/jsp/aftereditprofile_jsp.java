package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.io.*;
import com.oreilly.servlet.MultipartRequest;
import rp.Config;
import java.sql.*;
import rp.Config;

public final class aftereditprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/header1.jsp");
    _jspx_dependants.add("/header2.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap.min.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/bc.jpg\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title></title>\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-typeahead.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-button.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("         .navbar-inner{\n");
      out.write("\t\t\t background:#000;\n");
      out.write("\t\t\t border-bottom:5px solid #007AF4;\n");
      out.write("\t\t\t height:70px;\n");
      out.write("\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t.navbar-inner .brand{color:#FFF}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"images/bc.jpg\">\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("<div class=\"navbar-inner\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<a href=\"#\" class=\"brand\"><img src=\"images/logo.jpg\" height=\"60px\" width=\"auto\" /></a>\n");
      out.write("<ul class=\"nav pull-right\" >\n");
      out.write("<li ><a href=\"#\"><img src=\"images/meassag1.jpg\" height=\"23px\" width=\"25px\" align=\"middle\"/></a></li>\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><img src=\"images/user.png\" height=\"23px\" width=\"25px\" class=\"img-rounded\"  /></a>\n");
      out.write("<ul class=\"dropdown-menu\">\n");
      out.write("<li><a href=\"aftereditprofile.jsp\"> \n");
      out.write("        ");

        
       String user=(String) session.getAttribute("username");
        String e =(String) session.getAttribute("email");
        out.println(user);
        
       
      out.write("\n");
      out.write("    </a></li>\n");
      out.write("       <li><a href=\"Profile.jsp?e=");
 out.print(e); 
      out.write("\">Edit Profile</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"dropdown\">\n");
      out.write("<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><img src=\"images/images_096.jpg\" height=\"23px\" width=\"25px\" align=\"middle\"/></a>\n");
      out.write("<ul class=\"dropdown-menu\">\n");
      out.write("<li><a href=\"Account_setting.jsp\">Account Setting</a></li>\n");
      out.write("<li><form action=\"logout.jsp\"> <a href=\"#\"><button class=\"btn-info\">Logout</button></a></form></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    .row-fluid {padding-left:60px;}\r\n");
      out.write("    .cc\r\n");
      out.write("\t{\r\n");
      out.write("\t width:250px;\r\n");
      out.write("\t height:50px;\r\n");
      out.write("\t margin-top:5px;\r\n");
      out.write("\t margin-right:65px;\r\n");
      out.write("\t background-color:#6CC;\r\n");
      out.write("\t font-family:'Lucida Sans Unicode', 'Lucida Grande','sans-serif';\r\n");
      out.write("\t font-size:35px;\r\n");
      out.write("\t text-align:center;\r\n");
      out.write("\t padding-top:15px;\r\n");
      out.write("         -moz-border-radius:37px;\r\n");
      out.write("\t-webkit-border-radius:37px;\r\n");
      out.write("\r\n");
      out.write("\tborder-radius:40px;\r\n");
      out.write("\r\n");
      out.write("\t-moz-box-shadow:0 0 40px #aaa;\r\n");
      out.write("\t-webkit-box-shadow:0 0 40px #aaa;\r\n");
      out.write("\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class =\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\" style=\"margin-bottom: 10px\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"span4\">\r\n");
      out.write("    <div class=\"cc\">\r\n");
      out.write("\t\t<a href=\"shareit.jsp\">\r\n");
      out.write("   SHARE !T\r\n");
      out.write("</a>\r\n");
      out.write("\t</div>\r\n");
      out.write(" </div>\r\n");
      out.write(" \t<div class=\"span4\">\r\n");
      out.write("            <div class=\"cc\">\r\n");
      out.write("\t<a href=\"knowit.jsp\"> KNOW !T</a>\r\n");
      out.write("  </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t<div class=\"span4\">\r\n");
      out.write("            <div class=\"cc\">\r\n");
      out.write("<a href=\"#\">ASK !T</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

           String email=(String)session.getAttribute("email");
           String username=(String)session.getAttribute("username");
           Config c=new Config();
           Connection con = c.getcon();
           MultipartRequest m=new MultipartRequest(request,"C:/Users/ICT/Desktop/blog1/web/uploadimg/");
           String pic=m.getFilesystemName("pic");
           //out.println("pic is"+pic);
           String fname=m.getParameter("fname");
           String lname=m.getParameter("lname");
           String d = m.getParameter("day");
           String ma = m.getParameter("month");
           String y = m.getParameter("year");
           String dob = d+ma+y;
         //  String dob=m.getParameter("dob");
           String sex=m.getParameter("sex");
           String phone=m.getParameter("phone");
           String ccity=m.getParameter("ccity");
           String country=m.getParameter("country");
           String address=m.getParameter("address");
           String website=m.getParameter("website");
           String aboutme=m.getParameter("aboutme");
        String l="select * from profile where email='"+email+"' ";
        Statement PStmt=con.createStatement();
        ResultSet rs=PStmt.executeQuery(l);
//       out.print(rs);
        
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"span3\">\n");
      out.write("<table class=\"table\">\n");
      out.write("<tr>\n");
      out.write("    <td>\n");
      out.write("        ");
 if(rs.next())
    {
       
        
      out.write("\n");
      out.write("         <img src=\"/uploadimg/");
 out.println(pic);
      out.write("\" height=\"60\" width=\"60\" alt=\"\" />\n");
      out.write("        ");

              }
        
      out.write("\n");
      out.write("       </td>\n");
      out.write("    <td>");
out.print(username);
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\"><a href=\"aftereditprofile.jsp\">\n");
      out.write("Profile</a></td></tr>\n");
      out.write("<tr>\n");
      out.write("    <td colspan=\"2\"><a href=\"#\" >Message</a></td></tr>\n");
      out.write("    <tr><td colspan=\"2\"><a href=\"#\" >My Activity</a></td></tr>\n");
      out.write("    <tr><td colspan=\"2\"><a href=\"#myModal2\"  data-toggle=\"modal\">Create Blog</a></td></tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div class=\"span9\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("                    <h3 id=\"myModalLabel\"><center>Profile Details.</center></h3>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <p style=\"margin:5px; padding:5px; z-index:100; font-size:17px; font-style:normal; text-align:justify; color:#000; font-family: 'Times New Roman, Times, serif'  \" align=\"center\">\n");
      out.write("     ");

             if(rs.next())
             {
            // out.println("username");
          //   out.println(rs.getString("username"));
out.println("First name:");
out.println(rs.getString("fname"));

      out.write("<br/>\n");

 out.println("Last Name:");
out.println(rs.getString("lname"));

      out.write("<br/>\n");

out.println("DOB:");
out.println(rs.getString("dob"));

      out.write("<br/>\n");

 out.println("Gender:");
out.println(rs.getString("sex"));

      out.write("<br/>\n");

out.println("Mobile Number:");
out.println(rs.getString("phone"));

      out.write("<br/>\n");

out.println("Email:");
out.println(rs.getString("email"));

      out.write("<br/>\n");

 out.println("Current City:");
out.println(rs.getString("ccity"));

      out.write("<br/>\n");

out.println("Country:");
out.println(rs.getString("country"));

      out.write("<br/>\n");

 out.println("Address:");
out.println(rs.getString("address"));

      out.write("<br/>\n");

out.println("Website:");
out.println(rs.getString("website"));

      out.write("<br/>\n");

 out.println("About Me:");
out.println(rs.getString("aboutme"));

      out.write("<br/>\n");

}

      out.write("\n");
      out.write("     </p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/gnx.JPG\" type=\"image/jpg\" />\r\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write(" <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write(" <link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script  src=\"js/modernizr-2.5.3.min.js\"  type=\"text/javascript\"></script>\r\n");
      out.write("         <script type=\"text/javascript\" src=\"assets/js/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t  <script type=\"text/javascript\" src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-button.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/prettify/prettify.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"script.js\"></script> \r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("#main\r\n");
      out.write("{\r\n");
      out.write("\theight:210px;\r\n");
      out.write("\twidth:600px;\r\n");
      out.write("\tmargin:auto;\r\n");
      out.write("\tz-index:50;\r\n");
      out.write("\tbackground-image:\r\n");
      out.write("\turl(images/bc.jpg);\r\n");
      out.write("\tpadding:5px;\r\n");
      out.write("}\r\n");
      out.write(".left\r\n");
      out.write("{height:190px;\r\n");
      out.write("\twidth:290px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tmargin:5px;\r\n");
      out.write("}\r\n");
      out.write(".right\r\n");
      out.write("{\r\n");
      out.write("\theight:190px;\r\n");
      out.write("\twidth:289px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tmargin:5px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function loadXMLDoc()\r\n");
      out.write("{\r\n");
      out.write("var xmlhttp;\r\n");
      out.write("var k=document.getElementById(\"id2\").value;\r\n");
      out.write("var urls=\"pass.jsp?ver=\"+k;\r\n");
      out.write("\r\n");
      out.write("if (window.XMLHttpRequest)\r\n");
      out.write("  {\r\n");
      out.write("  xmlhttp=new XMLHttpRequest();\r\n");
      out.write("  }\r\n");
      out.write("else\r\n");
      out.write("  {\r\n");
      out.write("  xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("  }\r\n");
      out.write("xmlhttp.onreadystatechange=function()\r\n");
      out.write("  {\r\n");
      out.write("  if (xmlhttp.readyState==4)\r\n");
      out.write("    {\r\n");
      out.write("        //document.getElementById(\"err\").style.color=\"red\";\r\n");
      out.write("        document.getElementById(\"err\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("xmlhttp.open(\"GET\",urls,true);\r\n");
      out.write("xmlhttp.send();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("                <script type=\"text/javascript\">(function(d, s, id) {\r\n");
      out.write("  var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("  if (d.getElementById(id)) return;\r\n");
      out.write("  js = d.createElement(s); js.id = id;\r\n");
      out.write("  js.src = \"//connect.facebook.net/en_US/all.js#xfbml=1&appId=APP_ID\";\r\n");
      out.write("  fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("}(document, 'script', 'facebook-jssdk'));</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"footer\" align=\"center\">\r\n");
      out.write("<a href=\"http://www.genxsoftindia.com\">Home</a>||\r\n");
      out.write("<a href=\"http://www.genxsoftindia.com/about.php\">About</a>||\r\n");
      out.write("Follow us\r\n");
      out.write("<a href=\"#\"><img src=\"images/facebook.png\" /></a>\r\n");
      out.write("<a href=\"#\"><img src=\"images/twitter.png\" /></a>\r\n");
      out.write("<a href=\"#\"><img src=\"images/linkedin.png\" /></a>\r\n");
      out.write("<a href=\"#\"><img src=\"images/blogger.png\" /></a><br />\r\n");
      out.write("All Rights Are Reserved Copyright &copy; GenX Soft Technologies Pvt.Ltd. @ 2013\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div id=\"myModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" style=\"width:800px\">\r\n");
      out.write("<div class=\"modal-header\">\r\n");
      out.write("<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">x</button>\r\n");
      out.write("<h3 id=\"myModalLabel\">Create a new account on GenX Soft.</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal-body\">   \r\n");
      out.write("<div class=\"container\" style=\"background-image:url(images/bc.jpg)\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("                                    <div id=\"maincontent\" class=\"span5 pull-left\">\r\n");
      out.write("                                    <div id=\"demo\" class=\"tab-pane active\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"afterregister.jsp\" id=\"contact-form\" class=\"form-horizontal\" method=\"post\">\r\n");
      out.write("                                                      \r\n");
      out.write("\t\t\t\t\t\t    <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"name\">User Name</label>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\r\n");
      out.write("                                                          <div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\"></i></span>\r\n");
      out.write("\t     <input type=\"text\" class=\"input-large\" name=\"username\" id=\"username\" placeholder=\"User Name\" onkeyup=\"loadXMLDoc()\"/>\r\n");
      out.write("\t\t\t\t\t\t     <span id=\"err\"> </span>\r\n");
      out.write("                                                          </div>\r\n");
      out.write("                                                      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"password\">Password</label>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\r\n");
      out.write("                                                          <div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"password\" class=\"input-large\" name=\"passwd\" id=\"passwd\" placeholder=\"******\"/>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"conpassword\">Confirm Password</label>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\r\n");
      out.write("                                                          <div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"password\" class=\"input-large\" name=\"conpasswd\" id=\"conpasswd\" placeholder=\"******\"/>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("                             </div>\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"email\">Email Address</label>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\r\n");
      out.write("                                                          <div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-envelope\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"text\" class=\"input-large\" name=\"email\" id=\"email\" placeholder=\"Email address\"/>\r\n");
      out.write("\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"phone\">Mobile No.</label>\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\r\n");
      out.write("                                                <div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-iphone-shake\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t        <input type=\"text\" class=\"input-large\" name=\"phone\" id=\"phone\" maxlength=\"10\" placeholder=\"Mobile number\"/>\r\n");
      out.write("\t\t\t\t\t\t      \r\n");
      out.write("                                                        \r\n");
      out.write("                                                          </div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\t\t\t\t\t\t   \r\n");
      out.write("                           \r\n");
      out.write("\t              <div class=\"control-group\">\r\n");
      out.write("\t\t<label class=\"control-label\"></label>\r\n");
      out.write("\t      <div class=\"controls\">\r\n");
      out.write("\t\t\t             <button type=\"submit\" class=\"btn btn-success\">Create My Account</button>\r\n");
      out.write("\t    \t\t\t      <button type=\"reset\" class=\"btn\">Cancel</button>\r\n");
      out.write("\t        \t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>    \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"myModal1\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" style=\" width:625px\">\r\n");
      out.write("<div class=\"modal-header\">\r\n");
      out.write("<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">x</button>\r\n");
      out.write("<h3 id=\"myModalLabel\">Log in using your any exisiting GenX Soft Account.</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"left\">\r\n");
      out.write("<form action=\"afterlogin.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("    <tr><td><div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-envelope\"></i></span>\r\n");
      out.write("            <input type=\"text\" placeholder=\"User Name\" maxlength=\"20\" name=\"username\" required=\"true\"  />\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td><div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-envelope\"></i></span> <input type=\"password\" placeholder=\"password\" maxlength=\"20\" name=\"password\" required=\"true\" />\r\n");
      out.write("        </div>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td><input type=\"checkbox\" />&nbsp;Remember me ?</td></tr>\r\n");
      out.write("<tr><td><button type=\"submit\" class=\"btn btn-primary btn-large\">Log in</button>\r\n");
      out.write("\t    \t\t\t      <a href=\"forgetpasswd.jsp\">&nbsp; &nbsp;Forgot your password?</a>\r\n");
      out.write("                          </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"right\">\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>\r\n");
      out.write("       <div id=\"fb-root\"></div>\r\n");
      out.write("\r\n");
      out.write("       <div class=\"fb-login-button\" data-show-faces=\"false\" data-width=\"200\" data-max-rows=\"1\"></div>\r\n");
      out.write("        <img src=\"images/fb.JPG\" width=\"234\" alt=\"\" />\r\n");
      out.write("        </td></tr>\r\n");
      out.write("    <tr><td><a href=\"#\"><img src=\"images/gp.JPG\" width=\"234\" alt=\"\" /></a></td></tr>\r\n");
      out.write("<tr><td><br /></td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-button.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/jquery.validate.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/prettify/prettify.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"script.js\"></script> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!-- Modal -->\n");
      out.write("<div id=\"myModal2\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("<div class=\"modal-header\">\n");
      out.write("<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("<h3 id=\"myModalLabel\">Create Blog</h3>\n");
      out.write("</div><form action=\"afterblog.jsp\" method=\"post\">\n");
      out.write("<!--div class=\"modal-body\" -->\n");
      out.write("Title<input type=\"text\" name=\"title\" align=\"center\"/>\n");
      out.write("<textarea rows=\"15\" cols=\"15\" style=\"height:300px; width:95%; margin-left:5px\" placeholder=\"create a new blog........\" name=\"blogdetail\"></textarea>\n");
      out.write("<div class=\"modal-footer\">\n");
      out.write("<button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Close</button>\n");
      out.write("<button type=\"submit\" class=\"btn btn-primary\">Post Blog</button>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
