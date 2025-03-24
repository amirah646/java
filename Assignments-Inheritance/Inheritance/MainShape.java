package Inheritance;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rectangle Details: ");
		Rectangle rec=new Rectangle();
		System.out.print("Length of Rectangle: ");
		rec.length=sc.nextInt();
		System.out.println(rec.length);
		System.out.print("Breadth of Rectangle: ");
		rec.breadth=sc.nextInt();
		System.out.println(rec.breadth);
		rec.areaOfRectangle();
		rec.perimeterOfRectangle();
		System.out.println("Is Rectangle Rotate: "+rec.isRotate(false));
		System.out.println("Enter Circle Details: ");
		Circle cir=new Circle();
		System.out.print("Radius of Circle: ");
		cir.length=sc.nextInt();
		System.out.println(cir.length);
		cir.circumferenceOfCircle();
		System.out.println("Is Circle Rotate: "+cir.isRotate(true));
	}

}
