package MethodOverloading;

public class Main{

	public static void main(String[] args) {
		Person person1=new Person("Kunal");
		Person person2=new Person("Kunal",20);
		Person person3=new Person("Kunal",20,"Rajasthan");
		
		person1.display();
		person2.display();
		person3.display();
	}

}
