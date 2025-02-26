import java.util.Arrays;
import java.util.Scanner;


public class Ques18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(i%2==0 && j%2==0){
					if(a[i]<a[j]){
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					
				}
				if(i%2==1 && j%2==1){
					if(a[i]>a[j]){
						int min=a[i];
						a[i]=a[j];
						a[j]=min;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
