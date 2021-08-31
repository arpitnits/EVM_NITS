package LOADER;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author AMRIT RAJ, ARPIT SINGH
 */
public class AGENT_LOGIN {
    
    String Scholar_Id,Name,Branch ;
    int Verify;

    public String displayData(String mail, String OTP) 
    {
        try(Connection conn = connect();
                Statement stat = conn.createStatement())
        {
            boolean hasResultSet = stat.execute("SELECT * FROM Polling_Agent WHERE Email=\""+mail+"\" AND Otp=\""+OTP+"\"");
            
            if(hasResultSet)
            {
                return "Agent found";
            }
            else{
                return "Agent not found!";
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return "Error connecting!";
    }
    //create a connection to a database
    private Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:5000/evm_nits","root","Arpit@123");
       
        }
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
            return null;
        }
        
        
    }
    
    
    
}
