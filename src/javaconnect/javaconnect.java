package javaconnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author A to Z
 */
public class javaconnect
{
Connection conn; 
public static Connection ConnecrDb()
{
  try
        {
            Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/july18","root","aptech" );
              return con;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            return null;
        }
  
}
}


 