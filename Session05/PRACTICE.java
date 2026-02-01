package Session05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PRACTICE {
    static Scanner input = new Scanner(System.in);
    static String[] students = new String[100];
    static int size = 0;

    static final String MSSV_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.print("Nhap lua chon: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    ShowStudents();
                    break;
                case 2:
                    addStudents();
                    break;
                case 3:
                    updateStudents();
                    break;
                case 4:
                    deleteStudents();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 0);
    }


    static  void menu(){
        System.out.println("==============|=======|===============");
        System.out.println("1. In ra danh sách MSSV hiện có");
        System.out.println("2. Yêu cầu nhập MSSV mới");
        System.out.println("3. Nhập vị trí (index) cần sửa và nhập MSSV mới");
        System.out.println("4. Nhập vị trí (index) để xóa MSSV");
        System.out.println("5. Nhập một chuỗi ký tự bất kỳ từ bàn phím");
        System.out.println("6. Thoát");
    }

    static void ShowStudents(){
        if (size == 0) {
            System.out.println("Danh sach rong");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + students[i]);
        }
    }


    static void addStudents() {
        if (size >= 100) {
            System.out.println("Danh Sach Da fay");
            return;
        }
        String MSV;
        while (true) {
            System.out.println("Nhap Ma SB VD: (B:xxxxxx");
            MSV = input.nextLine().trim();

            if (Pattern.matches(MSSV_REGEX, MSV)) {
                break;
            }
        }
        students[size] = MSV;
        System.out.println("Them SV thanh cong");
        size++;

    }

    static void updateStudents(){
        System.out.println("Nhap Vi tri index can up");
        int pos = input.nextInt();
        if (pos < 0 || pos >= size) {
            System.out.println("Vi Tri Ko Hop Le");
            return;
        }
        input.nextLine(); // clear buffer

        String MSV;
        while (true) {
            System.out.println("Nhap Ma SB VD: (B:xxxxxx");
            MSV = input.nextLine();

            if (Pattern.matches(MSSV_REGEX, MSV)) {
                break;
            }

        }

        students[pos] = MSV;
        System.out.println("Update Thanh cong");

    }

    static void deleteStudents(){
        System.out.println("Nhap Vi tri index can Xoa");
        int pos = input.nextInt();
        if (pos < 0 || pos >= size) {
            System.out.println("Vi Tri Ko Hop Le");
            return;
        }

        for (int i = pos; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        students[size - 1] = null;

        size--;
        System.out.println("Xoa Thanh cong");

    }
    static void searchStudent(){
        if(size == 0){
            System.out.println("Danh Sach Rong");
            return;
        }
        System.out.println("Nhap Chuoi Can tim");
        String Search = input.nextLine();


        String regex = "(?i).*" + Pattern.quote(Search) + ".*";
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (students[i].matches(regex)) {
                System.out.println(i + ": " + students[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay MSSV phu hop");
        }


    }
}


