import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] arr = str.split(" ");
        String res = "";
                for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            int len = word.length();
            
            while (len > 0) {
                res += word.charAt(len - 1);
                len--;
            }
                        if (i < arr.length - 1) {
                res += " ";
            }
        }
        System.out.println(res);
        
        sc.close();
    }
}
