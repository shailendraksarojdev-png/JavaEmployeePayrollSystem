package emp;


import java.util.ArrayList;

public class PayrollEmployee{

    private ArrayList<Employee> employees;

    public PayrollEmployee() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int EmployeeId) {
        employees.removeIf(employee -> employee.getId() == EmployeeId);
    }

    public void printPayroll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void updateEmployeeSalary(int EmployeeId, double newSalary) {
        for (Employee employee : employees) {
            if (employee.getId() == EmployeeId) {
                if (employee instanceof FullTimeEmployee) {
                    ((FullTimeEmployee) employee).setMonthlySalary(newSalary);
                } else if (employee instanceof PartTimeEmployee) {
                    ((PartTimeEmployee) employee).setHourlyRate(newSalary);
                }
                break;
            }
        }
    }
}
