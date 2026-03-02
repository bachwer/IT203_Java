package Session15.Ex2;

public class Main {
    public static void main(String[] args) {
        PatientQueue PatientList = new PatientQueue();

        PatientList.addPatient(new Patient("01", "Tu1", 18));
        PatientList.addPatient(new Patient("02", "Tu2", 18));
        PatientList.addPatient(new Patient("03", "Tu3", 18));
        PatientList.addPatient(new Patient("04", "Tu4", 18));


        System.out.print("Call Next: ");
        System.out.println(PatientList.CallNextPatient());


        System.out.print("Peek: ");
        System.out.println(PatientList.peekNextPatient());




        PatientList.displayQueue();
    }
}
