import java.util.Scanner;
public class Ques11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c=s.toCharArray();
		char a = 0;
		for(int i=0;i<c.length;i++){
			if(!Character.isDigit(c[i])){
				a=c[i];
				System.out.print(a);
			}
			else{
				int count = Character.getNumericValue(c[i]); 
				for(int j=0;j<count;j++){
					System.out.print(a);
				}
			}
		}
	}
	}


