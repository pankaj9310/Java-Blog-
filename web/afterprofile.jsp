<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,org.apache.commons.fileupload.*,org.apache.commons.io.*,com.oreilly.servlet.MultipartRequest,rp.Config"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        try{
        Config c = new Config();
        Connection con = c.getcon();
        String fname=request.getParameter("fname");
        
        String lname=request.getParameter("lname");
        //Date dob= new Date(Integer.parseInt(request.getParameter("day")), Integer.parseInt(request.getParameter("month")), Integer.parseInt(request.getParameter("year"))-1900);
       String d = request.getParameter("day");
       String m = request.getParameter("month");
       String y = request.getParameter("year");
       String dob = d+m+y;
        String sex=request.getParameter("sex");
        String phone=request.getParameter("phone");
        String ccity=request.getParameter("ccity");
        String country=request.getParameter("country");
        String address=request.getParameter("address");
        String website=request.getParameter("website");
        String aboutme=request.getParameter("aboutme");
 
        
        String q="insert into profile(fname,lname,dob,sex,phone,ccity,country,address,website,aboutme)values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement PStmt=con.prepareStatement(q);
        PStmt.setString(1, fname);
        PStmt.setString(2, lname);
        PStmt.setString(3, dob);
        PStmt.setString(4, sex);
        PStmt.setString(5, phone);
        PStmt.setString(6, ccity);
        PStmt.setString(7, country);
        PStmt.setString(8, address);
        PStmt.setString(9, website);
        PStmt.setString(10, aboutme);
        int result=PStmt.executeUpdate();
        out.println(result);
        
if(result==1)
{
    
out.println("you have Successfully sqved your data");
response.sendRedirect("aftereditprofile.jsp");

}
else
{
out.println("Try again");

response.sendRedirect("Profile.jsp");


}
          }
catch(Exception e)
{
     e.printStackTrace();
}                   
        %>
    </body>
</html>
