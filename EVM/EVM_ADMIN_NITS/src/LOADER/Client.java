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
import javax.swing.JOptionPane;

public class Client{
    public static int PORT = 5001;
    public static String IP = "";//127.0.0.1
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
    
    static void gettingClient(String ip){
        IP=ip;
        try{
            Socket s = new Socket(IP, PORT);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FLAG = "hello";
            while(!FLAG.equals("0000")){
                //reader.readLine();
                dout.writeUTF(FLAG);
                dout.flush();
                FLAG = din.readUTF();
                System.out.println(FLAG);    // will be commented out later
            }
            dout.close();
            s.close();
            JOptionPane.showMessageDialog(null, "Session started successfully!");
        }
        catch(Exception e){
            System.out.println("IO Error in Client...");
            JOptionPane.showMessageDialog(null, "A session is already in progress.");
        }
    
    }
}