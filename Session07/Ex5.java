package Session07;

public class Ex5 {
    public static void main(String[] args) {
        int score = 85;
        if (score >= Config_05.MIN_SCORE && score <= Config_05.MAX_SCORE) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }
}
