import java.util.Scanner;


public class AverageWeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int person1=sc.nextInt();
		int person2=sc.nextInt();
		int person3=sc.nextInt();
		int person4=sc.nextInt();
		int person5=sc.nextInt();
		int person6=sc.nextInt();
		int person7=sc.nextInt();
		int person8=sc.nextInt();
		int person9=sc.nextInt();
		int person10=sc.nextInt();
	    double average=(person1+person2+person3+person4+person5+person6+person7+person8+person9+person10)/10;
	    System.out.println("Average of 10 persons:"+average);
	}

}
