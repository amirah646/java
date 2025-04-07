package university.students;

public class Students {
	private String name;
	private String reg_no;
	private String department;

	public Students(String name,String reg_no,String dpartment){
		this.name=name;
		this.reg_no=reg_no;
		this.department=department;
	}
	
	public String getName(){
		return name;
	}
	
	public String getRegno(){
		return reg_no;
	}
	
	public String toString(){
		return "Name: "+name+" Register No: "+reg_no+" Department: "+department;
	}
}
