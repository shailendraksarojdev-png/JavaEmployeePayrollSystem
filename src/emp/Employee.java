package emp;

abstract public class Employee {

    private int Id;
    private String name;
    public String role;


    Employee(int id, String Name, String role) {
        this.Id = id;
        this.name = Name;
        this.role = role ;
    }

    public int getId() {
        return Id;
    }
     public String getName() {
         return name;
     }
     public String getRole() {
         return role;
     }

     abstract public double calculateSalary();

    @Override
    public String toString() {
        return "emp.Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", Salary='" + calculateSalary() + '\'' +
                '}';
    }
}
