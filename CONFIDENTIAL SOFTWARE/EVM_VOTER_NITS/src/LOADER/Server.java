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
    public static int PORT = 1234;
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
            FLAG = "0000";//reader.readLine();
            dout.writeUTF(FLAG);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
    
    static void gettingServer(){
    
        System.out.println("Started Server!");
        try{
            System.out.println("1");
            ServerSocket ss = new ServerSocket(PORT);
            System.out.println("2");
            Socket s = ss.accept();
            System.out.println("3");
            DataInputStream din = new DataInputStream(s.getInputStream());
            System.out.println("4");
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            System.out.println("5");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("6");
            while(!FLAG.equals("0000")){
                System.out.println("7");
                FLAG = din.readUTF();
                System.out.println("8");
                System.out.println(FLAG);     //will be later commented out
                FLAG ="0000"; //reader.readLine();
                System.out.println("9");
                dout.writeUTF(FLAG);
                System.out.println("10");
                dout.flush();
            }
            din.close();
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println("Thrown error!");
            System.out.println(e);
        }
    }
    
}