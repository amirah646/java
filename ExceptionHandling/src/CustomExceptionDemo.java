public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(20); 
        } catch (MyCustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
