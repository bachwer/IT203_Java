package Session04;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  description = "Sach Giao Khoa Toan Lop 12, Ke: A1-102, Tinh trang moi";

        if(description.contains("Ke:")){
            int start = description.indexOf("Ke:") + "Ke:".length();

            int end;

            if(description.indexOf(",", start) != -1){
                end = description.indexOf(",", start);
            }else{
                end = description.length();
            }

            String position = description.substring(start, end).trim();

            System.out.println("Mã vị trí kệ: " + position);


            String moTaMoi = description.replace("Ke:", "Vị trí lưu trữ:");
            System.out.println("Mô tả sau khi thay thế:");
            System.out.println(moTaMoi);
        }
    }
}
