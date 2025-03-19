package ClassandObjects;

public class MainEmployee {

	public static void main(String[] args) {
		EmployeeDTO emp1=new EmployeeDTO("Raj",123,"Director",500000.0);
		System.out.println("Name: "+emp1.getName());
		System.out.println("Employee ID: "+emp1.getEmpid());
		System.out.println("Designation: "+emp1.getDesignation());
		System.out.println("Salary: "+emp1.getSalary());
		System.out.println("No.of Employee: "+EmployeeDTO.getEmployeecount());
	}

}
