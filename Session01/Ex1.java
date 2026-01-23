package Session01;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String BookCode = input.nextLine();
        System.out.print("Nhập Tên sách: ");
        String BookName = input.nextLine();
        System.out.print("Nhập Năm XB: ");
        int publishYear = input.nextInt();
        System.out.print("Nhập Giá Bìa: ");
        double price = input.nextDouble();
        System.out.print("Sách còn ko (true/false): ");
        boolean isAvailable = input.nextBoolean();

        String status = isAvailable ? "Còn sách" : "Đã mượn";
        int bookAge = 2026 - publishYear;

        System.out.println("\n===== PHIẾU THÔNG TIN SÁCH =====");
        System.out.println("Mã sách      : " + BookCode);
        System.out.println("Tên sách     : " + BookName.toUpperCase());
        System.out.println("Năm XB       : " + publishYear);
        System.out.println("Tuổi thọ     : " + bookAge + " năm");
        System.out.printf("Giá tiền     : %.2f VND\n", price);
        System.out.println("Tình trạng   : " + status);
    }
}


