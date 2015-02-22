<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int Flag=0;
        try
                               {
        String user=request.getParameter("username");
        String pass=request.getParameter("password");

        
        
        MessageDigest MD5=MessageDigest.getInstance("MD5");
        Config c=new Config();
       Connection con = c.getcon();
       
            MD5.update(pass.getBytes(),0,pass.getBytes().length);
        byte[] hashvalue=MD5.digest();
        String newpasswd=new BASE64Encoder().encode(hashvalue);
       String l="select *  from register  where username='"+user+"'and password='"+newpasswd+"' ";
       Statement PStmt=con.createStatement();
        ResultSet rs=PStmt.executeQuery(l);
        
        
if(rs.next())
{
    String email = rs.getString("email");
    session.setAttribute("username",user);
    session.setAttribute("email",email);
out.println("you have Login Successfully");
response.sendRedirect("index.jsp");

if(Flag==0)
               {
               String errmsg = "Pls verify your Mail to Enjoy services of scrapenote";
               //session.setAttribute("errmsg", errmsg);
              // response.sendRedirect("index.jsp");
           }
           else
               {

          session.setAttribute("username",user);
          session.setAttribute("email",email);
        }
           }
               else
        {
            //session.setSttribute("error" "wrong userpass");
            String errmsg = "Pls enter correct Username & password";
            //session.setAttribute("errmsg", errmsg);
           //response.sendRedirect("index.jsp");
         }



        } catch (SQLException ex) {}
 %>
    </body>
</html>
