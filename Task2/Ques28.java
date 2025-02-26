import java.util.Scanner;


public class Ques28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,s=0;
		while(n>0){
			sum=sum*10+1;
			s=sum+s;
			n--;
		}
		System.out.println(s);
	}

}
