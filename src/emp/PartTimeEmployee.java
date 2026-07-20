package emp;

import java.util.ArrayList;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name,String role, double hourlyRate, int hoursWorked) {
        super(id, name,role);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.role = role;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void setHourlyRate(double newSalary) {
        this.hourlyRate = newSalary;
    }
}
