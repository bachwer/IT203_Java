package Session04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {
    public static void main(String[] args) {
        String[] blacklist = { "ngu", "xấu", "te", "dở" };
        String regex = "\\b(" + String.join("|", blacklist) + ")\\b";
        String review = "Cuốn sách này quá ngu và nội dung rất te Đọc xong thấy thật dở";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        String result = getString(pattern, review);

        // 3. Cắt nếu quá 200 ký tự (không cắt ngang từ)
        if (result.length() > 10) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }
            result = result.substring(0, cutIndex) + "...";
        }

        System.out.println(result);



    }

    private static String getString(Pattern pattern, String review) {
        Matcher matcher = pattern.matcher(review);
        StringBuilder filteredReview = new StringBuilder();
        int lastEnd = 0;


        while (matcher.find()) {
            filteredReview.append(review, lastEnd, matcher.start());

            int length = matcher.group().length();
            filteredReview.append("*".repeat(length));

            lastEnd = matcher.end();
        }
        filteredReview.append(review.substring(lastEnd));

        String result = filteredReview.toString();
        return result;
    }
}
