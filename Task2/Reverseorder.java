import java.util.Scanner;

public class Reverseorder {
	public static void reverse(String[] s,int left,int right){
		if (left >= right) {
		    return ;
		}
			String temp=s[left];
			s[left]=s[right];
			s[right]=temp;
			reverse(s,left+1,right-1);
	}
    public static void main(String[] args) {
    	String[] s={"one","two","three"};
    	reverse(s,0,s.length-1);
    	for(String str:s)
    	System.out.print(str+" ");
    	
    }
}
