package Session15.Ex1;

public class EditAction {
    String description;
    String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }


    @Override
    public String toString() {
        return "Time: " + time + " | Action: " + description;
    }
}
