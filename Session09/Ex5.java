package Session09;

import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("An", 8_000_000, 2_000_000));
        employees.add(new ProductionEmployee("Bình", 20_000, 20, 20_000 ));
        employees.add(new OfficeEmployee("Chi", 9_000_000, 1_500_000));

        double totalSalary = 0;

        for (Employee e : employees) {
            totalSalary += e.calculateSalary();
        }

        System.out.println("Tổng lương: " + totalSalary);
    }
}
