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

public class Server{
    public static int PORT = 5000;
    public static String FLAG = "";
    public static void main(String args[])throws Exception{
        ServerSocket ss = new ServerSocket(PORT);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(!FLAG.equals("0000")){
            FLAG = din.readUTF();
            System.out.println(FLAG);     //will be later commented out
            FLAG = reader.readLine();
            dout.writeUTF(FLAG);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
    
    static void gettingServer()throws IOException{
    
        ServerSocket ss = new ServerSocket(PORT);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(!FLAG.equals("0000")){
            FLAG = din.readUTF();
            System.out.println(FLAG);     //will be later commented out
            FLAG = reader.readLine();
            dout.writeUTF(FLAG);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}