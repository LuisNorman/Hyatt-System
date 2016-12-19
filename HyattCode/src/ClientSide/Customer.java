
package ClientSide;

public class Customer implements java.io.Serializable {
	private String 		Name;
        private String 		checkIn;
        private String 		checkOut;
	private String 		visa;
	private String 		ccv;
        private String          hotel;
        private String          city;
        private String          room_type;
	
	public Customer() { this("","","","","","","",""); }
	public Customer(String n, String i, String o, String v, String c, String h, String a, String r ) {
            Name = n ;; checkIn = i; checkOut = o; visa = v+"l"; ccv = c; hotel = h; city = a; room_type = r.substring(0,6); 
	}
        
	public String getName() { return Name; }
	public String getCheckIn() { return checkIn; }
        public String getCheckOut() { return checkOut; }
	public String getVisa() { return visa; }
	public String getCCV() { return ccv; }
        public String getCity() { return city; }
        public String getHotel() { return hotel; }
        public String getRoomType() { return room_type; }
	
        /*
	public void setName(String n) { name = n; }
	public void setAddress(String a) { address = a; }
	public void setVisa(String v) { visa = v; }
	public void setExpire(String e) { expire = e; }
	
	public boolean hasMissingInformation() {
		return ((name == null) || (name.length()==0) ||
				(visa == null) || (visa.length()==0) ||
				(address == null) || (address.length()==0) ||
				(expire == null) || (expire.length()==0));
	} */
}