package Session09;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(2));

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area(); // Overriding - runtime
        }

        System.out.println("Tổng diện tích = " + totalArea);
    }
}