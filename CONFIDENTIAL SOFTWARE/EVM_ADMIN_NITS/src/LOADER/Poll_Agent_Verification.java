/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOADER;

import java.sql.*;


public class Poll_Agent_Verification
{
    
    public int verify_agent(String Email, String Otp)
    {
        try(Connection conn = connect(); 
                Statement st5 = conn.createStatement();)
        {
            
            String query="Select Email from Polling_Agent Where Email = '"+Email+"' AND Otp = '"+Otp+"'"; 
            System.out.println(query);
            ResultSet rs1 = st5.executeQuery(query);
            rs1.next();
            System.out.println(rs1.getString("Email"));
            if(String.valueOf(rs1.getString("Email")).equals(Email))
            {
                System.out.println(rs1.getString("Email"));
                return 1;
            }
            else{
                return 0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return -1;
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
