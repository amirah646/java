package Vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle car=new Car("Benz","Black",60);
		Vehicle car1=new Car("Honda","White",0);
		System.out.println(car.start());
		System.out.println(car.stop());
	}

}
