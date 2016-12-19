/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerSide;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


/**
 *
 * @author Luis
 */
public class DBConnect {
   private Connection con; 
   private Statement st;
   private ResultSet rs;
   static String userid = "root";
   static String password = "";
   static String url = "jdbc:mysql://localhost:5000/Hyatt";

   public String chosenLocation = "";
   
   public DBConnect() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url,userid, password);
           st = con.createStatement();
           
       } catch (Exception ex) {
           System.out.println("MESSY!!! Error: "+ex);  
       } 
   }
   
   public String[] viewReservations() {
       String[] reservations = new String[40];
       int i =0;
            try {
            String query = "select * from Reservations";
            rs = st.executeQuery(query);
            System.out.println();
       
            while(rs.next()) {
                String Name = rs.getString("Name");
                     
                Date checkIn = rs.getDate("Check_In");
                Date checkOut = rs.getDate("Check_Out");
                String city = rs.getString("City");
                String hotel = rs.getString("Hotel");
                String roomType = rs.getString("Room_Type");
                //int id = rs.getInt("id");
                reservations[i] = Name;
                i++;    
            }
       }catch(Exception ex) {
           System.out.println("Error: " + ex);
       }  
       return reservations;
   }
 
   public String[] showUser (String customer) {
       String[] userReservations = new String[4];
       
       try {
            String query = "select * from Reservations";
            rs = st.executeQuery(query);
            System.out.println();
       
            while(rs.next()) {
                String name = rs.getString("Name");     
                Date checkIn = rs.getDate("Check_In");
                Date checkOut = rs.getDate("Check_Out");
                String city = rs.getString("City");
                String hotel = rs.getString("Hotel");
                String roomType = rs.getString("Room_Type");
                //int id = rs.getInt("id");
                userReservations[0] ="Name: " + name;
                userReservations[1] ="Hotel: "+ hotel;
                userReservations[2]="Room Type: " + roomType;
                userReservations[3]= "Date: "+ checkIn + " to " + checkOut;  
                
            }
       }catch(Exception ex) {
           System.out.println("Error: " + ex);
       }  
       return userReservations;
   }
   
   public void cancelReservations(String name) throws SQLException {
       String query = "delete from Reservations ";
       PreparedStatement preparedStmt = con.prepareStatement(query);
       preparedStmt.setString(1, name);
       preparedStmt.execute();
   }
   
   public void changeCheckIn(String newDate, String customer) throws ParseException, SQLException {
       
       SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
       Date parsed1 = format1.parse(newDate);
       java.sql.Date checkIn = new java.sql.Date(parsed1.getTime());
      
       String update = "UPDATE Reservations"
				+ " SET check_in = ?"
				+ " WHERE name = ?";
       
       PreparedStatement preparedStmt = con.prepareStatement(update);
       preparedStmt.setDate(1,checkIn);
       preparedStmt.setString(2,customer);
       
       preparedStmt.execute();
   }
  
   public void changeCheckOut(String newDate, String customer) throws ParseException, SQLException {
       
       SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
       Date parsed1 = format1.parse(newDate);
       java.sql.Date checkOut = new java.sql.Date(parsed1.getTime());
      
       String update = "UPDATE Reservations"
				+ " SET check_out = ?"
				+ " WHERE name = ?";
       
       PreparedStatement preparedStmt = con.prepareStatement(update);
       preparedStmt.setDate(1,checkOut);
       preparedStmt.setString(2,customer);
       
       preparedStmt.execute();
   }
 
   public void checkOut (String Customer) {
        Server server = new Server();
   }
   
   public static void main (String[] args) {
       DBConnect staff = new DBConnect();
       
       
   }
    
}
