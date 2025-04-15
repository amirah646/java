package Sorting;

import java.util.Scanner;

public class MainSorting {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.println("Enter the Array");
		
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
		}
		
		Sortable sort=null;
		sort=new SelectionSort();
		sort.sort(arr);
		System.out.println("Sorted Array:");
		for(int num:arr){
			System.out.print(num+" ");
		}
	}
}
