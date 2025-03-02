package Arrays;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		int [][]m={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int [][]n=new int[m.length][m.length];
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				n[j][i]=m[i][j];
			}
		}	
		for(int[] l:n)
		System.out.println(Arrays.toString(l));

	}

}
