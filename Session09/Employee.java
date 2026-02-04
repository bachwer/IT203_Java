package Session09;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("====================");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    public double calculateSalary(){
        return 0;
    };

}
