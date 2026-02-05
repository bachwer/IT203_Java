package Session10.Ex1;

public class Circle implements Shape {
    private final double radius;

    public Circle(int i) {
        this.radius = i;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
