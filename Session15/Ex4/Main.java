package Session15.Ex4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();




        queue.addPatient(new EmergencyPatient("1", "tu2", 2));
        queue.addPatient(new EmergencyPatient("2", "tu1", 1));
        queue.addPatient(new EmergencyPatient("3", "tu1", 1));
        queue.addPatient(new EmergencyPatient("4", "tu2", 2));



        queue.displayQueue();




    }
}
