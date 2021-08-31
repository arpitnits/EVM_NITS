/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
   @Auther-Amrit Raj, Arpit Singh
 */
package LOADER;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Arpit
 */
public class VERIFY_VOTER {
    
    
    
    String Scholar_Id,Name,Branch ;
    int Verify;

    public String displayData(String sc) 
    {
        try(Connection conn = connect();
                Statement stat = conn.createStatement())
        {
            boolean hasResultSet = stat.execute("SELECT * FROM Student WHERE Scholar_Id="+sc);
            
            if(hasResultSet)
            {
                Connection con = connect();
                Statement stmt = con.createStatement();
                System.out.println("Connection Established!");
                ResultSet rs= stmt.executeQuery("SELECT Name FROM Student WHERE Scholar_Id="+sc);
                System.out.println("Query Executed!");
                rs.next();
                System.out.println("Returning String name...!");
                return ( rs.getString("Name") );
                //return "Student found";
            }
            else{
                return "Student not found!";
            }
        }
        catch(Exception e)
        {
            
            System.out.println(e);
            return String.valueOf(e);
        }
    }
    //create a connection to a database
    private Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            System.out.println("Connection Establishing.....!");
            return DriverManager.getConnection("jdbc:mysql://localhost:5000/evm_nits?autoReconnect=true&useSSL=false","root","Arpit@123");//3306
       
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
            return null;
        }
        
        
    }
    
}


