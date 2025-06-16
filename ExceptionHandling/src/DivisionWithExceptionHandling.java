import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            if(denominator==0){
            	System.out.println("Denominator should be greater than zero");
            }
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        //} catch (ArithmeticException e) {
        //    System.out.println("Error: Cannot divide by zero.");
        //} 
    }
}
