import java.util.Scanner;


public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[j]==a[k]){
					int b=a[k];
					System.out.print(b+" ");
				}
			}
		}
		
	}

}
