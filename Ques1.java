import java.util.Scanner;
public class Ques1 {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter:");
	char cha=Character.toUpperCase(sc.next().charAt(0));
	for(char i=cha;i<='Z';i++){
		System.out.print(i);
	}
	sc.close();
	}
}
