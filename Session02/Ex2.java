package Session02;

import java.util.*;

public class Ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap Ma Khu Vuc A B C D: ");
        char area = input.next().charAt(0);

        switch (area){
            case 'A':
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case 'B':
                System.out.println( "Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Invalid");


        }




    }
}
