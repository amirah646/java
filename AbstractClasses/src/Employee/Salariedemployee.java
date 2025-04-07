package Employee;

class Salariedemployee extends Employee {
    private double monthlySalary;

    public Salariedemployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
