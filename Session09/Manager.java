package Session09;

public class Manager extends Employee{
    private final String departments;
    public Manager(String name, double salary, String departments) {
        super(name, salary);
        this.departments = departments;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("departments: " + this.departments);
    }

}
