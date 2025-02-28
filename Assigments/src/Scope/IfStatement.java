package Scope;

public class IfStatement {

	public static void main(String[] args) {
		int a=10;//Instance Variable
		if(a==10){
			int b=20;// Local variable
		}
		System.out.println(a);
		//System.out.println(b); //Compiler error because b is a local variable. 
		 //Scope of a variable is ends inside the if block.

	}

}
