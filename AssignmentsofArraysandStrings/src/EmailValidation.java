import java.util.Scanner;

public class EmailValidation {

    public static void validEmail(String email) {
        if (email == null || email.length() < 5) {
            System.out.println("Invalid Email: Too short");
            return;
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
        if (atIndex < 1 || atIndex != email.lastIndexOf('@')) {
            System.out.println("Invalid Email");
            return;
        }
        if (dotIndex < atIndex + 2 || dotIndex >= email.length() - 1) {
            System.out.println("Invalid Email");
            return;
        }
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1, dotIndex);
        String tld = email.substring(dotIndex + 1);
        if (!isValidUsername(username)) {
            System.out.println("Invalid Email: Invalid username");
        } else if (!isValidDomain(domain)) {
            System.out.println("Invalid Email: Invalid domain");
        } else if (!isValidTLD(tld)) {
            System.out.println("Invalid Email: Invalid TLD");
        } else {
            System.out.println("Valid Email");
        }
    }

    private static boolean isValidUsername(String username) {
        if (username.isEmpty()) return false;
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidDomain(String domain) {
        if (domain.length() < 2) return false; 
        for (char c : domain.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '.') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidTLD(String tld) {
        if (tld.length() < 2 || tld.length() > 15) return false;
        for (char c : tld.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        validEmail(email);
        sc.close();
    }
}
