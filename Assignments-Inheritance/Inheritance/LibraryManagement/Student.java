package Inheritance.LibraryManagement;

public class Student extends User {
	private String studentClass;

    public Student(String name, int id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }
}
