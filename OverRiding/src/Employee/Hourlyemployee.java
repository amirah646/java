package Employee;

public class Hourlyemployee extends Employee{
	double hourlysalary;
	double totalhours;
	
	public Hourlyemployee(String name,String empid,String department,double hourlysalary,double totalhours){
		super(name,empid,department);
		this.hourlysalary=hourlysalary;
		this.totalhours=totalhours;
	}
	
	public String getEmployeeDetails(){
		return "HourlyEmployee->"+super.getEmployeeDetails()+
				"HourlySalary:"+hourlysalary+"Totalhours: "+totalhours;
	}
}
