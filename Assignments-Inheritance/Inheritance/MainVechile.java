package Inheritance;

import java.util.Scanner;

public class MainVechile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Car car=new Car();
		System.out.println("/----Car Details-----/");
		System.out.println("Enter Car Speed");
		car.speed=sc.nextInt();
		System.out.println("Enter Tyres");
		car.tyres=sc.nextInt();
		System.out.println(car.isBoolean(true));
		car.start();
		
	}

}
