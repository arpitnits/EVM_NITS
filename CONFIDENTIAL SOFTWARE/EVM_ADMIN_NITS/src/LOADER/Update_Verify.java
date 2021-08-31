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

public class Update_Verify 
{
        
        public int update(String Scholar_Id)
        {
            try(Connection conn = connect();
                Statement stat = conn.createStatement())
            {
                String query = "Update Student set Verify = 1 where Scholar_Id = "+Scholar_Id;
                if(stat.execute(query)){
                    System.out.println("Updated!");
                    return 0;
                }
                else{
                    return 1;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
                return -1;
            }
        }
        
        
        
        public int check(String Scholar_Id){
            try(Connection conn = connect();
                Statement stat = conn.createStatement())
            {
                String query = "SELECT Verify FROM Student where Scholar_Id = "+Scholar_Id;
                ResultSet rs=stat.executeQuery(query);
                rs.next();
                if(String.valueOf(rs.getInt("Verify")).equals("1")){
                    System.out.println("Already Voted!");
                    return 1;
                }
                else{
                    System.out.println("Con Vote!");
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
