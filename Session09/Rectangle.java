package Session09;

public class Rectangle  extends Shape{
    private double width;
    private double height;

    // Overloading constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overriding
    @Override
    public double area() {
        return width * height;
    }
}
