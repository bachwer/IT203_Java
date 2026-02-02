package Session08;



import java.util.ArrayList;
import java.util.Scanner;

public class MiniProject {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Students> studentList = new ArrayList<Students>();
    public static void main(String[] args) {


        int choice;
        do{
            Menu();
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1 -> AddStudents();
                case 2 -> showAllStudents();
                case 3 -> SearchStudents();
                case 4 -> UpdateStudents();
                case 5 -> deleteStudent();
                case 6 -> AVGPoint();
                case 7 -> SortStudents();
                case 8 -> Statistical();


                default -> System.out.println("Invalid");
            }

        }while(choice != 0);

    }

    public static void Menu(){
        System.out.println("==========MENU============");
        System.out.println("1. Add students");
        System.out.println("2. Show All students");
        System.out.println("3. Search Students");
        System.out.println("4. Update Students");
        System.out.println("5. Delete Students");
        System.out.println("6. avgPoint");
        System.out.println("7. Sort Students");
        System.out.println("8. Statistical");
        System.out.println("0. Exit()");
    }
    public static void AddStudents(){
        System.out.println("===========ADD Students========");
        System.out.print("Enter Name: ");
        String Name = input.nextLine();
        System.out.println("Enter The students age: ");
        int age = input.nextInt();
        int choice;
        do{
            System.out.println("Enter the Gender: ");
            System.out.println("1. Man");
            System.out.println("2. Woman");
            choice = input.nextInt();
        }while(choice != 1 && choice != 2);
        boolean gender;
        if(choice == 1){
            gender = true;
        }else{
            gender = false;
        }

        System.out.print("ScoreMath: ");
        double Math = input.nextDouble();
        System.out.print("ScorePhysics: ");
        double Physics = input.nextDouble();
        System.out.print("ScoreChemistry: ");
        double Chemistry = input.nextDouble();


        if(Math >= 0 && Math <= 10 && Physics >= 0 && Physics <= 10 && Chemistry >= 0 && Chemistry <= 10 ){
            Students SV = new Students(Name, age, gender, Math, Physics, Chemistry);

            studentList.add(SV);
            System.out.println("Add Success !");
        }else{
            System.out.println("Add Fail!");
        }


    }

    public static void showAllStudents(){

        System.out.printf(
                "%-12s %-20s %-8s %-8s %-12s %-15s %-15s%n",
                "StudentCode", "FullName", "YearOld", "Gender",
                "Math", "Physics", "Chemistry"
        );
        for(Students s : studentList){
            s.ShowStudents();

        }
        System.out.printf("Tổng số Học sinh: %d\n", Students.NumberStudent);
    }

    public static void SearchStudents(){
        System.out.println("Enter the studentCode or Name: ");
        String search = input.nextLine();
        search = search.toLowerCase();

        boolean found = false;
        for(Students s: studentList){
            if(s.getStudentCode().toLowerCase().contains(search) || s.getStudentName().toLowerCase().contains(search)){
                s.ShowStudents();
                found = true;
            }
        }
        if(!found) System.out.println("Khong Tim Thay Sinh Vien");
    }


    public static void UpdateStudents(){
        System.out.println("Enter the codeStudent to update: ");
        String code = input.nextLine();

        Students SV = null;

        for(Students s : studentList){
            if(s.getStudentCode().equals(code)){
                SV = s;
            };
        }
        if(SV == null){
            System.out.println("Don't found !");
            return;
        }


        System.out.print("Enter Name: ");
        String Name = input.nextLine();
        System.out.println("Enter The students age: ");
        int age = input.nextInt();

        int choice;
        do{
            System.out.println("Enter the Gender: ");
            System.out.println("1. Man");
            System.out.println("2. Woman");
            choice = input.nextInt();
        }while(choice != 1 && choice != 2);


        System.out.print("ScoreMath: ");
        double Math = input.nextDouble();
        System.out.print("ScorePhysics: ");
        double Physics = input.nextDouble();
        System.out.print("ScoreChemistry: ");
        double Chemistry = input.nextDouble();


        if(Math >= 0 && Math <= 10 && Physics >= 0 && Physics <= 10 && Chemistry >= 0 && Chemistry <= 10 ) {
            SV.fullName = Name;
            SV.yearOlds = age;
            SV.scoreMath = Math;
            SV.scorePhysics = Physics;
            SV.scoreChemistry =Chemistry;
            SV.gender = choice == 1;
            System.out.println("Update Success!");
        }else{
            System.out.println("Update fail!");

        }
    }


    public static void deleteStudent(){
        System.out.println("Enter the codeStudent to Delete: ");
        String code = input.nextLine();

        boolean found = false;

        for(Students s : studentList){
            if(s.getStudentCode().equals(code)){
                studentList.remove(s);
                found = true;
            };
        }
        if(!found){
            System.out.println("Don't found !");
        }
    }


    public static void AVGPoint(){
        System.out.println("Enter the codeStudent: ");
        String code = input.nextLine();
        boolean found = false;
        for(Students s : studentList){
            if(s.getStudentCode().equals(code)){
                System.out.println(s.getStudentName() + " AVG: " + s.avgScore);
                found = true;
            };
        }
        if(!found){
            System.out.println("Don't found !");
        }
    }

    public static void SortStudents(){

        for(int i = 0; i < studentList.size() - 1; i++ ){
            for(int j = 0; j < studentList.size() - 1 - i; j++){
                if(studentList.get(j).avgScore > studentList.get(j + 1).avgScore){
                    Students temp =  studentList.get(j + 1);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Success !");
    }

    public static void  Statistical(){
        Students High = studentList.getFirst();
        Students Low = studentList.getFirst();;



        for(Students s : studentList){
            if(High.avgScore < s.avgScore){
                High = s;
            }
            if(Low.avgScore > s.avgScore){
                Low = s;
            }
        }
        System.out.println("Hoc Sinh Diem Cao Nhat: " + High.fullName);
        System.out.println("Diem TB: " + High.avgScore);
        System.out.println("Diem Toan: " + High.scoreMath );
        System.out.println("Diem Ly: " + High.scorePhysics );
        System.out.println("Diem Hoa: " + High.scoreChemistry );
        System.out.println("-----------------------------");
        System.out.println("Hoc Sinh Diem Thap Nhat: " + Low.fullName);
        System.out.println("Diem TB: " + Low.avgScore);
        System.out.println("Diem Toan: " + Low.scoreMath );
        System.out.println("Diem Ly: " + Low.scorePhysics );
        System.out.println("Diem Hoa: " + Low.scoreChemistry );


    }












}
















