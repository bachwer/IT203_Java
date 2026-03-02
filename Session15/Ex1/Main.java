package Session15.Ex1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEditAction(new EditAction("Updated patient name", "2026-03-02 10:00"));
        history.addEditAction(new EditAction("Added diagnosis", "2026-03-02 10:15"));
        history.addEditAction(new EditAction("Prescribed medication", "2026-03-02 10:30"));


        history.displayHistory();


        System.out.println("\nUndo last edit:");
        System.out.println(history.undoEdit());

        System.out.println("\nLatest edit:");
        System.out.println(history.getLatestEdit());
    }
}
