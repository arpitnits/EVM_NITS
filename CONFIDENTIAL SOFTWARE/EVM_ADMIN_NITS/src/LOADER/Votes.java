package LOADER;

/*
 * @author Arpit
 */

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Votes{
   public String read(){
        try(Scanner input = new Scanner(getClass().getResourceAsStream("/Post.txt")))
        {
             if(input.hasNextLine())
                {

                    String line;
                    line = input.nextLine();
                    return line;
                    
                }
                else{
                    System.out.println("Some Error in Vote Preloading Read...");
                    return "";
                }
        }
        catch(Exception e){
            System.out.println(e);
            return "";
        }
   }
   
   
   public void createTable(String tar)
   {
       String entry[]=tar.split(",");
       String query="CREATE TABLE Votes(";
       for(int i=0;i<entry.length-1;i++){
           query=query+entry[i]+" INT(10), ";
       }
       query=query+entry[entry.length-1]+" INT(10))";
       System.out.println("Query========>"+query);
       
       try(Connection conn = connect();)
       {
           Statement st3 = conn.createStatement();
           st3.execute(query);
       }
       catch(Exception e)
       {
           System.out.println(e);
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


    

    

    
   
    




