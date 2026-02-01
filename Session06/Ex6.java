package Session06;

public class Ex6 {
    public static void main(String[] args) {
        // User hợp lệ
        User_Ex6 u1 = new User_Ex6(
                1,
                "user01",
                "123456",
                "user01@gmail.com"
        );
        u1.hienThiThongTin();

        // User sai email
        User_Ex6 u2 = new User_Ex6(
                2,
                "user02",
                "abcdef",
                "user02gmail.com"
        );
        u2.hienThiThongTin();

        // User password rỗng
        User_Ex6 u3 = new User_Ex6(
                3,
                "user03",
                "",
                "user03@gmail.com"
        );
        u3.hienThiThongTin();

        // Thử set lại dữ liệu sai
        System.out.println("Thử đổi email sai:");
        u1.setEmail("abc123");

        System.out.println("Thử đổi password rỗng:");
        u1.setPassword("   ");

        // Dữ liệu vẫn an toàn
        u1.hienThiThongTin();
    }
}
