package Inheritance.LibraryManagement;

public class Staff extends User {
	private String dept;

    public Staff(String name, int id, String dept) {
    	super(name,id);
        this.dept = dept;
    }
}
