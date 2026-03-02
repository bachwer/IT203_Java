package Session15.Ex1;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction> history;

    public MedicalRecordHistory() {
        history = new Stack<>();
    }
    public void addEditAction(EditAction action){
        this.history.push(action);
    }
    public EditAction getLatestEdit(){
        if(!history.isEmpty()){
            return history.peek();
        }
        return null;
    }

    public EditAction undoEdit(){
        if(!history.isEmpty()){
            return history.pop();
        }
        return null;
    }

    boolean isEmpty(){
        return  this.history.isEmpty();
    }

    void displayHistory(){
        if (history.isEmpty()) {
            System.out.println("No edit history available.");
            return;
        }

        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }

}
