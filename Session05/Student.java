package Session05;

public class Student {
    private String studentId;
    private String name;
    private double score;


    public Student(String studentId, String name, double score){
        this.studentId = studentId;
        this.name = name;
        this. score = score;
    }

    public String getStudentsId(){
        return this.studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore(){
        return this.score;
    }

    public void setScore(double score){
        this.score = score;
    }

    public String getRank(){
        if(score >= 8) return "Gioi";
        if(score >= 6.5) return "Kha";
        if(score >= 6) return "TB";
        return  "Yeu";
    }

    @Override
    public String toString(){
        return String.format("%-10s %-20s %6.2f %-12s", studentId, name, score, getRank());
    }
}
