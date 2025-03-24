package MethodOverloading;

public class Person {
	String name;
	int age;
	String address;
	
	Person(String name){
		this.name=name;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	Person(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public void display(){
		System.out.println("Person1 Name:"+name);
		System.out.println("Person2 Name:"+name+"Person2 age:"+age);
		System.out.println("Person3 Name:"+name+"Person age:"+age+"Person Address:"+address);
	}
}
