package Session06;

public class Student_Ex1 {
    private String studentCode;
    private String FullName;
    private Double AVTPoint;
    private int year;

    public Student_Ex1(String studentCode, String FullName, Double AVTPoint, int year ){
        this.studentCode = studentCode;
        this.FullName = FullName;
        this.AVTPoint = AVTPoint;
        this.year = year;
    }


    public void showInforStudent(){
        System.out.println("------------Information of Students ------------");
        System.out.println("studentCode: " + this.studentCode);
        System.out.println("FullName: " + this.FullName);
        System.out.println("Point: "+ this.AVTPoint);
        System.out.println("Year: " + this.year );
    }
}
