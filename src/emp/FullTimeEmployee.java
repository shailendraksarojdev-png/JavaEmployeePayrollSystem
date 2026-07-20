package emp;

public class FullTimeEmployee  extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, String role, double monthlySalary) {
        super(id, name, role);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double newSalary) {
        this.monthlySalary = newSalary;
    }
}


