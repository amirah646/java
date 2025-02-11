import java.util.Scanner;


public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("And Operator:"+(a&b));
		System.out.println("OR Operator:"+(a|b));
		System.out.println("Not Operator:"+(~b));
		System.out.println("Xor Operator:"+(a^b));
		System.out.println("LeftShift Operator:"+(a>>1));
		System.out.println("RightShift Operator:"+(a<<2));



	}

}
