package LOADER;

/*
 * @author Arpit
 */

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Polling_Agent {
    
     String Agent_Name, Email, Department,Otp;
   
    
    public void readData()
    {
        
        try(Scanner input = new Scanner(getClass().getResourceAsStream("/OTP.txt"))) //C:\\Users\\Arpit\\Desktop\\
        {//new File("
            
            if(input.hasNextLine())
            {
                
                String line;
                
                line = input.nextLine();
                Otp = line;
                //System.out.println("-------------> Line"+line);
                System.out.println("-------------> OTP"+Otp);
                
                   //saveData();  //call the method to save the data into database
            }
            else{
                System.out.println("-------------------------->");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        try(Scanner input = new Scanner(getClass().getResourceAsStream("/Polling_Data.txt"))) //C:\\Users\\Arpit\\Desktop\\
        {
            while(input.hasNextLine())
            {
                
                String line;
                
                line = input.nextLine();
                
                //now process the line of text for each data item
                
                try(Scanner data = new Scanner(line))
                {
                    //get Scholar_Id
                    System.out.println(line);
                    String x[]=line.split(",");
                    Agent_Name = x[0];
                   
                    Email = x[1];
                    Department = x[2];
                    
                    
                }
                
                
                   saveData();  //call the method to save the data into database
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //
        
        //
    }
    
    // now save the data into the database
    public void saveData() throws SQLException
    {
        
        Connection conn = connect();
        String table = "create table IF NOT EXISTS Polling_Agent ("+ "Agent_Name varchar(50) NOT NULL," + "Email varchar(50) NOT NULL PRIMARY KEY,"+ "Department varchar(50) NOT NULL," + "Otp varchar(50) NOT NULL"+")";  
        Statement st1 = conn.createStatement();
        st1.execute(table);
        try(PreparedStatement pstat = conn.prepareStatement("INSERT INTO Polling_Agent VALUES( ?,?,?,?)"))
        {
            pstat.setString(1, Agent_Name);
            pstat.setString(2,Email);
            pstat.setString(3, Department);
            pstat.setString(4, Otp);
            pstat.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void displayData() 
    {
        try(Connection conn = connect();
                Statement stat = conn.createStatement())
        {
            boolean hasResultSet = stat.execute("SELECT * FROM Polling_Agent");
            
            if(hasResultSet)
            {
                ResultSet result = stat.getResultSet();
                ResultSetMetaData metaData = result.getMetaData();
                
                //get number of column
                int columncount = metaData.getColumnCount();
                
                //display column labels
                for(int i=1;i<=columncount;i++)
                {
                    System.out.print(metaData.getColumnLabel(i)+"\t\t");
                }
                System.out.println();
                
                //display data
                while(result.next())
                {
                    System.out.printf("%-20s%-20s%-20s%n", result.getString("Agent_Name"),result.getString("Email"), result.getString("Department"));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    //create a connection to a database
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

