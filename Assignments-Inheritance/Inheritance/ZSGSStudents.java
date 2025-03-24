package Inheritance;

public class ZSGSStudents extends Students {
	String course;
	String studentId;
	
	ZSGSStudents(){
		super();
		System.out.println("/--ZSGS Default constructor called");
		this.course="Not registered";
		this.studentId="Not Assigned";
	}
	
	ZSGSStudents(String name, int age,String course,String studentId){
		super(name, age);
		System.out.println("/--Constructor after Registered called");
		this.course=course;
		this.studentId=studentId;
	}
	
	public void displayStudents(){
		super.display();
		System.out.println("Course:"+course);
		System.out.println("studentId:"+studentId);
	}
	
	
}
