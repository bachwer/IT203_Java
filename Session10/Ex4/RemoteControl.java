package Session10.Ex4;

public interface RemoteControl {
    void powerOn();

    default void checkBattery(){
        System.out.println("Pin On Dinh");
    }
}
