package Inheritance;

public class Rectangle extends Shape {
	int area;
	int perimeter;
	
	void areaOfRectangle(){
		System.out.println("Area: " +(length*breadth));
	}
	void perimeterOfRectangle(){
		System.out.println("Perimeter: "+(length+breadth));
	}
}
