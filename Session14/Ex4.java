package Session14;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        List<String> danhSach = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        Map<String, Integer> thongKe = new TreeMap<>();


        for (String benh : danhSach) {
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        System.out.println("Báo cáo ca bệnh trong ngày:");
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }

    }


}
