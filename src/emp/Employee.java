abstract public class Employee {

    private int Id;
    private String name;


    Employee(int id, String Name){
        this.Id = id;
        this.name = Name;
    }

    public int getId() {
        return Id;
    }
     public String getName() {
         return name;
     }

     abstract public double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Salary='" + calculateSalary() + '\'' +
                '}';
    }
}
