package Session09;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("FullName: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Student extends Person {
    private final String studentId;
    private final double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age); // gọi constructor của Person
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
