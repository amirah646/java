package Conditions;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int table=sc.nextInt();
		int length=sc.nextInt();
		for(int i=1;i<=length;i++){
			System.out.println(table+"*"+i+"="+table*i);
		}
	}

}
