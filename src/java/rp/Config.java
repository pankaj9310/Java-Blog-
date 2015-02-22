package rp;

import java.sql.*;
public class Config
{
    Connection con=null;
    String url = "jdbc:mysql://localhost:3306/blog";
    String user = "root";
    String pass = "root";
    public Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            
        }
        catch(Exception e)
        {
          e.printStackTrace();  
        }
        
        return con;
    }
    
}
