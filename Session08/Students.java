package Session08;

public class Students {
    public String studentCode;
    public String fullName;
    public int yearOlds;
    public boolean gender;
    public double scoreMath;
    public double scorePhysics;
    public double scoreChemistry;
    public double avgScore;
    public static int NumberStudent = 0;


    public Students(String fullName, int yearOld, boolean gender, double scoreMath, double scorePhysics, double scoreChemistry) {
        this.fullName = fullName;
        this.yearOlds = yearOld;
        this.gender = gender;
        this.scoreMath = scoreMath;
        this.scorePhysics = scorePhysics;
        this.scoreChemistry = scoreChemistry;
        NumberStudent++;
        this. avgScore = (this.scoreMath + this.scorePhysics + this.scoreChemistry) / 3 ;
        this.studentCode = "PTIT-SV-" + NumberStudent;

    }

    public void ShowStudents(){
        System.out.printf(
                "%-12s %-20s %-8d %-8s %-12.2f %-15.2f %-15.2f%n",
                this.studentCode,
                this.fullName,
                this.yearOlds,
                this.gender ? "Man" : "Woman",
                this.scoreMath,
                this.scorePhysics,
                this.scoreChemistry
        );
    }
    public String getStudentCode(){
        return this.studentCode;
    }
    public String getStudentName(){
        return this.fullName;
    }

    public double avgScore(){
        return avgScore;
    }

}
