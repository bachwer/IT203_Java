package Session04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex3 {
    public static void main(String[] args) {
        long start = System.nanoTime();

        StringBuilder str = getStringBuilder();
        System.out.println(str);

        long end = System.nanoTime();


        long start1 = System.nanoTime();
        String str1 = StringNoBuilder();
        System.out.println(str1);

        long end1 = System.nanoTime();







        System.out.println("Thoi gian thuc thi String : " + (end1 - start1)/1_000_000.0 + " ms");
        System.out.println("Thoi gian thuc thi String Builder: " + (end - start)/1_000_000.0 + " ms");


    }

    private static String StringNoBuilder(){
        String[] transaction = new String[100_000];
        for (int i = 0; i < transaction.length; i++) {
            transaction[i] = "BK" + i + "-20/10";
        }
        String str = "";


        Date dateToday = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(dateToday);

        str = str + "-----BAO CAO MUON SACH--------\n";
        str = str + "Ngay Tao: " + formattedDate + '\n';

        for(int i = 0; i < transaction.length; i++){

            str = str + "Giao Dich " + transaction[i] + '\n';
        }
        return str;
    }

    private static StringBuilder getStringBuilder() {
        String[] transaction = new String[100_000];
        for (int i = 0; i < transaction.length; i++) {
            transaction[i] = "BK" + i + "-20/10";
        }
        StringBuilder str = new StringBuilder();

        Date dateToday = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(dateToday);


        str.append("-----BAO CAO MUON SACH--------\n");

        str.append("Ngay Tao: ").append(formattedDate).append('\n');


        for(int i = 0; i < transaction.length; i++){
            str.append("Giao Dich " + transaction[i] + '\n');
        }
        return str;
    }
}
