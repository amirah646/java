import java.util.Scanner;


public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int[] b=a;
		for(int i=0;i<a.length;i++)
		System.out.print(b[i]);
	}
	

}
