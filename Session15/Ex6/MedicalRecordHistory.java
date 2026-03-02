package Session15.Ex6;

import java.util.Stack;

public class MedicalRecordHistory {
    String recordId;
    Stack<EditAction> editStack;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
        editStack = new Stack<>();
    }
    public void addEdit(EditAction action){
        editStack.push(action);
    }

    public EditAction getLastEdit(){
        if(editStack.isEmpty()) return null;
        return editStack.peek();
    }

    public EditAction undoLastEdit() {
        if (editStack.isEmpty()) return null;
        return editStack.pop();
    }
}
