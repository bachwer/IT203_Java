package Session02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Nhap so sanh muon tra: ");
        int n = input.nextInt();

        int total = 0;
        int number;
        for (int i = 1 ; i <= n; i++){
            number = 0;
            System.out.printf("Nhap so ngay tre cuon thu %d: ", i);
            number = input.nextInt();
            total += (number * 5000);
        }

        System.out.printf("===> Tong Tien phat: %d", total);

    }
}
