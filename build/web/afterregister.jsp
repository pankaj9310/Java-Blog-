

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<%@page import="mail.AuthCode"%>
<%@page import="mail.MailVerify,javax.mail.*"%>
        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%
        try{
        Config c = new Config();
        Connection con = c.getcon();
        MessageDigest MD5=MessageDigest.getInstance("MD5");
        String user=request.getParameter("username");
        String pass=request.getParameter("passwd");
        //String conpass=request.getParameter("conpasswd");
        String email=request.getParameter("email");
        String phone=request.getParameter("phone");
        String Login="user";
        int Flag=0;
      //   String user1=request.getParameter("ver");
        
        
       
        MD5.update(pass.getBytes(),0,pass.getBytes().length);
        byte[] hashvalue=MD5.digest();
        String newpasswd=new BASE64Encoder().encode(hashvalue);
        
        /*
          MD5.update(conpass.getBytes(),0,conpass.getBytes().length);
        byte[] hashvalue1=MD5.digest();
        String newconpasswd=new BASE64Encoder().encode(hashvalue1);
        */
        String q="insert into register(username,password,email,phone,Login,Flag,Auth_Code)values(?,?,?,?,?,?,?)";
        PreparedStatement PStmt=con.prepareStatement(q);
        PStmt.setString(1, user);
        PStmt.setString(2, newpasswd);
        //PStmt.setString(3, newconpasswd);
        PStmt.setString(3, email);
        PStmt.setString(4, phone);
        PStmt.setString(5, Login);
        PStmt.setInt(6, Flag);
        
        
          AuthCode authCode=new AuthCode();
             String code=authCode.generateCode();
            // out.print("email is" +email);
           out.print("code is" +code);
             PStmt.setString(7, code);
        int result=PStmt.executeUpdate();
//        out.print("result is" +result);
        //session.setAttribute("Email", email);
            //session.setAttribute("Auth_code", code);
            
             String msg="Your verification CODE is:"+code+" .<br/>To verify Click on this link http://localhost:8084/blog/Verification.jsp?Email="+email+"&Auth_Code="+code+"";
                 //System.out.print("msg is" +msg);
                 //mailing preocess
              //out.print("msg is" +msg);
                 MailVerify mv=new MailVerify(email, msg);
                 mv.verify();
                 out.print("To Login verify yourself.");
                // session.setAttribute("Auth_code", code);
                    Statement st=con.createStatement();
                     ResultSet rs = st.executeQuery("select * from register where username='"+user+"'");  // this is for name
                    if(rs.next())
                    {
                        out.println("<font color=red>");
                        out.println("Name already taken");
                        out.println("</font>");

                    }else {

                        out.println("<font color=green>");
                        out.println("Available");
                        out.println("</font>");

                    }
        
if(result==1)
{
    
out.println("you have register Successfully");
response.sendRedirect("index.jsp");

}
else
{
out.println("Try again");

response.sendRedirect("form.html");


}
          }
catch(Exception e)
{
}                   
        %>
    </body>
</html>
