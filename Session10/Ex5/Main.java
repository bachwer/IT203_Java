package Session10.Ex5;

public class Main {
    public static void main(String[] args) {
        Employee nvq = new OfficeStaff("Nguyen Van A", 10000);
        Employee Mng = new Manager("Nguyen Van M", 20000);


        System.out.println("OfficeStaff: " +    nvq.calculateSalary());
        System.out.println("Manager: " + Mng.calculateSalary());
    }
}
