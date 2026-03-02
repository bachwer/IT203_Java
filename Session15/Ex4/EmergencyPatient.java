package Session15.Ex4;

public class EmergencyPatient implements Comparable<EmergencyPatient> {

    String id;
    String name;
    int priority; // (1: cấp cứu, 2: thường)

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(EmergencyPatient other) {
        return other.priority - this.priority;

    }

    @Override
    public String toString() {
        return "ID: " +  id + " - " + name + " - Priority: " + priority;
    }
}