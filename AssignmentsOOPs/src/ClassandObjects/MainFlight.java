package ClassandObjects;

import java.time.LocalDateTime;

public class MainFlight {

	public static void main(String[] args) {
		FlightDTO flight=new FlightDTO("DI19F5678","987654","Chennai","France",LocalDateTime.now(),LocalDateTime.of(2025, 3, 15, 12, 30),"Quatarairways","InAir");
		System.out.println(flight);
}
}
