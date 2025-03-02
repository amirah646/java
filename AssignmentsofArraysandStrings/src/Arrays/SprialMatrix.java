package Arrays;

import java.util.Scanner;

public class SprialMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][] matrix=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		int top = 0, bottom = row - 1, left = 0, right = col - 1;
		 while (top <= bottom && left <= right) {
			 for (int i = left; i <= right; i++) {
	                System.out.print(matrix[top][i] + " ");
	            } 
		top++;
		for (int i = top; i <= bottom; i++) {
            System.out.print(matrix[i][right] + " ");
        }
		right--;
		if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;
        }
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
	}
		 
	}

}
