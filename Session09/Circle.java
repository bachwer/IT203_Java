package Session09;

public class Circle extends Shape {
    private double radius;

    // Overloading constructor
    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding (runtime polymorphism)
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Overloading (compile-time)
    public double area(double r) {
        return Math.PI * r * r;
    }
}