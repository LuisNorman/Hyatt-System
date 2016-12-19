
package ServerSide;

import java.io.*;
import java.net.*;

public class Server extends Thread {
    
    // These variables are required for communication with clients
    public  static int SERVER_PORT = 6000;
    private ServerSocket 	serverSocket;
    private ObjectInputStream	inputStreamFromClient;
    private ObjectOutputStream	outputStreamToClient;
    private boolean		online;
    
    public Server() {
        SERVER_PORT = 6000;
        ServerSocket server;
        try {
		server = new ServerSocket(SERVER_PORT);
                
                Socket sock = server.accept();
                
                BufferedReader ed = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                String tmp = ed.readLine();
                System.out.print("I recieved :"+ tmp);
                
                PrintStream pr = new PrintStream(sock.getOutputStream());
                String str = "";
                pr.println(str);
                
		System.out.println("SERVER Auction Server Online");
               
		} catch(IOException e) {
			System.out.println("damn "+e);
		}
    }
    
   
    
    public static void main(String[] args) {
        
        
    }
}
