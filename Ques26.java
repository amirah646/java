import java.util.Scanner;


public class Ques26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n*2;i++){
			for(int j=0;j<n*2;j++){
				if(i+j<n||j-i>n-1||i-j>n-1||i+j>=(n*3)-1){
				System.out.print("*");
				}
				else{
					System.out.print("-");
				}
			}
			System.out.println(" ");
			i=i==(n-1)?i+1:i;
		}
	}

}
