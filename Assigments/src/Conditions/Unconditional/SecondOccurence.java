package Conditions.Unconditional;

import java.util.Scanner;

public class SecondOccurence {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,3,4,5,6,2,1};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int count=0,index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				count++;
			if(count==2){
				index=i;
				break;
			}
		}
	}
		if(index!=-1){
			System.out.println("The second occurence of "+target+" at index of "+index);
		}
		else{
			System.out.println("There is no second occurence of the target");
		}
	}
}
	
