package Inheritance;

public class Students {
	 String name;
	 int age;
	
	public Students(){
		System.out.println("/--Students Default Constructor Called");
		this.name=null;
		this.age=0;
	}
	
	public Students(String name,int age){
		System.out.println("/--Students Parameterized Constructor called");
		this.name=name;
		this.age=age;
	}
	
	public void display(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
