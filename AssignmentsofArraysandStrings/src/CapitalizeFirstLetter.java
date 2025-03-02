import java.util.Scanner;


public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String str=sc.nextLine();
		    String[] arr = str.split(" ");
		    String res="";
		    for(int i=0;i<arr.length;i++){
		    	res+=Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1)+" ";
		    }
		    System.out.print(res);
	}  
}