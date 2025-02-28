package Conditions;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		char grade;
		if(score>=90){
			grade='A';
		}
		else if(score>=70){
			grade='B';
		}
		else if(score>=50){
			grade='C';
		}
		else if(score>=40){
			grade='D';
		}
		else{
			grade='F';
		}
		System.out.println(grade);
		
	}

}
