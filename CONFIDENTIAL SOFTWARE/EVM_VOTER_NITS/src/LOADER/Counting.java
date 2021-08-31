/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOADER;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;


/**
 *
 * @authorAMRIT RAJ, ARPIT SINGH
 */
public class Counting {
    
    int count=0;
    public String getColumn(String post)
    {
        String query = "Select * from Candidate_Details where Post = '"+post +"' ORDER BY Candidate_Id ASC" ;
        try(Connection conn = connect();
                Statement st = conn.createStatement())
        {
            ResultSet rs = st.executeQuery(query);
            rs.next();
            
            String show=rs.getString("Name");
            //rs.next();
            while(rs.next()){
                show=show+","+rs.getString("Name");
            }
            System.out.println(show);
            return show;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return "";
        }
    }
   
    public int[] getVotes(String post){
        int show[] = new int[5];
        
        try(Connection conn = connect();
                Statement st = conn.createStatement())
            
        {
            String query = "Select count("+post+"), "+post+" from Votes Group By "+post+" Order by "+post+" Asc";
            ResultSet rs = st.executeQuery(query);
            //rs.next();
            while(rs.next())
            {
                int ind=rs.getInt(post)-1;
                int val=rs.getInt("count("+post+")");
                if(ind>=0){
                    show[ind]=val;
                }
            }
            return show;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return show;
        }
        

    }
    
    
    private Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:5000/evm_nits?autoReconnect=true&useSSL=false","root","Arpit@123");
       
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
            return null;
        }
        
    }
}
