package Session15.Ex6;

import java.util.Stack;

public class UndoManager {

    private final Stack<InputAction> undoStack;
    private final int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.undoStack = new Stack<>();
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        if (undoStack.size() == maxUndoSteps) {
            undoStack.remove(0); // loại bỏ thao tác cũ nhất
        }
        undoStack.push(action);
    }

    public InputAction undo() {
        if (undoStack.isEmpty()) return null;
        return undoStack.pop();
    }
}