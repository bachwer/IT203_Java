package Session15.Ex5;

import java.util.Stack;

public class EmergencyCase {
    Patient patient;
    Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }


    public void addStep(TreatmentStep step){
        this.steps.push(step);
    }

    public TreatmentStep indoStep(){
        if(steps.isEmpty()){
            System.out.println("IsEmpty !");
            return null;
        }
        return steps.pop();
    }

    void displaySteps(){
        if(steps.isEmpty()){
            System.out.println("IsEmpty !");
            return;
        }

        for(int i = steps.size() - 1; i >= 0; i--){
            System.out.println(steps.get(i));
        }
    }

    public TreatmentStep undoStep(){

        if (steps.isEmpty()) {
            System.out.println("No treatment steps to undo.");
            return null;
        }
        return steps.pop();
    }

    public Patient getPatient(){
        return patient;
    }


}
