package Session02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id;

        do{
            System.out.print("nhập ID: ");
           id = input.nextInt();
           if(id < 1) System.out.println("Mã không hợp lệ, hãy nhập lại");
        }while(id < 1);

        System.out.printf("Xac nhan %d", id);



    }
}
