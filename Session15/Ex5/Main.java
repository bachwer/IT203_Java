package Session15.Ex5;

public class Main {
    public static void main(String[] args) {
        Patient P1 = new Patient("ID01", "Bach", 19);
        EmergencyCase case1 = new EmergencyCase(P1);

        case1.addStep(new TreatmentStep("Check 1", "11:11"));
        case1.addStep(new TreatmentStep("Check 2", "11:12"));
        case1.addStep(new TreatmentStep("Check 3", "11:13"));

        case1.displaySteps();
        System.out.println("\nUndo last step:");
        System.out.println(case1.undoStep());


        EmergencyCaseQueue queue = new EmergencyCaseQueue();
        queue.addCase(case1);

        System.out.println("\nNext case:");
        System.out.println(queue.getNextCase().getPatient().getName());


    }
}
