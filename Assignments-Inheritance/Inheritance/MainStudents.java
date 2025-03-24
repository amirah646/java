package Inheritance;

public class MainStudents {

	public static void main(String[] args) {
		System.out.println("ZSGS Default constructor created:");
		ZSGSStudents student1=new ZSGSStudents();
		student1.displayStudents();
		System.out.println();
		
		System.out.println("ZSGSStudents parametrized Constructors created:");
		ZSGSStudents student2=new ZSGSStudents("Amirah",20,"JAVA","20022");
		student2.displayStudents();
		System.out.println();
		
		System.out.println("ZSGSStudents parametrized Constructors created for student3:");
		Students student3=new ZSGSStudents("Sri",19,"WebDeveloper","203405");
		student3.display();
	}

}
