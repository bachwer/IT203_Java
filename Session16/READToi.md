ĐẶC TẢ YÊU CẦU PHẦN MỀM (SRS) - MINI PROJECT: PET KINGDOM
1. Giới thiệu
   Pet Kingdom là một ứng dụng quản lý cửa hàng thú cưng quy mô nhỏ. Hệ thống giúp người quản lý theo dõi danh sách thú cưng, khách hàng thân thiết và xử lý danh sách chờ phục vụ tại spa thú cưng.
2. Mục tiêu dự án
- Vận dụng kiến thức về Java Collections Framework (List, Set, Map).
- Thực hành quản lý luồng dữ liệu với Stack và Queue.
- Sử dụng Generic để tối ưu hóa mã nguồn.
3. Các yêu cầu chức năng (User Requirements)
   3.1. Quản lý kho thú cưng (Sử dụng List/Generic)
- Thêm mới thú cưng: Người dùng có thể nhập thông tin để thêm một thú cưng mới vào kho.
- Hiển thị danh sách: Liệt kê toàn bộ thú cưng đang có trong hệ thống.
- Tìm kiếm: Tìm thú cưng theo mã định danh duy nhất (ID).
- Xóa: Loại bỏ thú cưng khỏi danh sách khi đã được bán.
  3.2. Quản lý khách hàng thân thiết (Sử dụng Set/Map)
- Đăng ký thành viên: Hệ thống lưu trữ danh sách khách hàng. Lưu ý: Mỗi khách hàng là duy nhất, không trùng lặp số điện thoại hoặc ID.
- Tra cứu nhanh: Cho phép tìm thông tin khách hàng dựa trên mã khách hàng để áp dụng giảm giá.
  3.3. Quản lý dịch vụ Spa (Sử dụng Queue)
- Tiếp nhận thú cưng: Khi khách hàng mang thú cưng đến làm đẹp, thú cưng sẽ được đưa vào một danh sách chờ.
- Xử lý dịch vụ: Thú cưng nào đến trước sẽ được phục vụ trước (theo nguyên tắc First-In-First-Out). Hệ thống hiển thị thông tin thú cưng đang được tắm rửa/cắt tỉa.
  3.4. Nhật ký hoạt động gần đây (Sử dụng Stack)
- Lưu vết thao tác: Hệ thống ghi lại các hành động vừa thực hiện (ví dụ: vừa thêm thú cưng A, vừa xóa thú cưng B).
- Hoàn tác (Undo): Cho phép xem lại hoặc lấy ra hành động gần nhất vừa thực hiện (theo nguyên tắc Last-In-First-Out).

---
4. Ràng buộc kỹ thuật (Technical Constraints)
- Ngôn ngữ: Java.
- Kiến trúc: Console Application (Tương tác qua màn hình đen).
- Cấu trúc dữ liệu:
    - Bắt buộc dùng List cho quản lý kho.
    - Bắt buộc dùng Set hoặc Map cho quản lý khách hàng để đảm bảo tính duy nhất hoặc tra cứu nhanh.
    - Bắt buộc dùng Queue cho quản lý hàng đợi Spa.
    - Bắt buộc dùng Stack cho nhật ký hoạt động.
- Generic: Các class quản lý cần sử dụng Generic <T> để có thể tái sử dụng cho nhiều loại đối tượng khác nhau.
5. Nhiệm vụ của sinh viên
1. Thiết kế Thực thể: Tự xác định các class (thực thể) cần thiết (ví dụ: Pet, Customer, Service...).
2. Thiết kế Thuộc tính: Tự đưa ra các thuộc tính phù hợp cho từng thực thể (ví dụ: Pet có id, name, species...).
3. Thiết kế Mối quan hệ: Xác định cách các thực thể tương tác với nhau (ví dụ: Một Customer có thể sở hữu nhiều Pet).
4. Cài đặt chương trình: Viết mã nguồn hoàn thiện các chức năng đã mô tả.