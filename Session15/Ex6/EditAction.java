package Session15.Ex6;

public class EditAction {
    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public String getDescription() {
        return description;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEditedBy(String editedBy) {
        this.editedBy = editedBy;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    @Override
    public String toString(){
        return editTime + " - " + editedBy + ": " + description;
    }
}
