package project;

public class ParkingSpace  {
 
	private int number;
	private int area;
	private String userName;
	private String description;
	
	public ParkingSpace(){
		
	}
    public ParkingSpace(int number, int area, String userName, String description){
		this.setNumber(number);
		this.setArea(area);
		this.setUserName(userName);
		this.setDescription(description);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
//    public String to(){
//    	return 
//    }
}
