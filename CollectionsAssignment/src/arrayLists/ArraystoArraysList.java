package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraystoArraysList {

	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		
		String[] fruitsarray=fruits.toArray(new String[0]);
		System.out.println(Arrays.toString(fruitsarray));
		
		ArrayList<String> fruitslist=new ArrayList<>(Arrays.asList(fruitsarray));
		System.out.print(fruitslist);
	}

}
