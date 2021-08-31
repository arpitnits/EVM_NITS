/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOADER;

/**
 *
 * @author Arpit
 */
public class VOTE_CREATE_ENTRY {
    
}


class FDemo
{
    public static void main(String[] args)
    {
        
        Votes v=new Votes();
        Candidate_Detail can_details = new  Candidate_Detail();
        CONNECTION_CLIENT CLI=new CONNECTION_CLIENT();
        try
        {
            String postList=v.read();
            v.createTable(postList);
            
            can_details.readData();
            can_details.displayData();
            
            CLI.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
}
