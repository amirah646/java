package Employee;

public class Hourlyemployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public Hourlyemployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

