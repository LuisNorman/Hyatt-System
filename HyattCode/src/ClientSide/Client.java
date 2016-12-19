
package ClientSide;

import java.io.*;
import java.net.*;

public class Client {
 
    // These variables hold the necessary socket information 
    // for communincating with the Auction Server
    private Socket 		socket;
    private ObjectInputStream	inputStreamFromServer;
    private ObjectOutputStream	outputStreamToServer;
    private Object		serverReply;
    BufferedReader edit;
    String tmp;
        
    
    public Client() {
        
   
    
        try {
                Socket sock = new Socket("localhost", 6000);
		
                PrintStream pr = new PrintStream(sock.getOutputStream());
                
                System.out.print("Enter customer bill amount: ");
                
                InputStreamReader read = new InputStreamReader(System.in);
                edit = new BufferedReader(read);
                
                tmp = edit.readLine();
                pr.println(tmp);
                
                BufferedReader get = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                
                String tm = get.readLine();
                System.out.print(tm);
                
		} catch(IOException e) {
			System.out.println(e);
			
		}
        
                
        
        }
    
    public String getBill() {
        return tmp;
    }
    
    public static void main(String[] args) {
        Client client = new Client();
    }
}
