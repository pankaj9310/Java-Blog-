package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import rp.Config;

public final class Account_005fsetting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/header1.jsp");
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
      response.setContentType("text/html");
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
      out.write("<title>Account Setting</title>\r\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"assets/css/search.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"assets/js/jquery-1.4.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t  $(document).ready(function(){\r\n");
      out.write("\t\t\t\t$('#login-trigger').click(function(){\r\n");
      out.write("\t\t\t\t\t$(this).next('#login-content').slideToggle();\r\n");
      out.write("\t\t\t\t\t$(this).toggleClass('active');\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif ($(this).hasClass('active')) $(this).find('span').html('&#x25B2;')\r\n");
      out.write("\t\t\t\t\t\telse $(this).find('span').html('&#x25BC;')\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t$('#signup-trigger').click(function(){\r\n");
      out.write("\t\t\t\t\t$(this).next('#signup-content').slideToggle();\r\n");
      out.write("\t\t\t\t\t$(this).toggleClass('active');\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif ($(this).hasClass('active')) $(this).find('span').html('&#x25B2;')\r\n");
      out.write("\t\t\t\t\t\telse $(this).find('span').html('&#x25BC;')\r\n");
      out.write("\t\t\t\t\t})\t\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"images/bc.jpg\">\r\n");
      out.write("    ");
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

        {
        Config c = new Config();
        Connection con = c.getcon();
        String username =(String) session.getAttribute("username");
        out.println(username);
        }
       
      out.write("\n");
      out.write("    </a></li>\n");
      out.write("<li><a href=\"Profile.jsp\">Edit Profile</a></li>\n");
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
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"span10\">\r\n");
      out.write("<h3>General Account Settings</h3>\r\n");
      out.write("<table class=\"table table-bordered\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>User Name :</td>\r\n");
      out.write("<td>\r\n");
      out.write("       ");

        {
        Config c = new Config();
        Connection con = c.getcon();
        String username =(String) session.getAttribute("username");
        out.println(username);
        }
       
      out.write("\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<a href=\"#\"><i class=\"icon-pencil\"></i>Edit</a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td> Email:</td>\r\n");
      out.write("<td> ");

        {
        Config c = new Config();
        Connection con = c.getcon();
        String email =(String) session.getAttribute("email");
        out.println(email);
        }
       
      out.write("\r\n");
      out.write(" </td>\r\n");
      out.write("<td><a href=\"#\"><i class=\"icon-pencil\"></i>Edit</a>\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td> Password:</td>\r\n");
      out.write("<td>Update password about one month</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<td>\r\n");
      out.write("\r\n");
      out.write("<div class=\"signup\">\r\n");
      out.write("\t\t\t<a id=\"signup-trigger\" href=\"#\">\r\n");
      out.write("\t\t\t\t<i class=\"icon-pencil\"></i>Edit\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<div style=\"display: block;\" id=\"signup-content\">\t\t\t\r\n");
      out.write("                            <form action=\"forgetpass.jsp\" method=\"post\">\r\n");
      out.write("                            <table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t<tr><td>Previous Password</td>\r\n");
      out.write("                            <td><input type=\"password\" name=\"prepasswd\" placeholder=\"Previous Password\"  /></td></tr>\r\n");
      out.write("\t\t\t<tr><td>New Password</td>\r\n");
      out.write("                            <td><input type=\"password\" name=\"newpasswd\" placeholder=\"New Password\"  /></td></tr>\r\n");
      out.write("\t\t\t<tr><td>Re Password</td>\r\n");
      out.write("                            <td><input type=\"password\" name=\"rpassword\" placeholder=\"Re Password\"  /></td></tr>\r\n");
      out.write("\t\t\t<tr><td colspan=\"2\"><input type=\"submit\" value=\"send\" class=\"btn-large btn-success\"  /></td></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("                            </form>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</div></div>\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("</table>\r\n");
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
