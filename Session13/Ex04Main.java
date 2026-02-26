package Session13;

public class Ex04Main {
    public static void main(String[] args) {
        Ex04 er = new Ex04();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.patientCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();


    }
}
