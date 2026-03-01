package Session14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> ListCategory =  new HashMap<>();

        ListCategory.put("T01", "Paracetamol");
        ListCategory.put("T02", "Ibuprofen");
        ListCategory.put("T03", "Aspirin");
        ListCategory.put("T04", "Amoxicillin");
        ListCategory.put("T05", "Vitamin C");


        System.out.print("Nhap Ma Thuoc: ");
        String code = input.nextLine();

        if(ListCategory.containsKey(code)){
            System.out.println("Then Thuoc: " + ListCategory.get(code) );
        }else{
            System.out.println("Khong tim thay thuoc");
        }
    }

}
