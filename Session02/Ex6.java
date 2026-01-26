package Session02;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int max = 0;
        int min = 1000;
        int sum = 0;
        for(int i = 0; i < 7; i++){

            if( i == 6){
                System.out.print("Nhap Luot Muon ngat Chu Nhat: ");
            }else{
                System.out.printf("Nhap Luot Muon ngat thu: %d :", i + 2);
            }
            int n = input.nextInt();

            if(max < n){
                max = n;
            }
            if(min > n){
                min = n;
            }
            sum += n;
        }


        System.out.println("---Ket Qua Thong Ke---");
        System.out.printf("Luot Muon Cao Nhat %d \n", max);
        System.out.printf("Luot Muon That Nhap %d \n", min);
        System.out.printf("Luot Muon TB %.2f \n", (double) sum / 7);

    }
}
