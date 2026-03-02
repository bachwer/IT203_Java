package Session15.Ex6;

import java.time.LocalDateTime;

public class InputAction {
    String fieldName;
    String oldValue;
    String newValue;
    String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = String.valueOf(LocalDateTime.now());

    }

    public String getFieldName() { return fieldName; }
    public String getOldValue() { return oldValue; }
    public String getNewValue() { return newValue; }
    public String getActionTime() { return actionTime; }
}
