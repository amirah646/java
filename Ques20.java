import java.util.Scanner;


public class Ques20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i,j,c;
		for(i=0;i<x;i++)
		{
			c=1;
			for(j=0;j<x*2;j++)
			{
				if(i+j>x-1 && c>0)
				{
					System.out.print(c);
					c=j>x-1?c-1:c+1;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
