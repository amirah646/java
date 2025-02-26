import java.util.Scanner;


public class CheckChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(!Character.isDigit(ch)){
			System.out.println(ch + " is character");
		}
		System.out.println(ch + " is not a character");
	}

}
