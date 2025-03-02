import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String r="";
		int t=s.length();
		while(t-1>=0){
			r+=s.charAt(t-1);
			t--;
		}
		System.out.println(r);
	}

}
