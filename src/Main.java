import emp.PayrollEmployee;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        emp.PayrollEmployee payroll = new emp.PayrollEmployee();
        emp.FullTimeEmployee emp1 = new emp.FullTimeEmployee(1, "John Doe", 5000);
        emp.FullTimeEmployee emp2 = new emp.FullTimeEmployee(2, "Jane Smith", 6000);
        emp.FullTimeEmployee emp3 = new emp.FullTimeEmployee(3, "Bob Johnson", 7000);

        emp.PartTimeEmployee partTime = new emp.PartTimeEmployee(2, "Jane Smith", 20, 80);
        emp.PartTimeEmployee partTime2 = new emp.PartTimeEmployee(4, "Alice Brown", 15, 60);
        emp.PartTimeEmployee partTime3 = new emp.PartTimeEmployee(5, "Charlie Davis", 25, 100);

        PayrollEmployee pay1 = new PayrollEmployee();
        pay1.addEmployee(emp1);
        pay1.addEmployee(emp2);
        pay1.addEmployee(emp3);
        pay1.addEmployee(partTime);
        pay1.addEmployee(partTime2);

        pay1.printPayroll();


    }
}