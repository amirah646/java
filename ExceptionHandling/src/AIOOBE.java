public class AIOOBE {

	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of the length of the array");
			System.out.println(e.getMessage());
		}

	}

}