package LOADER;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Arpit
 */
public class Student {
    
    String Scholar_Id,Name,Branch ;
    int Verify;
   
    
    public void readData()
    {
        try(Scanner input = new Scanner(getClass().getResourceAsStream("/Student_data.txt")))//C:\\Users\\Arpit\\Desktop\\
        {//new File("Student_data.txt")
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
                                        Scholar_Id = x[0];
                    /*while(!data.hasNextInt())
                    {
                        Scholar_Id+= data.next() + "";
                    }
                    Scholar_Id = Scholar_Id.trim();
                    */
                    //get Name
                    Name = x[1];
                    /*while(!data.hasNextInt())
                    {
                        Name+=data.next() + "";
                    }
                    Name = Name.trim();
                    */
                    //get Branch
                    Branch = x[2];
                    /*while(!data.hasNextInt())
                    {
                        Branch+=data.next() + "";
                    }
                    Branch = Branch.trim();
                    
                    
                    */
                    
                }
                
                //check data
                   System.out.println(Scholar_Id+"\t"+Name+"\t"+Branch);
                   saveData();  //call the method to save the data into database
            }
        }
        catch(Exception e)
        {
            System.out.println("Here");
            System.out.println(e);
        }
    }
    
    // now save the data into the database
    public void saveData() throws SQLException
    {
        /*try(Connection conn = connect();
                PreparedStatement pstat = conn.prepareStatement("Create table Student(Scholar_Id varchar(10) NOT NULL,Name varchar(50) NOT NULL,Branch varchar(50) NOT NULL,Verify int, PRIMARY KEY(Scholar_Id)"))
        {
            pstat.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }*/
        Connection conn = connect();
        String table = "create table IF NOT EXISTS Student (" + "Scholar_Id INT( 10 ) PRIMARY KEY ,"   
            + "Name varchar(50) NOT NULL," + "Branch varchar(50) NOT NULL," + "Verify int(1) NOT NULL"+")";  
        Statement st = conn.createStatement();
        st.execute(table);
        try(PreparedStatement pstat = conn.prepareStatement("INSERT INTO Student VALUES( ?,?,?,?)"))
        {
            pstat.setString(1, Scholar_Id);
            pstat.setString(2,Name);
            pstat.setString(3,Branch);
            pstat.setInt(4, Verify);
            pstat.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void displayData() 
    {
        try(Connection conn = connect())
        {
                Statement stat = conn.createStatement();
            boolean hasResultSet = stat.execute("SELECT * FROM Student");
            
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
                    System.out.printf("%-20s%-20s%-20s%%d%n", result.getString("Scholar_Id"),result.getString("Name"),result.getString("Branch"),result.getInt("Verify"));
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

class FDemo
{
    public static void main(String[] args)
    {
        Student st_obj = new Student();
        Polling_Agent pla = new Polling_Agent();
        //Candidate_Detail can_details = new  Candidate_Detail();
        //Votes v=new Votes();
        try
        {
            st_obj.readData();
            st_obj.displayData();
            
            pla.readData();
            pla.displayData();
            
            //These calls are for EVM...
            //can_details.readData();
            //can_details.displayData();
            
            //String postList=v.read();
            //v.createTable(postList);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        Admin_Login al=new Admin_Login();
        al.setVisible(true);
    }
}
