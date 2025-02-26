import java.util.Arrays;


public class Ques17 {

	public static void main(String[] args) {
		int []a={1,2,3,4,5,6,7};
		int []b=new int[a.length];
		int end=a.length-1;
		int start=0;
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				b[i]=a[end--];
			}
			else{
				b[i]=a[start++];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
