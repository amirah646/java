package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JaggedArray {
	private List<List<Integer>> personweight;
	public JaggedArray(int N){
		personweight=new ArrayList<>();
		for(int i=0;i<N;i++){
			ArrayList<Integer>weights=new ArrayList<Integer>();
			personweight.add(weights);
		}
	}
	
	public void addWeight(int personId,int weight){
		if(personId>=0 && personId<personweight.size()){
			personweight.get(personId).add(weight);
			System.out.println(personId+" weight is added");
		}
		else{
			System.out.println("Id is invalid");
		}
	}
	public void getMinWeight(int personId){
		if(personId>=0 && personId<personweight.size()){
		List<Integer>ws=personweight.get(personId);
		Collections.sort(ws);
		System.out.println("Mininum Weight of " + personId +":"+ ws.get(0));
		}
		else{
			System.out.println("Id is invalid");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of person weight :");
		int n=sc.nextInt();
		System.out.print("Enter number of inputs:");
		int ip =sc.nextInt();
		JaggedArray ja=new JaggedArray(n);
		for(int i=0; i<ip;i++){
			System.out.print("Enter personId");
			int Id=sc.nextInt();
			System.out.print("Enter weight");
			int weight=sc.nextInt();
			ja.addWeight(Id,weight);
		}
		System.out.print("Enter personId for minimum weight:");
		int Id=sc.nextInt();
		ja.getMinWeight(Id);
	}
}

