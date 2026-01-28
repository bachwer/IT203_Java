package Session04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {

    private static final String LOG_REGEX =
            "(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*User:\\s*([A-Za-z0-9_]+)\\s*\\|\\s*Action:\\s*(BORROW|RETURN)\\s*\\|\\s*BookID:\\s*(BK\\d+)";

    public static void main(String[] args) {
        String Log = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        Pattern pattern = Pattern.compile(LOG_REGEX);
        Matcher matcher = pattern.matcher(Log);

        if (matcher.matches()) {
            String date = matcher.group(1);
            String user = matcher.group(2);
            String action = matcher.group(3);
            String bookId = matcher.group(4);

            System.out.println("Ngày: " + date);
            System.out.println("Người dùng: " + user);
            System.out.println("Hành động: " + action);
            System.out.println("Mã sách: " + bookId);
        } else {
            System.out.println("Dòng log không hợp lệ");
        }



    }
}
