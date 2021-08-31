package LOADER;

/**
 *
 * @author Arpit
 */
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Candidate_Detail {
    
 String Scholar_Id, Name ,Department, Post, Extra_info;
   int Candidate_Id;
    
    public void readData()
    {
        try(Scanner input = new Scanner(getClass().getResourceAsStream("/Candidate_Details.txt"))) //C:\\Users\\Arpit\\Desktop\\
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
                    Candidate_Id = Integer.parseInt(x[0]);
                    Scholar_Id = x[1];
                    Name = x[2];
                    Department = x[3];
                    Post = x[4];
                    
                    Extra_info = x[5];
                    
           
                    
                }
                
                //check data
                   //System.out.println(Scholar_Id+"\t"+Name+"\t"+Branch);
                   saveData();  //call the method to save the data into database
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    // now save the data into the database
    public void saveData() throws SQLException
    {
        
        Connection conn = connect();
        String table = "create table IF NOT EXISTS Candidate_Details ("+ "Candidate_Id int(50) NOT NULL PRIMARY KEY," + "Scholar_Id int NOT NULL,"+ "Name varchar(50) NOT NULL," + "Department varchar(50) NOT NULL,"+  "Post varchar(50) NOT NULL,"+  "Extra_Info varchar(50) NOT NULL,"+  "FOREIGN KEY(Scholar_Id) REFERENCES Student(Scholar_Id)"+")";  
        Statement st2 = conn.createStatement();
        st2.execute(table);
        try(PreparedStatement pstat = conn.prepareStatement("INSERT INTO Candidate_Details VALUES( ?,?,?,?,?,?)"))
        {
           
            pstat.setInt(1, Candidate_Id);
            pstat.setString(2,Scholar_Id);
            pstat.setString(3, Name);
            pstat.setString(4, Department);
            pstat.setString(5, Post);
            pstat.setString(6, Extra_info);
            
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
            boolean hasResultSet = stat.execute("SELECT * FROM Candidate_Details");
            
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
                    System.out.printf("%d      %-20s%-20s%-20s%-20s%-20s%n", result.getInt("Candidate_Id"),result.getString("Scholar_Id"), result.getString("Name"),result.getString("Department"),result.getString("Post"), result.getString("Extra_info"));
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

