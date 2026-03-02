package Session15.Ex3;

public class Main {
    public static void main(String[] args) {
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};

        MedicationProcessChecker newAction =  new MedicationProcessChecker();

        newAction.checkProcess(actions1);




    }
}
