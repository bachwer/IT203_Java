import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen 4 chu so: ");
        int number = sc.nextInt();

        // Tách từng chữ số bằng toán tử số học
        int thousands = number / 1000;
        int hundreds  = (number / 100) % 10;
        int dozens    = (number / 10) % 10;
        int units     = number % 10;

        // Tính tổng 3 chữ số đầu
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;

        // Kiểm tra điều kiện
        boolean isValid = (sumOfFirstThreeNumber % 10 == units);

        // In kết quả
        System.out.println(isValid);
    }
}