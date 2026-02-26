package Session13.Ex5;

public class Patient {
    private String id;
    private String fullName;
    private String age;
    private String Diagnosis;

    public Patient(String id, String fullName, String age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        Diagnosis = diagnosis;
    }







    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }
}
