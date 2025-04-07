import university.courses.Courses;
import university.faculty.Faculties;
import university.students.Students;


public class MainUniversity {

	public static void main(String[] args) {
		Students stud=new Students("Ramesh","34677","Computer Science");
		Faculties fac=new Faculties("IT",5);
		Courses cour=new Courses("Development","501");
		Courses cour2=new Courses("Ai","502");
		
		System.out.println(stud.toString());
		System.out.println(Courses.getCount());
		
	}
}
