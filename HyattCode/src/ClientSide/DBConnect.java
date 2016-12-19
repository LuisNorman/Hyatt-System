package ClientSide;

import ClientSide.*;
import java.util.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
   
   public String[] getLocations () {
       String[] locations = new String[10];
       int i =0;
       try {
            String query = "select * from Location";
            rs = st.executeQuery(query);
            System.out.println("Choose Hotel: ");
            System.out.println();
       
            while(rs.next()) {
                String city = rs.getString("city");
                String state = rs.getString("state");      
                System.out.println(city + ", " + state);
                locations[i] = city + ", " + state;
                i++;    
            }
       }catch(Exception ex) {
           System.out.println("Error: " + ex);
       }
       return locations;
   }
   
   
   public String[] getAreaHotels(String chosenLocation) {
       String[] areaHotels = new String[10];
       System.out.println();
       int i = 0;
       
//       System.out.println("Here are hotels in " + chosenLocation +":");
       
       switch (chosenLocation.charAt(0)) {
            case 'C' :  
                chosenLocation = "Chicago";
                try {
                String query = "select * from Hyatt_CHI";
                rs = st.executeQuery(query);

                while(rs.next()) {
                    String name = rs.getString("Name");
                    String area = rs.getString("Area");
                    String price = rs.getString("Price");
//                  System.out.println(name + " " + area + " " + price);
                    areaHotels[i] = name + " " + area;
                    i++;
                }    
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
            break;
                    
            case 'L' :
                chosenLocation = "Los Angelos";
                try {
                String query = "select * from Hyatt_LA";
                rs = st.executeQuery(query);
       
                while(rs.next()) {
                    String name = rs.getString("Name");
                    String area = rs.getString("Area");
                    String price = rs.getString("Price");
//                  System.out.println(name + " " + area + " " + price);
                    areaHotels[i] = name + " " + area;
                    i++;
                }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
            break;
                    
            case 'N' :
                chosenLocation = "New York City";
                try {
                String query = "select * from Hyatt_NYC";
                rs = st.executeQuery(query);
       
                while(rs.next()) {
                    String name = rs.getString("Name");
                    String area = rs.getString("Area");
                    String price = rs.getString("Price");
//                  System.out.println(name + " " + area + " " + price);
                    areaHotels[i] = name + " " + area;
                    i++;
                }
            
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
            break;
             
            case 'M' :
                chosenLocation = "Miami";
                try {
                String query = "select * from Hyatt_MIA";
                rs = st.executeQuery(query);
  
                while(rs.next()) {
                    String name = rs.getString("Name");
                    String area = rs.getString("Area");
                    String price = rs.getString("Price");
                    areaHotels[i] = name + " " + area;
                    i++;
                }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
            break;
                    
            case 'D' :
                chosenLocation = "Dallas";
                try {
                String query = "select * from Hyatt_DA";
                rs = st.executeQuery(query);
       
                while(rs.next()) {
                    String name = rs.getString("Name");
                    String area = rs.getString("Area");
                    String price = rs.getString("Price");
//                  System.out.println(name + " " + area + " " + price);
                    areaHotels[i] = name + " " + area;
                    i++;
                }
            
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
            break;       
        } 
       System.out.print("Here are area in hotels: "+ chosenLocation);
        return areaHotels;
   }
   
   // Get Specific Hotel Rooms
   public String[] getHotelRooms(String chosenHotel, String chosenLocation) {
       String specificHotel = new String();
       String[] rooms = new String[10];
       System.out.println();
       int i = 0;
       
       
       System.out.println("Here are rooms in " + chosenHotel +":");
       
       
           
       
        System.out.println();
       
       if (chosenLocation.charAt(0) == 'C') {
           
           
           switch (chosenHotel.charAt(6)) {
               case 'C' :
                   System.out.println(chosenHotel);
                   chosenHotel = "Hyatt Centric";
                   try {
                        String query = "select * from Chi_Centric";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
                   
               case 'R' :
                   chosenHotel = "Hyatt Regency";
                   try {
                        String query = "select * from Chi_Regency";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
                   
               case 'P' :
                   chosenHotel = "Hyatt Place";
                   try {
                        String query = "select * from Chi_Place";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
           }
       }
       else if (chosenLocation.charAt(0) == 'L') {
           switch (chosenHotel.charAt(6)) {
               case 'P' :
                   chosenHotel = "Hyatt Place";
                   System.out.println("LAAAA");
                   try {
                        String query = "select * from LA_Place";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
                   
               case 'R' :
                   chosenHotel = "Hyatt Regency";
                   try {
                        String query = "select * from LA_Regency";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
            }
       }
       else if (chosenLocation.charAt(0) == 'M') {
           switch (chosenHotel.charAt(6)) {
               case 'C' :
                    System.out.println("mia");
                   chosenHotel = "Hyatt Centric";
                   try {
                        String query = "select * from MIA_Centric";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
                   
               case 'H' :
                   chosenHotel = "Hyatt House";
                   try {
                        String query = "select * from MIA_House";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
            }
       }
       else if (chosenLocation.charAt(0) == 'D') {
           System.out.println("DAAAA");
           switch (chosenHotel.charAt(6)) {
               
               case 'H' :
                   chosenHotel = "Hyatt House";
                   try {
                        String query = "select * from DA_House";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
                   
               case 'P' :
                   chosenHotel = "Hyatt Place";
                   try {
                        String query = "select * from DA_Place";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
            }
       }
       else if (chosenLocation.charAt(0) == 'N') {
           
           switch (chosenHotel.charAt(6)) {
               
               case 'P' :
                   chosenHotel = "Hyatt Place";
                   try {
                        String query = "select * from NYC_Place";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
                   
               case 'y' :
                   chosenHotel = "Park Hyatt";
                   try {
                        String query = "select * from NYC_Park";
                        rs = st.executeQuery(query);
       
                        while(rs.next()) {
                        String name = rs.getString("Room_Type");
                        String num = rs.getString("Room_Number");
                        String price = rs.getString("Price");
                        String status = rs.getString("Status");
//                      System.out.println(name + " " + area + " " + price);
                        rooms[i] = name + " " + price + " " + status;
                        i++;
                        }
                }catch(Exception ex) {
                    System.out.println("Error: " + ex);
                }
                   break;
            }
       } 
       
       
        specificHotel = chosenHotel;
        
       
       
        return rooms;
   }
   
   public void insertCustomer(Customer inCustomer) throws ParseException {
       Customer customer = inCustomer;
       
       
       
       SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
       Date parsed1 = format1.parse(customer.getCheckIn());
       java.sql.Date checkIn = new java.sql.Date(parsed1.getTime());
       
       SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
       Date parsed2 = format2.parse(customer.getCheckOut());
       java.sql.Date checkOut = new java.sql.Date(parsed2.getTime());
       
       
       try {
           String query = "insert into Reservations (Name, Check_In, Check_Out, City, Hotel, Room_Type)"
                   + "values (?,?,?,?,?,?)";
           PreparedStatement preparedStmt = con.prepareStatement(query);
           preparedStmt.setString(1,customer.getName());
           preparedStmt.setDate(2,checkIn);
           preparedStmt.setDate(3, checkOut);
           preparedStmt.setString(4, customer.getCity());
           preparedStmt.setString(5, customer.getHotel());
           preparedStmt.setString(6, customer.getRoomType());
          
           preparedStmt.execute();
       } catch (Exception e) {
           System.err.print("Error: "+e);
       }
       
       
   }
   
   public String validateCard(long cardNum) {
       String validation = "Invalid";
       
       long length = (long) Math.log10(cardNum) + 1;
       if (length == 16) {
           validation = "Valid";
           
       }
       System.out.println(length);
       return validation;
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
   
   public void checkOutCustomer (String Customer) {
        Client client = new Client();
        
    }
   
   public static void main(String[] args) {
      
       
   }
   
   
}