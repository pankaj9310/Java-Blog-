package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import rp.Config;
import java.security.MessageDigest;
import sun.misc.*;
import java.sql.*;
import rp.Config;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/header1.jsp");
    _jspx_dependants.add("/header.jsp");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Web design india, website design india, Website development india, Website development Jaipur</title>\r\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"images/bc.jpg\">\r\n");
      out.write("     ");

    String User =(String) session.getAttribute("username");
//    out.print(User);
    if(User != null)
               {
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("        ");
  }
                else
                {
      out.write("\r\n");
      out.write("                 ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-button.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-popover.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/bootstrap-modal.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("         .navbar-inner{\r\n");
      out.write("\t\t\t background:#000;\r\n");
      out.write("\t\t\t border-bottom:5px solid #007AF4;\r\n");
      out.write("\t\t\t height:70px;\r\n");
      out.write("\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t.navbar-inner .brand{color:#FFF}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("<div class=\"navbar-inner\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<a href=\"#\" class=\"brand\"><img src=\"images/logo1.jpg\" height=\"60px\" width=\"auto\" /></a>\r\n");
      out.write("\r\n");
      out.write("<ul class=\"nav pull-right\">\r\n");
      out.write(" \r\n");
      out.write("<li class=\"dropdown\">\r\n");
      out.write("<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><small>Login/Register</small><i class=\" icon-white icon-user\"></i><b class=\"caret\"></b></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul class=\"dropdown-menu\">\r\n");
      out.write("<li><a href=\"#myModal1\"  data-toggle=\"modal\">Login</a></li>\r\n");
      out.write("<li><a href=\"#myModal\" data-toggle=\"modal\">Register</a>\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("                 ");
 }
   
      out.write("\r\n");
      out.write("   ");
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
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" style=\"width:100%;\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"this-carousel-id\" class=\"carousel slide\" style=\"margin-right:30px; height:410px; background-color:#fff; font-size:20px\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <p style=\"margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify \">\r\n");
      out.write("             <img src=\"images/user.jpg\" style=\"width:60px; height:60px; margin: 2px; padding: 2px\" alt=\"\" align=\"left\"/>\r\n");
      out.write("            \r\n");
      out.write("   ");

Config c = new Config();
             Connection con = c.getcon();
        String username=request.getParameter("username");
        String date =request.getParameter("date");
        String title=request.getParameter("title");
        String blogdetail=request.getParameter("blogdetail");
        String l="select * from blog order by blogid desc";
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery(l);
             //rs.getString('').substring(0,500);

      out.write('\r');
      out.write('\n');
      out.write(' ');

             if(rs.next())
             {
             
      out.write("\r\n");
      out.write("              <a href=\"#?user=");
 out.print(rs.getString("username"));
      out.write('"');
      out.write('>');
 out.print(rs.getString("username")); 
      out.write("</a>\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("date"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("title"));
 
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

 if(rs.getString("blogdetail").length()>845)
     {
out.print(rs.getString("blogdetail").substring(0, 845));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}

      out.write("\r\n");
      out.write("<a href=\"blog.jsp?blogid=");
 out.print(rs.getString("blogid"));
      out.write("\">Read more....</a>\r\n");
      out.write("</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"span3\" style=\"height:200px; background-color:#FFF; margin:3px; font-size:20px\">\r\n");
      out.write("         <p style=\"margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify \">\r\n");
      out.write("             <img src=\"images/user.jpg\" style=\"width:60px; height:60px; margin: 2px; padding: 2px\" alt=\"\" align=\"left\"/>\r\n");
      out.write("            ");

             if(rs.next())
             {
             
      out.write("\r\n");
      out.write("              <a href=\"#?user=");
 out.print(rs.getString("username"));
      out.write('"');
      out.write('>');
 out.print(rs.getString("username")); 
      out.write("</a>\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("date"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("title"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}

      out.write("\r\n");
      out.write("<a href=\"blog.jsp?blogid=");
 out.print(rs.getString("blogid"));
      out.write("\">Read more....</a>\r\n");
      out.write("        </p>\r\n");
      out.write("\r\n");
      out.write("     </div>\r\n");
      out.write("\t  <div class=\"span3\" style=\"height:200px; background-color:#FFF; margin:3px; font-size:20px\">\r\n");
      out.write("               <p style=\"margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify \">\r\n");
      out.write("                   <img src=\"images/user.jpg\" style=\"width:60px; height:60px; margin: 5px; padding: 3px; z-index: 300\" alt=\"\" align=\"left\"/>\r\n");
      out.write("     ");

             String l2="select * from blog order by blogid desc";
             Statement stmt2=con.createStatement();
             ResultSet rs2=stmt2.executeQuery(l2);
            
      out.write("\r\n");
      out.write("            ");

             if(rs.next())
             {
             
      out.write("\r\n");
      out.write("              <a href=\"#?user=");
 out.print(rs.getString("username"));
      out.write('"');
      out.write('>');
 out.print(rs.getString("username")); 
      out.write("</a>\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("date"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("title"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("  ");

 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}
             
      out.write("\r\n");
      out.write("           <a href=\"blog.jsp?blogid=");
 out.print(rs.getString("blogid"));
      out.write("\">Read more....</a>\r\n");
      out.write("               </p>\r\n");
      out.write("     </div>\r\n");
      out.write("    <div class=\"span2\" style=\"height:400px; background-color:#FFF; float:right;margin:1px;overflow: auto; \">\r\n");
      out.write("    <h4>Blog post User</h4>\r\n");
      out.write("     ");

             String bu="select * from blog order by blogid desc";
             Statement stmt7=con.createStatement();
             ResultSet rs7=stmt7.executeQuery(bu);
            
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("            ");

             while(rs7.next())
             {

    
      out.write("\r\n");
      out.write("    <tr><td>\r\n");
      out.write(" \r\n");
      out.write("            <img src=\"images/user.jpg\" width=\"30\" height=\"30\" align=\"left\" alt=\"\" style=\" margin: 3px\"/></td><td>\r\n");
      out.write("             <a href=\"#?user=");
 out.print(rs7.getString("username"));
      out.write('"');
      out.write('>');
 out.print(rs7.getString("username")); 
      out.write("</a>\r\n");
      out.write("    ");

 }
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("            </td></tr></table>\r\n");
      out.write("\r\n");
      out.write("    <br/>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"span3\" style=\"height:200px; background-color:#FFF; margin:3px; font-size:20px\">\r\n");
      out.write("        <p style=\"margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify \">\r\n");
      out.write("            <img src=\"images/user.jpg\" style=\"width:60px; height:60px; margin: 5px; padding: 3px; z-index: 300\" alt=\"\" align=\"left\"/>\r\n");
      out.write("\r\n");
      out.write("      ");

             String l5="select * from blog order by blogid desc";
             Statement stmt5=con.createStatement();
             ResultSet rs5=stmt5.executeQuery(l5);
            
      out.write("\r\n");
      out.write("            ");

             if(rs.next())
             {
             
      out.write("\r\n");
      out.write("             <a href=\"#?user=");
 out.print(rs.getString("username"));
      out.write('"');
      out.write('>');
 out.print(rs.getString("username")); 
      out.write("</a>\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("date"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("title"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}

      out.write("\r\n");
      out.write("    <a href=\"blog.jsp?blogid=");
 out.print(rs.getString("blogid"));
      out.write("\">Read more....</a>\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"span3\" style=\"height:200px; background-color:#FFF; margin:3px; font-size:20px\">\r\n");
      out.write("     <p style=\"margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify \">\r\n");
      out.write("             <img src=\"images/user.jpg\" style=\"width:60px; height:60px; margin: 2px; padding: 2px\" alt=\"\" align=\"left\"/>\r\n");
      out.write("             ");

             String l4="select * from blog order by blogid desc";
             Statement stmt4=con.createStatement();
             ResultSet rs4=stmt4.executeQuery(l4);
            
      out.write("\r\n");
      out.write("            ");

             if(rs.next())
             {
             
      out.write("\r\n");
      out.write("              <a href=\"#?user=");
 out.print(rs.getString("username"));
      out.write('"');
      out.write('>');
 out.print(rs.getString("username")); 
      out.write("</a>\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("date"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write(" ");

out.print(rs.getString("title"));

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("  ");

 if(rs.getString("blogdetail").length()>215)
     {
out.print(rs.getString("blogdetail").substring(0, 215));
}
else
    {
    out.print(rs.getString("blogdetail"));
}
}

      out.write("\r\n");
      out.write("        <a href=\"blog.jsp?blogid=");
 out.print(rs.getString("blogid"));
      out.write("\">Read more....</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
