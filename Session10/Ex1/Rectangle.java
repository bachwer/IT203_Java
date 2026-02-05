package Session10.Ex1;

public class Rectangle implements Shape{
    private final double height;
    private final double width;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
