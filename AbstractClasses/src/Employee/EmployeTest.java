package Employee;

import java.util.Scanner;

public class EmployeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee type: ");
        String type = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        Employee employee;

        if (type.equals("hourly")) {
            System.out.print("Enter hourly rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter hours worked: ");
            double hours = scanner.nextDouble();

            employee = new Hourlyemployee(name, id, rate, hours);
        } else if (type.equals("salaried")) {
            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();

            employee = new Salariedemployee(name, id, salary);
        } else {
            System.out.println("Invalid employee type.");
            scanner.close();
            return;
        }

        
        employee.getEmployeeDetails();
        System.out.println("Calculated Pay: $" + employee.calculatePay());

        scanner.close();
    }
}
