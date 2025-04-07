package Vehicle;

public class Vehicle {
	String brand;
	String color;
	
	public Vehicle(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
	public String start(){
		return "Started";
	}
	
	public String stop(){
		return "Vehicle stoped";
	}
}
