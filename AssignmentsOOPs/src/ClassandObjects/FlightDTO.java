package ClassandObjects;

import java.time.LocalDateTime;
import java.util.Date;

public class FlightDTO {
	private String flightid;
	private String flightnumber;
	private String depatureairport;
	private String arrivalairport;
	private LocalDateTime depaturetime;
	private LocalDateTime arrivaltime;
	private String airline;
	private String status;
	
	public FlightDTO(String flightid,String flightnumber,String depatureairport,String arrivalairport,LocalDateTime depaturetime,LocalDateTime arrivaltime1,String airline,String status){
		this.flightid=flightid;
		this.flightnumber=flightnumber;
		this.depatureairport=depatureairport;
		this.arrivalairport=arrivalairport;
		this.depaturetime=depaturetime;
		this.arrivaltime=arrivaltime;
		this.airline=airline;
		this.status=status;
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getDepatureairport() {
		return depatureairport;
	}
	public void setDepatureairport(String depatureairport) {
		this.depatureairport = depatureairport;
	}
	public String getArrivalairport() {
		return arrivalairport;
	}
	public void setArrivalairport(String arrivalairport) {
		this.arrivalairport = arrivalairport;
	}
	public LocalDateTime getDepaturetime() {
		return depaturetime;
	}
	public void setDepaturetime(LocalDateTime depaturetime) {
		this.depaturetime = depaturetime;
	}
	public LocalDateTime getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(LocalDateTime arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString(){
		return "{FlightDTO"+
				" Flight ID: "+flightid+
				" ,Flight Number: "+flightnumber+
				" ,Depature Airport: "+depatureairport+
				" ,Arrival Airport: "+arrivalairport+
				" ,Depature Time: "+depaturetime+
				" ,Arrival Time: "+arrivaltime+
				" ,Airline: "+airline+
				" ,Flight Status: "+status+
				"}";
	}
}	
