package Session14;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Set<String> thuoc =  new HashSet<>();
        thuoc.add("Aspirin");
        thuoc.add("Caffeine");
        thuoc.add("Paracetamol");


        Set<String> diUng = new HashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");

        Set<String> CanhBao =  new HashSet<>(thuoc);
        CanhBao.retainAll(diUng);

        Set<String> anToan = new HashSet<>(thuoc);
        anToan.removeAll(diUng);

        System.out.println("Cảnh báo dị ứng: " + CanhBao);
        System.out.println("Thành phần an toàn: " + anToan);

    }
}
