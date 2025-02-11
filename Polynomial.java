import java.util.Scanner;


public class Polynomial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double sl = (b*b)-(4*a*c);
		double x=((-1*b)-Math.sqrt(sl))/(2*a);
		double x1=((-1*b)+Math.sqrt(sl))/(2*a);
		System.out.println(x+","+x1);
	}

}
