package Session06;

public class User_Ex6 {
    // Thuộc tính private
    private int id;
    private String username;
    private String password;
    private String email;

    // Constructor khởi tạo đầy đủ
    public User_Ex6(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password); // kiểm soát dữ liệu
        setEmail(email);       // kiểm soát dữ liệu
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Setter có kiểm tra
    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println(" Password không được rỗng!");
            return;
        }
        this.password = password;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println(" Email không hợp lệ!");
            return;
        }
        this.email = email;
    }

    // Phương thức hiển thị thông tin (ẩn password)
    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
        System.out.println("----------------------");
    }
}