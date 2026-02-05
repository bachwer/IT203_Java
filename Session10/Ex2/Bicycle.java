package Session10.Ex2;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move(){
        System.out.println("Brand: " +  this.brand + " - Di Chuyen Bang Suc NG" );
    }
}
