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
    public static int PORT = 1234;
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
            System.out.println("1");
            Socket s = new Socket(IP, PORT);
            System.out.println("2");
            DataInputStream din = new DataInputStream(s.getInputStream());
            System.out.println("3");
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            System.out.println("4");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("5");
            FLAG = "hello";
            while(!FLAG.equals("0000")){
                //reader.readLine();
                System.out.println("6");
                dout.writeUTF(FLAG);
                System.out.println("7");
                dout.flush();
                System.out.println("8");
                FLAG = din.readUTF();
                System.out.println("9");
                System.out.println(FLAG);
                System.out.println("10");// will be commented out later
            }
            dout.close();
            System.out.println("11");
            s.close();
            System.out.println("12");
            JOptionPane.showMessageDialog(null, "Session started successfully!");
        }
        catch(Exception e){
            System.out.println("IO Error in Client...");
            JOptionPane.showMessageDialog(null, "A session is already in progress.");
        }
    
    }
}