package Session02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Nhập số ngày chậm trễ ");
        int n = input.nextInt();
        System.out.print("số lượng sách mượn ");
        int m = input.nextInt();

        double total = n * m * 5000;
        double NewPrice;
        if(n >= 7 && m >= 3){
            NewPrice = total +  (total * 0.2);
        }else{
            NewPrice = total;
        }
        System.out.printf("Tiền phạt Gốc: %f \n", total);
        System.out.printf("Tiền phạt Gốc: %f\n", NewPrice);
        System.out.print("Y/c Khoa the: ");
        System.out.print(NewPrice > 50000);

    }
}
