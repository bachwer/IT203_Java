package Session14.Ex6;

import java.util.*;

public class QuanLyKhoa {
    public static void main(String[] args) {
        List<Patient> DanhSach = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 28, "Tim mạch")
        );

        Map<String, List<Patient>> mapKhoa = new HashMap<>();

        for (Patient p : DanhSach) {
            if (!mapKhoa.containsKey(p.department)) {
                mapKhoa.put(p.department, new ArrayList<>());
            }

            mapKhoa.get(p.department).add(p);

        }

        System.out.println("Danh sách bệnh nhân theo khoa:");
        for (Map.Entry<String, List<Patient>> entry : mapKhoa.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }


        String khoaDongNhat = "";
        int max = 0;

        for (Map.Entry<String, List<Patient>> entry : mapKhoa.entrySet()) {
            if (entry.getValue().size() > max) {
                max = entry.getValue().size();
                khoaDongNhat = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + khoaDongNhat + " đang đông nhất (" + max + " bệnh nhân).");
    }
}
