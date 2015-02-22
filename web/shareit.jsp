<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,rp.Config,java.security.MessageDigest,sun.misc.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Share !t</title>
<link rel="shortcut icon" href="images/gnx.JPG" type="image/jpg" />
<link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript" src="assets/js/bootstrap.min.js"></script> 
<script type="text/javascript" src="assets/js/bootstrap-tab.js"></script>
</head>

<body  background="images/bc.jpg">
 <%
    String User =(String) session.getAttribute("username");
    if(User!=null)
               {%>

        <%@include file="header1.jsp"%>
       
      
    
   <%@include file="header2.jsp" %>
<div class="container">
<div class="row">
    <div class="span7" style="margin-left: 130px">
<div class="tabbable">
<ul class="nav nav-tabs">
<li class="active"><a href="#1" data-toggle="tab"><i class="icon-share-alt"></i>Share It</a></li>
<li><a href="#2" data-toggle="tab"><i class="icon-picture"></i>Add Photos/Video</a>
</li>
</ul>
<div class="tab-content">
<div class="tab-pane active" id="1">
    <form action="aftershare.jsp" method="post">
    <textarea rows="3" cols="3" class="span7" placeholder="What is your mind?" name="share"></textarea>
    <button type="submit" class="btn-primary" >Post</button>
    </form>
</div>
    <div class="tab-pane" id="2">
    <p style=" background-color:#FFF; height:60px; width: 100%" align="center">
    <input type="file" align="absmiddle" placeholder="share photos" />
    <button type="submit" class="btn-primary">Post</button>
    </p>
    </div>
</div>

    <%
             Config c = new Config();
             Connection con = c.getcon();
             String username=request.getParameter("username");
            
             String title=request.getParameter("share");
             String l="select * from share natural join profile   order by shareid desc";
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery(l);
%>
 <%
             while(rs.next())
            {
                 %>
                 <table>
                     <tr><td> <p style="margin:5px; padding:5px; z-index:100; font-size:14px; font-style:normal; text-align:justify; background-color: #FFF; min-height: 105px; ">
  <img src="uploadimg/<% out.print(rs.getString("pic"));%> "  width="80" height="65" align="left" alt="" style="margin: 3px; padding: 3px"/>
                                 <a href="#?user=<% out.print(rs.getString("username"));%>"><% out.print(rs.getString("username")); %></a><br/>
<%
out.print(rs.getString("date"));
%><br/>
<%
out.print(rs.getString("share"));
%><br/>
<br/>
    </p>
                         </td></tr>
 <tr><td>
 <i class="icon-comment"></i>
 <form action="comment.jsp?shareid=<%= rs.getString("shareid")%>" method="post">
<textarea rows="1" cols="1" class="span7" placeholder="comment" name="comment"></textarea><br/>
<button type="submit" class="btn-primary" >Post</button>
 </form>
     
  <%
             //out.print(comment);
             String m="select * from comment natural join share where shareid="+rs.getString("shareid");
      //       out.print(m);
             Statement stmt1=con.createStatement();
             ResultSet rs1=stmt1.executeQuery(m);
             //out.print(rs1);
           %>

     <%
             while(rs1.next())
             {

             %>
             <p>
             <img src="images/user.jpg" width="30" height="30" align="left" alt=""/>
             <a href="#?user=<% out.print(rs1.getString("username"));%>"><% out.print(rs1.getString("username")); %></a>
                      <%
out.print(rs1.getString("date"));
%><br/>
<%
out.print(rs1.getString("comment"));
%><br/>
<%
}
%>

 </p>
     </td></tr>
                 </table>
<%
}
%>


</div>
</div>
<!--
<div class="span2" style="height:400px; background-color:#FFF; float:right;margin:1px; margin-right: 145px ">
    <h4> <i class="white icon-share-alt"></i>Share Status User</h4>
     <%--
     String username1=request.getParameter("username");
                out.print(username1);
               String bu="select * from share where username='"+username1+"'";
 //String bu="select * from share natural join profile where shareid='"+shareid+"'";
               Statement stmt7=con.createStatement();
               ResultSet rs7=stmt7.executeQuery(bu);
            %>
            <table>
            <%
             while(rs7.next())
             {

    %>
    <tr><td>

            <img src="uploadimg/<% out.print(rs7.getString("pic"));%> "  width="23" height="23" align="left" alt="" style="margin: 3px; padding: 3px"/>
 </td><td>
             <a href="aftereditprofile.jsp?user=<% out.print(rs7.getString("username"));%>"><% out.print(rs7.getString("username")); %></a>
    <%
 }
    --%>

            </td></tr></table>

    <br/>
    </div>
     -->
</div>
</div>
      <%  }
                else
                {%>
                
                 <%@ include file="header.jsp" %>
                 <center>
                 <h3>Plese login</h3><a href="index.jsp">Home</a>
                 </center><br/><br/>
                 <% }
   %>
<%@ include file="footer.jsp" %>
</body>
</html>