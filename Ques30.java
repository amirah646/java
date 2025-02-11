import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ques30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][]a=new int[row][col];
		List<List<Integer>> result = new ArrayList<>();
		List<Integer>[] diagonals = new ArrayList[row+col-1];

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			a[i][j]=sc.nextInt();
			}
		}
		if(row==col){
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					int sum = i+j;
					if(diagonals[sum]==null){
						diagonals[sum] = new ArrayList<>();
					}
					diagonals[sum].add(a[i][j]);
				}
			}
			for (List<Integer> diagonal : diagonals) {
	            if (diagonal != null) { 
	              result.add(diagonal);
	            }
	        }
			System.out.println(result);
			
			}
		else{
			System.out.println("Not a squarenmatrix");

		}
		
	}

}
