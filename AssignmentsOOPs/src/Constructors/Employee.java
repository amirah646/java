package Constructors;

import ClassandObjects.EmployeeDTO;

public class Employee extends EmployeeDTO{

	Employee(String name, int empid, String designation, double salary) {
		super(name, empid, designation, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EmployeeDTO[] employeeArray=new EmployeeDTO[30];
		int employeeCount = 0;

        employeeArray[employeeCount++] = new EmployeeDTO("Ramesh",101, "Software Engineer", 80000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Amirah",102, "Project Manager", 120000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Ruby",103, "Data Scientist", 95000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Sathish",104, "UX Designer", 75000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Deepak",105, "QA Engineer", 70000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Sruthi",106, "Sales Representative", 60000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Srivathsan",107, "HR Manager", 90000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Ramadoss",108, "Financial Analyst", 85000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Sudhakar",109, "Network Administrator", 78000.00);
        employeeArray[employeeCount++] = new EmployeeDTO("Vinoth",110, "Customer Support", 55000.00);

        System.out.println("Employee Information:");
        for (int i = 0; i < employeeCount; i++) {
        	System.out.println("EmployeeName:"+employeeArray[i].getName()+", EmployeeId: "+ employeeArray[i].getEmpid() +
                    ", Designation: " + employeeArray[i].getDesignation() +
                    ", Salary: $" + employeeArray[i].getSalary());
        }
	}

}
