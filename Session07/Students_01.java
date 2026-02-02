package Session07;

public class Students_01 {
    public  String studentID;
    public  String studentName;
    private static int totalStudents = 0;

    public Students_01(String id, String name){
        this.studentID = id;
        this.studentName = name;
        totalStudents += 1;
    }

    public void displayInfo(){
        System.out.println("Ma SV: " + this.studentID);
        System.out.println("Ten SV: " + this.studentName);
        System.out.println("------------------------");
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên: " + totalStudents);
    }



    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void setTotalStudents(int totalStudents) {
        Students_01.totalStudents = totalStudents;
    }


}
