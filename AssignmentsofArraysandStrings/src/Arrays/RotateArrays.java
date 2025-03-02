package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rotate:");
		int n=sc.nextInt();
		System.out.println("Enter the lenght of the array:");
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			System.out.println("Enter array values:");
			arr[i]=sc.nextInt();
		}
		n=n%len;
		for(int j=0;j<n;j++){
		int last=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=last;
		}
		System.out.print("Output of rotated array:"+Arrays.toString(arr));
		}

}
