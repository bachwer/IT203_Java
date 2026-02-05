package Session10.Ex5;

public class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary + getBonus();
    }

    @Override
    public double getBonus() {
        return 20;
    }
}
