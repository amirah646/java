import java.util.Scanner;


public class SqueakyClean {
	public static void replace(String str){
		System.out.println(str.replace(" ","_"));
	}
	public static void camelCase(String str){
		int index=str.indexOf("-");
		String c=""+str.charAt(index+1);
		String s="";
		s+=str.substring(0,index)+c.toUpperCase()+str.substring(index+2,str.length());
		System.out.println(s);
	}
	
	public static void normalText(String str){
		int i=0;
		while(i<str.length()){
			switch(str.charAt(i)){
			case '4':
				System.out.print("a");
				break;
			case '3':
				System.out.print("e");
				break;
			case '0':
				System.out.print("o");
				break;
			case '1':
				System.out.print("l");
				break;
			case '7':
				System.out.print("t");
				break;
			default:
				System.out.print(str.charAt(i));
			}
			i++;
		}
		System.out.println();
	}
	public static void omitLetter(String str){
		for(int i=0;i<str.length();i++){
			if(Character.isLetter(str.charAt(i))){
				System.out.print(str.charAt(i));
			}
		}
	}
	
	
	public static void main(String[] args) {
		SqueakyClean.replace("my   Hello");
		SqueakyClean.camelCase("a-bc");
		SqueakyClean.normalText("H3ll0 W0rld");
		SqueakyClean.omitLetter("a$#.b");
	}

}
