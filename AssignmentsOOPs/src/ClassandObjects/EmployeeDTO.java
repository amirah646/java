package ClassandObjects;

public class EmployeeDTO {
	private static int employeecount=0;
	private String name;
	private int empid;
	private String designation;
	private double salary;
	 
	public EmployeeDTO(String name,int empid,String designation,double salary){
		this.name=name;
		this.empid=empid;
		this.designation=designation;
		this.salary=salary;
		//Increase the count when new employee is added; 
		employeecount++;
	}
	public static int getEmployeecount() {
		return employeecount;
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
}
