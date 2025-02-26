import java.util.Scanner;


public class DiagonalElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int col=sc.nextInt();
		int m[][]=new int[rows][col];
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				m[i][j]=sc.nextInt();
			}
		}
		if(rows==col){
			
			for(int i=0;i<rows;i++){
				for(int j=i;j<col;j++){
					if(i==j){
						System.out.print("["+m[j][i]+"]");
					}
					System.out.print(m[j][i]);
					}
				
				}
			}
		}
	}


