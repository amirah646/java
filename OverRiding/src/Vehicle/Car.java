package Vehicle;

public class Car extends  Vehicle {
	int speed;
	
	public Car(String brand,String color,int speed){
		super(brand,color);
		this.speed=speed;
	}
	
	public String start(){
			return "Speed greater than 40km/hr "+super.start();
	}
	public String stop(){
		return "No petrol"+super.stop();
	}
}
