import java.util.Scanner;


public class Ques25 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c=s.toCharArray();
		int n=c.length;
		if(c.length%2!=0){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j||i+j==n-1){
				System.out.print(c[j]);
			}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	}
}
