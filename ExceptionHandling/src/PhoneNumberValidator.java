import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your 10-digit phone number: ");
            long phoneNumber = scanner.nextLong();
            if (String.valueOf(phoneNumber).length() != 10) {
                System.out.println("Invalid phone number length. Must be exactly 10 digits.");
            } else {
                System.out.println("Phone number accepted: " + phoneNumber);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } 
            scanner.close();
    }
}
