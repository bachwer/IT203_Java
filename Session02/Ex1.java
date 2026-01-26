package Session02;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập tuổi của bạn: ");
        int old = input.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        int bookNumber = input.nextInt();

        String str = "";
        if(old < 18){
            str = "Ban Khong du dieu kien \n - ly do phai du 18 tro len";
        }else if(bookNumber > 3){
            str = "Ban Khong du dieu kien \n - Banj da muon tren 3 cuon";
        }else{
            str = "ban da du dieu kien muon sach";
        }

        System.out.printf(str);

    }
}


