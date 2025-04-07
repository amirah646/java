package Employee;

public class Employee {
	String name;
	String empid;
	String department;
	
	public Employee(String name,String empid,String department){
		this.name=name;
		this.empid=empid;
		this.department=department;
	}
	
	public String getEmployeeDetails(){
		return "Employee Name: "+name+" Employee Id: "+empid+" Employee Department:"+department;
	}
	
	public String getEmployeeDetails(boolean showtype){
		if(showtype){
			return "[GenericEmployee]"+getEmployeeDetails();
		}
		else{
			return getEmployeeDetails();
		}
	}
}
