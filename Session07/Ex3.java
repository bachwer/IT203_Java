package Session07;

public class Ex3 {
    public static void main(String[] args) {
        double avg = ScoreUtils_03.average(6.5, 7.0, 8.0);
        boolean pass = ScoreUtils_03.isPass(avg);
        System.out.println("--------------------");
        System.out.println("Điểm trung bình: " + avg);

        if (pass) {
            System.out.println("Kết quả: ĐẠT");
        } else {
            System.out.println("Kết quả: KHÔNG ĐẠT");
        }

    }
}
