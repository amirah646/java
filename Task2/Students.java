import java.util.Arrays;


public class Students {
	public static void main(String args[]){
		int n=101,n2=102,n3=103,n4=104,i=0;
		int[] g1=new int[5];
		int[] g2=new int[5];
		int[] g3=new int[5];
		int[] g4=new int[5];
		while(i<=4){
			g1[i]=n;
			n=n+4;
			g2[i]=n2;
			n2=n2+4;
			g3[i]=n3;
			n3=n3+4;
			g4[i]=n4;
			n4=n4+4;
			i++;
			}
		System.out.println("Group1:"+Arrays.toString(g1));
		System.out.println("Group2:"+Arrays.toString(g2));
		System.out.println("Group3:"+Arrays.toString(g3));
		System.out.println("Group4:"+Arrays.toString(g4));

		}	
	}

