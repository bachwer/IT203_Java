package Session10.Ex2;

public class Car extends Vehicle{

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move(){
        System.out.println("Brand: "+   this.brand + " - Di chuyển bằng động cơ ");
    }
}
