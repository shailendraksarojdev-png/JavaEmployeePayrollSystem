import emp.PayrollEmployee;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        emp.PayrollEmployee payroll = new emp.PayrollEmployee();
        emp.FullTimeEmployee emp1 = new emp.FullTimeEmployee(1, "John Doe", "Full-Time", 5000);
        emp.FullTimeEmployee emp2 = new emp.FullTimeEmployee(2, "Jane Smith", "Full-Time", 6000);
        emp.FullTimeEmployee emp3 = new emp.FullTimeEmployee(3, "Bob Johnson", "Full-Time", 7000);

        emp.PartTimeEmployee partTime = new emp.PartTimeEmployee(6, "Jane Smith", "Part-Time", 20, 80);
        emp.PartTimeEmployee partTime2 = new emp.PartTimeEmployee(4, "Alice Brown", "Part-Time", 15, 60);
        emp.PartTimeEmployee partTime3 = new emp.PartTimeEmployee(5, "Charlie Davis", "Part-Time", 25, 100);

        PayrollEmployee pay1 = new PayrollEmployee();
        pay1.addEmployee(emp1);
        pay1.addEmployee(emp2);
        pay1.addEmployee(emp3);
        pay1.addEmployee(partTime);
        pay1.addEmployee(partTime2);

        pay1.printPayroll();

        System.out.println("\n Removing employee with ID 2 (Jane Smith) from payroll...");
        pay1.removeEmployee(2);
        pay1.printPayroll();


    }
}