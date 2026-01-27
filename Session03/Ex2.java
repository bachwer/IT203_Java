package Session03;

import java.util.Objects;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] books = {"ABC","BCD","DEF"};
        String fin;

        System.out.print("Nhap Ten Sach Can Tim: ");
        fin = input.nextLine();

        for(int i = 0; i< books.length; i++){
            if(Objects.equals(fin, books[i])){
                System.out.println("Da tim thay o vi tri index: " + i);
                break;
            }
        }



    }
}
