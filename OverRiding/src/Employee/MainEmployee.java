package Employee;

public class MainEmployee {

	public static void main(String[] args) {
		Employee emp1=new Hourlyemployee("Akash","145693","Developer",50.0,150.0);
		Employee emp2=new SalariedEmployee("Arun","67477654","Testing",50000);
		System.out.println(emp1.getEmployeeDetails());
		System.out.println(emp2.getEmployeeDetails());
		System.out.println(emp1.getEmployeeDetails(false));
	}

}
