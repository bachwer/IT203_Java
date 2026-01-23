package Session01;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap os thu tu sach");
        int stt = input.nextInt();

        int ke = (stt - 1) / 25 + 1;
        int vitri = (stt - 1) % 25 + 1;


        String khuvuc = ke <= 10 ? "Khu can" : "Khu Vien";

        System.out.println("-----Thong tin vi tri----");
        System.out.printf("Dia chi: ke so %d - vi tri %d\n",ke, vitri );
        System.out.println("Phan khu: " + khuvuc);

    }
}
