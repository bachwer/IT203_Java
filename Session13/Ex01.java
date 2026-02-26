package Session13;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {
    public static void main(String[] args) {


        ArrayList<Double> temp = new ArrayList<>();
        temp.add(36.5);
        temp.add(40.2);
        temp.add(37.0);
        temp.add(12.5);
        temp.add(39.8);
        temp.add(99.9);
        temp.add(36.8);

        System.out.println("Danh sách ban đầu: " + temp);



        Iterator<Double> iterator = temp.iterator();

        while (iterator.hasNext()) {
            Double temp1 = iterator.next();
            if (temp1 < 34.0 || temp1 > 42.0) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách sau khi lọc: " + temp);


        double sum = 0.0;
        for (Double tep : temp) {
            sum += tep;
        }

        double average = sum / temp.size();

        System.out.printf("Nhiệt độ trung bình: %.2f\n", average);






    }
}
