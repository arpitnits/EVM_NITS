/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOADER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 *
 * @author hp
 */
public class InsertIntoVotes
{
    
    int insertData(int arr[]){
        
        String element="";
        for(int i=0;i<arr.length-1;i++){
            element=element+arr[i]+",";
        }
        
        element=element+arr[arr.length-1];
        System.out.println("Element="+element);
        try(Connection conn = connect();
               Statement st = conn.createStatement(); )
        {
            st.execute(("INSERT INTO Votes VALUES("+element+")"));//",0"+
                  
            return 1;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }
    
    
     private Connection connect()
    {
        try
        {
            System.out.println("Hope....Jai Ma Kali!");
            //This Line onwards has an error!!!!!!!!
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            System.out.println("Hope1....Jai Ma Kali!");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            System.out.println("Hope2....Jai Ma Kali!");
            return DriverManager.getConnection("jdbc:mysql://localhost:5000/evm_nits?autoReconnect=true&useSSL=false","root","Arpit@123");
       
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println("Hope3....Jai Ma Kali!");
            System.out.println(e);
            return null;
        }
        
        
    }
    
}
