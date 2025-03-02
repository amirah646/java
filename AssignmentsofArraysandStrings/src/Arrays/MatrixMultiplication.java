package Arrays;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] matrix1={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] matrix2={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int [][] multiplication=new int[matrix1.length][matrix2[0].length];
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix2[0].length;j++){
				for(int k=0;k<matrix1[0].length;k++)
				multiplication[i][j]+=matrix1[i][k]*matrix2[k][j];
			}
		}
		for(int[] sol:multiplication)
			System.out.print(Arrays.toString(sol));
	}

}
