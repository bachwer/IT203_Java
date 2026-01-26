package Session02;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----He Thong Danh Gia Doc Gia-------");
        int number;
        System.out.println("(Nhap so ngay tre nhap (999) de ket thuc !");
        int point = 100;
        do{
            System.out.print("Nhap so tre cua lan nay: ");
            number = input.nextInt();
            if(number > 0 && number != 999){
                point -= (number * 2);
                System.out.printf("-> Tra tre %d ngay tru %d diem\n", number, number *2);
            }else if(number <= 0){
                point += 5;
                System.out.println("Cong 5 Diem: ");
            }

        }while (number != 999);

        if(point >= 120){
            System.out.println("Khach Hang Than Thiet");
        }else if( point  >= 80){
            System.out.println("Doc Gia tieu Chuan");
        }else{
            System.out.println("doc Gia can luu i");
        }
        System.out.println(point);
    }
}
