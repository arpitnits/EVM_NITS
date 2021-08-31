/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOADER;

/**
 *
 * @author hp
 */
import java.io.*;
import java.net.*;

public class Client{
    public static int PORT = 1234;
    public static String IP = "127.0.0.1";
    public static String FLAG = "";
    public static void main(String[] args)throws Exception{
        Socket s = new Socket(IP, PORT);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(!FLAG.equals("0000")){
            FLAG = reader.readLine();
            dout.writeUTF(FLAG);
            dout.flush();
            FLAG = din.readUTF();
            System.out.println(FLAG);    // will be commented out later
        }
        dout.close();
        s.close();
    }
    
    
    static void gettingClient(){
        
        try{
            Socket s = new Socket(IP, PORT);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while(!FLAG.equals("0000")){
                FLAG = reader.readLine();
                dout.writeUTF(FLAG);
                dout.flush();
                FLAG = din.readUTF();
                System.out.println(FLAG);    // will be commented out later
            }
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println("IO Error in Client...");
        }
    
    }
}