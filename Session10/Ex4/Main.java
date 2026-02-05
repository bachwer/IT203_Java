package Session10.Ex4;

public class Main {
    public static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl(){
            @Override
            public void powerOn(){
                System.out.println("Den Da Bat");
            }
        };

        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
