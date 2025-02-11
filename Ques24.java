import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i && num <= n; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
