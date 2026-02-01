package Session05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    static final String ID_REGEX = "^SV\\d{3}$";
    static final String Name_REGEX ="^[a-zA-ZA-ỹ\\s]{3,}$";
    public static void main(String[] args) {
      int choice;
      do{
          menu();
          choice = input.nextInt();

          switch(choice){

              case 1 -> addStudents();
              case 2 -> updateStudent();
              case 3 -> deleteStudent();
              case 4 -> displayStudents();
              case 5 -> SearchStudents();
              case 6 -> sortByScore();
              case 7 -> countByRank();
              case 0 -> System.out.println("Thoát chương trình!");
              default -> System.out.println("Invalid");
          }


      }while(choice != 0);

    }

    static void menu(){
        System.out.println("=========== Quan Ly Sinh Vien =========");
        System.out.println("1. Them Sinh Vien");
        System.out.println("2. Cap Nhap Sinh Vien");
        System.out.println("3. Xoa Sinh Vien");
        System.out.println("4. Hien thi danh sach sinh vien");
        System.out.println("5. Tim Kiem sinh vien");
        System.out.println("6. Sap Xep sinh vien theo diem");
        System.out.println("7. Thong ke xep loai");
        System.out.println("0. Thoat");
        System.out.println("Enter the number: ");
    }


    static void addStudents(){
        String id;
        do{
            System.out.print("Nhap Ma Sinh Vien VD:(SVxxx): ");
            id = input.nextLine();
        }while (!Pattern.matches(ID_REGEX, id));

        String name;
        do{
            System.out.print("Nhap Ten: ");
            name = input.nextLine();

        }while (!Pattern.matches(Name_REGEX, name));

        System.out.print("Nhap Diem: ");
        double score = input.nextDouble();

        students.add(new Student(id, name, score));
        System.out.println("Them Hoc Sinh Thanh Cong");
    }


    static void updateStudent(){
        System.out.print("Nhap Ma Sinh Vien Cap Nhap: ");
        String id = input.nextLine();
         for(Student s: students){
             if(s.getStudentsId().equalsIgnoreCase(id)){
                 System.out.print("Nhap Ten Moi: ");
                 s.setName(input.nextLine());
                 System.out.print("Nhap Diem Moiw");
                 s.setScore(input.nextDouble());
                 System.out.println("Cap Nhap Thanh Cong");
                 return;
             }
         }
        System.out.println("Khong tim thay id hoc sinh");

    }

    static void deleteStudent(){
        System.out.println("Nhap Ma Sinh Vien Can Xoa: ");
        String Id = input.nextLine();

        students.removeIf(s -> s.getStudentsId().equalsIgnoreCase(Id));


    }


    static void displayStudents(){
        System.out.printf("%-10s %-20s %-6s %-12s", "MaSv", "Ten", "Diem", "XL");
        for(Student s: students){
            System.out.println(s);
        }
    }


    static void SearchStudents(){
        System.out.println("Nhap ten or Ma SV");
        String Key = input.nextLine().toLowerCase();

        for(Student s: students){
            if(s.getStudentsId().toLowerCase().contains(Key) || s.getName().toLowerCase().contains(Key)){
                System.out.println(s);
            }
        }
    }

    static void sortByScore() {
        System.out.print("1. Tăng dần | 2. Giảm dần: ");
        int choice = Integer.parseInt(input.nextLine());

        students.sort((a, b) ->
                choice == 1
                        ? Double.compare(a.getScore(), b.getScore())
                        : Double.compare(b.getScore(), a.getScore())
        );
        System.out.println("✔ Đã sắp xếp!");
    }


    static void countByRank() {
        long gioi = students.stream().filter(s -> s.getRank().equals("Giỏi")).count();
        long kha = students.stream().filter(s -> s.getRank().equals("Khá")).count();
        long tb = students.stream().filter(s -> s.getRank().equals("Trung bình")).count();

        System.out.println("Giỏi: " + gioi);
        System.out.println("Khá: " + kha);
        System.out.println("Trung bình: " + tb);
    }
}
