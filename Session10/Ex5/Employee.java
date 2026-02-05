package Session10.Ex5;

public abstract class Employee implements BonusCalculator{
    private final String name;
    final double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double  calculateSalary();

}
