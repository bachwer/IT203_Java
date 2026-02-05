package Session10.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4,6);

        System.out.println("Hinh Tron");
        System.out.println("Dien tich: " + circle.getArea());
        System.out.println("Chu Vi: " + circle.getPerimeter());

        System.out.println("----------------------");

        System.out.println("Hinh Chu Nhat");
        System.out.println("Dien Tich: " + rectangle.getArea());
        System.out.println("Chu Vi: " + rectangle.getPerimeter());


    }
}
