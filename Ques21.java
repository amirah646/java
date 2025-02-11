
import java.util.Scanner;

public class Ques21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i,j,c,n=x;
		for(i=0;i<x;i++)
		{
			c=n;
			for(j=0;j<x*2;j++)
			{
				if(i+j>x-1 && c>=n)
				{
					System.out.print(c);
					c=j>x-1?c-1:c+1;
				}
				else
				{
					System.out.print(" ");
				}
			}
			n--;
			System.out.println();
		}

	}

}