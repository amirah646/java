package Employee;

public class SalariedEmployee extends Employee {
	double annualsalary;
	 public SalariedEmployee(String name,String empid,String department,double annualsalary){
		 super(name,empid,department);
		 this.annualsalary=annualsalary;
	 }
	 
	 public String getEmployeeDetails(){
		 return "SalariedEmployee->"+super.getEmployeeDetails()+"Annual Salary:"+annualsalary;
	 }
}
