package Session09;

public class ProductionEmployee extends Employee {
    private int quantity;
    private double pricePerProduct;

    public ProductionEmployee(String name,double salary, int quantity, double pricePerProduct) {
        super(name, salary);
        this.quantity = quantity;
        this.pricePerProduct = pricePerProduct;
    }


    @Override
    public double calculateSalary() {
        return quantity * pricePerProduct;
    }
}
