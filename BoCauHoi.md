{
  "artifactType":  "ARTIFACT_TYPE_OTHER",
  "summary":  "Giải đáp chi tiết 30 câu hỏi đầu tiên (Mức độ Cơ Bản) trong bộ câu hỏi phỏng vấn Java, trình bày khoa học, dễ hiểu, dễ nhớ.",
  "updatedAt":  "2026-03-03T12:43:23.777727Z"
}# BỘ ĐÁP ÁN PHỎNG VẤN JAVA - PHẦN I (CƠ BẢN)
*Tài liệu được thiết kế tối ưu, khoa học dành cho người học cần hiểu sâu và dễ nhớ.*

### 1. JDK, JRE và JVM khác nhau như thế nào? Quan hệ giữa chúng ra sao?
- **JVM (Java Virtual Machine):** Máy ảo Java. Nơi trực tiếp chạy *Bytecode* (`.class`). Nó phụ thuộc vào hệ điều hành (OS), giúp Java có tính "Viết một lần, chạy mọi nơi".
- **JRE (Java Runtime Environment):** Môi trường thực thi Java. Bao gồm JVM + Các thư viện lớp cơ sở (Core Libraries) cần thiết để chạy một chương trình Java.
- **JDK (Java Development Kit):** Bộ công cụ phát triển Java. Bao gồm JRE + Các công cụ để lập trình (trình biên dịch `javac`, công cụ gỡ lỗi `jdb`, `javadoc`, v.v.).

> [!TIP]
> **Công thức ghi nhớ nhanh:**
> `JDK = JRE + Tools` (Dành cho Dev)
> `JRE = JVM + Libraries` (Chỉ để chạy)
> **Mối quan hệ bao hàm:** **JDK ⊃ JRE ⊃ JVM**

---

### 2. Các kiểu dữ liệu nguyên thủy trong Java gồm những gì và kích thước bao nhiêu?
Gồm **8 kiểu**, chia làm 4 nhóm:
| Nhóm | Kiểu dữ liệu | Kích thước | Giá trị mặc định |
| :--- | :--- | :--- | :--- |
| **Số nguyên** | `byte` | 1 byte | 0 |
| | `short` | 2 bytes | 0 |
| | `int` | 4 bytes | 0 |
| | `long` | 8 bytes | 0L |
| **Số thực** | `float` | 4 bytes | 0.0f |
| | `double` | 8 bytes | 0.0d |
| **Ký tự** | `char` | 2 bytes | '\u0000' |
| **Luận lý** | `boolean` | 1 bit (tùy JVM) | false |

---

### 3. Sự khác nhau giữa `==` và `equals()` khi so sánh chuỗi là gì?
- `==`: So sánh **ĐỊA CHỈ BỘ NHỚ** (Reference). Trả về `true` nếu hai biến trỏ đến cùng một đối tượng trong bộ nhớ.
- `equals()`: So sánh **NỘI DUNG** (Value). Trả về `true` nếu chuỗi ký tự bên trong giống hệt nhau.

> [!WARNING]
> Luôn luôn sử dụng `equals()` để so sánh nội dung 2 chuỗi `String` trong Java, nếu dùng `==` có thể sinh ra bug khó phát hiện (ví dụ: chuỗi tạo bằng `new String()` và chuỗi khởi tạo trực tiếp).

---

### 4. Vòng lặp `for`, `while` và `do-while` khác nhau như thế nào?
- `for`: Biết trước số lần lặp.
- `while`: Không biết trước số lần lặp. **Kiểm tra điều kiện trước**, nếu đúng mới chạy. (Có thể chạy 0 lần).
- `do-while`: Không biết trước số lần lặp. **Chạy ít nhất 1 lần rồi mới kiếm tra điều kiện**.

---

### 5. `break` và `continue` khác nhau ra sao trong vòng lặp?
- `break`: **Thoát hẳn** khỏi vòng lặp hiện tại ngay lập tức.
- `continue`: **Bỏ qua** phần còn lại của lần lặp hiện tại, nhảy đến lần lặp tiếp theo.

---

### 6. Mảng (Array) trong Java là gì? Hạn chế lớn nhất của mảng là gì?
- **Khái niệm:** Là một cấu trúc dữ liệu lưu trữ một tập hợp tuần tự các phần tử **cùng kiểu**, kích thước cố định. Các phần tử nắm giữ các vị trí bộ nhớ liên tiếp.
- **Hạn chế lớn nhất:** **Kích thước cố định (Fixed size)**. Khi đã khởi tạo, không thể tăng/giảm kích thước mảng. (Đó là lý do ta thường dùng `ArrayList` thay thế).

---

### 7. Cách khởi tạo mảng 10 số nguyên và giá trị mặc định của nó là gì?
```java
int[] arr = new int[10];
```
- Giá trị mặc định cho tất cả 10 phần tử là **`0`** (vì kiểu `int` là nguyên thủy có default = 0).

---

### 8. Java sử dụng cơ chế truyền tham trị hay tham chiếu?
> [!IMPORTANT]
> Java **CHỈ SỬ DỤNG TRUYỀN THAM TRỊ (Pass-By-Value)**. Không có truyền tham chiếu (Pass-By-Reference) như C++.
- **Với kiểu nguyên thủy (int, float...):** Truyền bản sao của giá trị.
- **Với kiểu đối tượng (Object...):** Truyền bản sao của giá trị **địa chỉ tham chiếu**. Do nấm chung 1 địa chỉ, ta có thể thay đổi thuộc tính bên trong, nhưng không thể trỏ biến cũ sang một Object hoàn toàn mới trong hàm.

---

### 9. Chuỗi ký tự (String) trong Java có thay đổi được không? Vì sao?
- **Không thay đổi được (Immutable)**.
- **Vì sao?**
  1. Bảo mật: Tránh bị thay đổi dữ liệu ngầm định (ví dụ URL kết nối DB không bị đổi).
  2. Đồng bộ (Thread-safe): Nhiều luồng có thể dùng chung 1 String mà không sợ đụng độ.
  3. Tối ưu bộ nhớ với String Pool: Các chuỗi giống nhau có thể dùng chung một vùng nhớ.
  (Khi bạn thay đổi chuỗi, thực chất Java tạo ra một chuỗi mới ở vùng nhớ khác).

---

### 10. Lập trình hướng đối tượng (OOP) là gì? 4 tính chất cơ bản gồm những gì?
- **OOP:** Là phương pháp lập trình xoay quanh các **Đối tượng (Object)** mang dữ liệu (thuộc tính) và hành vi (phương thức).
- **4 tính chất cơ bản (A PIE):**
  1. **A**bstraction (Trừu tượng): Ẩn giấu logic phức tạp, chỉ đưa ra các tính năng cần thiết (VD: Remote TV).
  2. **P**olymorphism (Đa hình): Một hành động nhưng đối tượng khác nhau thể hiện khác nhau (VD: Chó sủa gâu gâu, Mèo kêu meo meo).
  3. **I**nheritance (Kế thừa): Lớp con kế thừa tính năng của lớp cha (Tái sử dụng code).
  4. **E**ncapsulation (Đóng gói): Gói gộp dữ liệu và phương thức vào một đơn vị, che giấu/bảo vệ dữ liệu (VD: dùng `private` và `getter/setter`).

---

### 11. Lớp (Class) và đối tượng (Object) khác nhau như thế nào?
- **Class:** Là **Bản thiết kế (Blueprint/Template)**. Không chiếm bộ nhớ (về mặt cấp phát đối tượng thực).
- **Object:** Là **Thực thể cụ thể** được tạo ra từ Class. Chiếm bộ nhớ trong Heap.
- *Ví dụ:* Class là bản thiết kế ngôi nhà. Object là ngôi nhà thi công thực tế từ bản thiết kế đó.

---

### 12. Hàm khởi tạo (Constructor) là gì? Có những loại nào?
- **Khái niệm:** Là phương thức đặc biệt dùng để tạo ra đối tượng. Tên Constructor phải **trùng với tên Class** và **không có kiểu trả về** (không có cả `void`).
- **Phân loại:**
  1. Default constructor (Do Java tự tạo nếu không khai báo cái nào, không có tham số, thân rỗng).
  2. No-args constructor (Tự khai báo, không tham số).
  3. Parameterized constructor (Có tham số truyền vào).

---

### 13. Từ khóa `this` dùng để làm gì?
Dùng để **tham chiếu tới đối tượng hiện tại** của lớp.
- Phân biệt biến instance (biến cấp class) và biến cục bộ/tham số khi chúng trùng tên.
- Gọi các constructor khác cùng class (`this()`).
- Truyền `this` như một tham số (đại diện cho đối tượng hiện tại) vào phương thức khác.

---

### 14. Các mức độ truy cập trong Java theo thứ tự từ hẹp đến rộng là gì?
Từ hẹp nhất đến rộng nhất:
1. **`private`**: Chỉ truy cập được trong **cùng Class**.
2. **`default`** (không ghi gì): Truy cập trong **cùng Package**.
3. **`protected`**: Truy cập trong **cùng Package** HOẶC **khác Package nhưng phải là Class con**.
4. **`public`**: Truy cập tự do **mọi nơi**.

---

### 15. Getter và Setter thể hiện tính đóng gói như thế nào?
- Tính đóng gói yêu cầu che giấu dữ liệu bằng cách đặt các biến (fields) là `private`.
- Không cho bên ngoài tự ý thay đổi (có thể đặt số âm vào trường Tuổi).
- Chỉ cung cấp `public Getter`/`Setter` để đọc/ghi, từ đó class có thể **kiểm soát tính hợp lệ** của dữ liệu trước khi gán.

---

### 16. Biến tĩnh (static) và biến đối tượng (instance) khác nhau ra sao?
- **Biến tĩnh (`static`):** Được chia sẻ cho **toàn bộ các đối tượng** của lớp đó. Nằm ở bộ nhớ riêng (Method Area/Metaspace), được tạo 1 lần khi load class. Có thể gọi qua tên `ClassName.var`.
- **Biến đối tượng:** Khác biệt đối với từng đối tượng cụ thể (Mỗi đối tượng có vùng nhớ riêng). Phải dùng bằng cách khởi tạo đối tượng trước.

---

### 17. Package là gì? Lợi ích của package trong quản lý chương trình?
- **Khái niệm:** Là một "thư mục" dùng để nhóm các Class/Interface có liên quan lại với nhau.
- **Lợi ích:**
  1. Tránh đụng độ tên class (Name conflicts). VD: `java.sql.Date` khác `java.util.Date`.
  2. Dễ dàng tìm kiếm và quản lý code.
  3. Tăng tính bảo mật/kết nối bằng chỉ định access modifier `default`.

---

### 18. Giao diện (Interface) là gì? Một lớp có thể thực hiện bao nhiêu giao diện?
- **Khái niệm:** Là một bản thiết kế "chuẩn mực" gồm các phương thức trừu tượng (những hành vi giao kèo mà Class triển khai bắt buộc phải có). Từ Java 8, Interface có thể có `default method`.
- **Số lượng:** Một lớp chỉ được KẾ THỪA (extends) **1** lớp cha, nhưng có thể THỰC HIỆN (implements) **Nhiều** giao diện (Đa kế thừa thông qua interface).

---

### 19. Lỗi khi biên dịch (Compile-time error) và lỗi khi chạy (Runtime error) khác nhau thế nào?
- **Biên dịch:** Bắt được trong lúc viết code hoặc compile (thiếu chấm phẩy, sai kiểu dữ liệu, gọi sai tên hàm). Code không bao giờ chạy được ra file `.class`.
- **Khi chạy:** Xảy ra lúc chương trình *đang hoạt động* dẫn đến chết/crash (chia cho 0, trỏ tới đối tượng `null`, mảng vượt quá index).

---

### 20. Cách khai báo hằng số trong Java?
Sử dụng kết hợp từ khóa `static final`:
```java
public static final double PI = 3.14159;
```
- `static`: Cấp phát 1 lần xài chung, gọi trực tiếp từ tên Lớp.
- `final`: Ngăn không cho thay đổi giá trị sau khi đã khởi tạo. Cú pháp tên hằng thường là IN_HOA_TẤT.

---

### 21. Lớp `Scanner` dùng để làm gì? Hiện tượng trôi lệnh là gì?
- **Dùng:** Nhận dữ liệu nhập từ bàn phím.
- **Trôi lệnh:** Xảy ra khi dùng các hàm như `nextInt()`, `nextDouble()` sau đó đến `nextLine()`. Hàm `nextInt()` chỉ đọc phần số, để chừa lại phím *Enter* (`\n`) trong bộ đệm. Kế tiếp `nextLine()` chạy sẽ lấy ngay dấu `\n` đó => Chuỗi rỗng, không cho người dùng nhập nữa (Trôi lệnh!).
- **Khắc phục:** Thêm một dòng `scanner.nextLine();` trung gian để "ăn" dấu Enter thừa đó.

---

### 22. Toán tử chia lấy dư `%` dùng để làm gì?
- Lấy phần dư của phép chia giữa 2 số. (VD: `5 % 2 = 1`).
- **Ứng dụng:**
  - Kiểm tra chẵn lẻ (`n % 2 == 0`).
  - Lấy chữ số cuối cùng của 1 số (VD: lấy số hàng đơn vị `123 % 10 = 3`).

---

### 23. Trong `switch-case`, vai trò của `break` là gì?
Ngăn chặn hiệu ứng **Fall-through**. Khi tìm thấy `case` khớp, nếu không có vòng lặp chặn bằng `break`, Java sẽ tiếp tục chạy lọt xuống toàn bộ các khối lệnh của các `case` phía dưới dù không thỏa điều kiện, cho đến khi gặp `break` hoặc hết cấu trúc switch.

---

### 24. Toán tử ba ngôi là gì? Cú pháp ra sao?
Là cách viết tắt gọn gàng của if-else, nhận 3 toán hạng.
- **Cú pháp:** `Điều_kiện ? Kết_quả_nếu_đúng : Kết_quả_nếu_sai;`
- *Ví dụ:* `String rs = (diem >= 5) ? "Qua môn" : "Thi lại";`

---

### 25. Biến cục bộ có được gán giá trị mặc định không?
**KHÔNG**. Biến cục bộ (nằm trong hàm/phương thức) không có giá trị mặc định. Nếu bạn cố sử dụng nó trước khi tự tay gán giá trị khởi tạo, trình biên dịch (Compiler) sẽ báo lỗi ngay lập tức.

---

### 26. Phương thức `void` có thể dùng `return` không?
**CÓ**. Nhưng chỉ được dùng `return;` (trống, không mang theo giá trị). Vai trò của nó lúc này là để **thoát khỏi phương thức sớm**, bỏ qua các lệnh phía dưới.

---

### 27. `length` của mảng và `length()` của chuỗi khác nhau thế nào?
- `length`: Dùng cho **Mảng (Array)**. Đây là một **thuộc tính (property)** đại diện cho sức chứa (kích thước) của mảng (VD: `arr.length`).
- `length()`: Dùng cho **Chuỗi (String)**. Đây là một **phương thức (method)** thực hiện đếm xem trong chuỗi có bao nhiêu byte cấu thành lên (VD: `str.length()`).

---

### 28. Mảng hai chiều trong Java có bản chất là gì?
Bản chất mảng 2 chiều trong Java là "Mảng của của mảng" (Array of arrays). Tức là một mảng 1 chiều, trong đó mỗi phần tử lại trỏ tới một mảng 1 chiều khác. Cấu trúc này cho phép tạo ra các mảng *răng cưa* (mảng có số cột không bằng nhau ở mỗi hàng).

---

### 29. `print` và `println` khác nhau thế nào?
- `print()`: In chuỗi ra màn hình nhưng **không xuất ký tự xuống dòng** (con trỏ vẫn ở nguyên kết thúc chuỗi cuối).
- `println()`: In chuỗi ra xong và **tự động chèn ký tự xuống dòng** (`\n`), lệnh in tiếp theo sẽ xuất hiện ở dòng dưới.

---

### 30. Khi nào nên dùng `if-else` thay vì `switch-case`?
- **Dùng `if-else`:** Khi kiểm tra điều kiện phức tạp (nhỏ hơn, lớn hơn `<`, `>`), khoảng giá trị nhiều logic, hay khi điều kiện là kiểu logic `boolean`.
- **Dùng `switch-case`:** Khi so sánh bằng (chuỗi giá trị rõ ràng 1-1 cụ thể như các enum, một vài String cố định, các số nguyên). `switch-case` đọc dễ hiểu và trong 1 vài trường hợp so bằng số lớn có tốc độ tra cứu tối ưu hơn qua bảng hash/table do Java sinh ra.

---
*End of Part 1. Hãy thử sức học thuộc và thực hành để hiểu sâu nhé!*
{
  "artifactType":  "ARTIFACT_TYPE_OTHER",
  "summary":  "Giải đáp chi tiết phần 2 (Mức độ Trung bình, câu 31-60) của bộ câu hỏi phỏng vấn Java, trình bày khoa học, hệ thống và dễ nhớ cho người học theo từng chủ đề hướng đối tượng, tập hợp và đối tượng.",
  "updatedAt":  "2026-03-03T12:44:48.641569Z"
}# BỘ ĐÁP ÁN PHỎNG VẤN JAVA - PHẦN II (TRUNG BÌNH)
*Tài liệu được thiết kế tối ưu, khoa học dành cho người học cần hiểu sâu và dễ nhớ.*

---

### 31. Bộ nhớ trong Java được chia thành những vùng nào? Đối tượng lưu ở đâu?
Bộ nhớ trong Java chủ yếu chia thành 3 vùng chính:
1. **Stack Memory (Ngăn xếp):** Lữu trữ các biến cục bộ (local variables) và tham chiếu của đối tượng. Vùng nhớ này được cấp phát cho mỗi luồng (Thread) và tự dọn dẹp khi hàm kết thúc.
2. **Heap Memory (Đống):** Là nơi chứa **TOÀN BỘ CÁC ĐỐI TƯỢNG (Objects) và mảng** được khởi tạo bằng từ khóa `new`. Các đối tượng trong Heap được quản lý bởi Garbage Collector (GC).
3. **Method Area / Metaspace:** Lưu trữ cấu trúc Class, hằng số tĩnh (static), mã phương thức.

> [!TIP]
> **Nhớ nhanh:** Đối tượng (Object) nằm ở **Heap**. Biến con trỏ trỏ đến Object đó nằm ở **Stack**.

---

### 32. Tính kế thừa là gì? Vai trò của từ khóa gọi lớp cha là gì?
- **Khái niệm:** Kế thừa (Inheritance) cho phép một lớp (Class con) thừa hưởng các thuộc tính và phương thức từ một lớp khác (Class cha) thông qua từ khóa `extends`. Mục đích là **Tái sử dụng code**.
- **Vai trò từ khóa `super` (gọi lớp cha):**
  - `super()`: Gọi hàm khởi tạo của lớp cha. (Java tự động điền `super()` rỗng ở đầu hàm khởi tạo lớp con nếu lập trình viên không viết).
  - `super.thuộc_tính` / `super.phương_thức()`: Truy cập tới biến, hàm của lớp cha khi lớp con bị trùng tên (do che khuất hoặc đã ghi đè).

---

### 33. Nạp chồng (Overloading) và ghi đè (Overriding) phương thức khác nhau thế nào?
| Tiêu chí | Nạp chồng (Overloading) | Ghi đè (Overriding) |
| :--- | :--- | :--- |
| **Vị trí** | Trong **cùng một Class**. | Ở **hai Class** có tính kế thừa. |
| **Tên phương thức** | Trùng tên. | Trùng tên. |
| **Tham số** | **PHẢI KHÁC NHAU** (số lượng, kiểu, thứ tự). | **PHẢI GIỐNG HỆT NHAU**. |
| **Kiểu trả về** | Tùy ý. | Phải giống hoặc là kiểu con (Covariant). |
| **Thời điểm chạy** | Đa hình lúc Compile (Compile-time). | Đa hình lúc Runtime (Runtime polymorphism). |

---

### 34. Khi nào nên dùng lớp trừu tượng (Abstract Class), khi nào nên dùng giao diện (Interface)?
- **Dùng Abstract Class:** Khi các lớp con có chung "huyết thống" (mối quan hệ **IS-A** mạnh). Bạn cần chia sẻ code thực tế (có thân hàm) hoặc biến cấu trúc (field) dùng chung.
- **Dùng Interface:** Khi bạn muốn định nghĩa một "khả năng" hoặc "kết nối" (mối quan hệ **CAN-DO**) cho các lớp không liên quan gì đến nhau. (VD: Máy bay và Con chim đều implement `IFlyable`). Khi cần **đa kế thừa**.

---

### 35. Đa hình trong Java được hiểu như thế nào?
Đa hình (Polymorphism) là việc một đối tượng có thể đóng nhiều vai trò khác nhau hoặc một phương thức có thể được thực thi theo nhiều cách khác nhau tùy thuộc vào đối tượng gọi nó.
**Biểu hiện chính:**
- Dùng `Reference` của lớp CHÚA cha trỏ đến đối tượng của lớp CON: `Animal a = new Dog();`
- Lúc chạy, phương thức `a.speak()` sẽ gọi tiếng sủa của `Dog` thực tế, thay vì của `Animal`.

---

### 36. Bộ sưu tập (Collection Framework) trong Java gồm những nhóm chính nào?
Gồm 3 nhánh chính thuộc họ Iterable/Collection:
1. **List (Danh sách):** Lưu trữ theo thứ tự, **cho phép** phần tử trùng lặp (`ArrayList`, `LinkedList`).
2. **Set (Tập hợp):** Lưu trữ không theo thứ tự nhất định, **KHÔNG cho phép** phần tử trùng lặp (`HashSet`, `TreeSet`).
3. **Queue (Hàng đợi):** Lưu trữ theo quy tắc Xếp hàng (FIFO/First-In-First-Out).
*Lưu ý: Nhóm **Map** (`HashMap`) cấu trúc Key-Value độc lập, không trực tiếp kế thừa từ interface `Collection` nhưng vẫn thuộc Collection Framework.*

---

### 37. Danh sách mảng (`ArrayList`) và danh sách liên kết (`LinkedList`) khác nhau về hiệu năng ra sao?
| Tiêu chí | ArrayList | LinkedList |
| :--- | :--- | :--- |
| **Bản chất** | Mảng động (Dynamic Array). | Danh sách liên kết kép (Doubly Linked). |
| **Lấy phần tử (Get)** | **Rất nhanh** $O(1)$. Nhảy trực tiếp tới index. | Chậm $O(n)$. Phải duyệt từ đầu/cuối bảng. |
| **Thêm/xóa ở ĐẦU-GIỮA**| Chậm $O(n)$. Phải dịch chuyển (shift) các phần tử phía sau. | **Rất nhanh** $O(1)$. Chỉ cần đổi con trỏ hai bên. |
| **Dùng khi nào?** | Data thay đổi ít, tìm kiếm quét đọc nhiều. | Tranh chấp thêm/xóa liên tục. |

---

### 38. Cách duyệt tập hợp dạng khóa – giá trị (`Map`) đúng chuẩn là gì?
Sử dụng `entrySet()` kết hợp Enhanced For-loop (hoặc ForEach của Java 8) để lấy ra cả cặp `Key-Value` cùng lúc hiệu quả nhất:
```java
Map<String, Integer> map = new HashMap<>();
// C1: Chuẩn mực, hiệu năng cao nhất
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
// C2: Java 8+ ngắn gọn
map.forEach((k, v) -> System.out.println(k + ": " + v));
```

---

### 39. Generic là gì? Vì sao cần dùng với Collection?
- **Generic (Tổng quát hóa `<T>`):** Cho phép xác định kiểu dữ liệu tham số hóa cho các Lớp, Interface, hoặc Hàm, giúp chúng tái sử dụng an toàn với nhiều loại cấu trúc.
- **Vì sao dùng với Collection:**
  1. **An toàn kiểu (Type-Safety):** Bắt lỗi sai kiểu tại lúc Compile thay vì lúc Runtime (ClassCastException).
  2. Bỏ qua việc ép kiểu thủ công mệt mỏi mỗi khi lấy item ra khỏi Collection. (VD thay vì ép kiểu `(String) list.get(0)`, ta dùng `List<String>`).

---

### 40. Chuỗi ký tự (`String`), bộ xây dựng chuỗi (`StringBuilder`) và bộ đệm chuỗi (`StringBuffer`) khác nhau thế nào?
- **`String`:** Immutable (không thay đổi). Mỗi lần cộng chuỗi sẽ sinh đối tượng mới -> Tốn bộ nhớ và chậm.
- **`StringBuilder`:** Mutable (thay đổi được). Cộng chuỗi siêu tốc trên 1 đối tượng duy nhất. **Không Thread-safe**. (Thường dùng 99% trường hợp).
- **`StringBuffer`:** Tương đương `StringBuilder` nhưng có hỗ trợ **Thread-safe** (đồng bộ hóa). Chạy chậm hơn Builder do có cơ chế lock.

---

### 41. Biểu thức chính quy (Regex) là gì? Ứng dụng trong kiểm tra dữ liệu?
- **Khái niệm:** Là một chuỗi ký tự quy định một mô hình tìm kiếm (pattern).
- **Ứng dụng:** Kiểm tra (Validate) dữ liệu đầu vào.
  - Kiểm tra chuẩn email: `^[A-Za-z0-9+_.-]+@(.+)$`
  - Kiểm tra mật khẩu (có hoa, thường, số, ký tự, độ dài).
  - Kiểm tra số điện thoại: `^0\d{9}$` (Bắt đầu bằng 0, theo sau là 9 chữ số).

---

### 42. So sánh tự nhiên (`Comparable`) và so sánh tùy chỉnh (`Comparator`) khác nhau thế nào?
- **`Comparable` (Tự nhiên):**
  - Implement trực tiếp vào Class đối tượng (VD `class Student implements Comparable`).
  - Phải override hàm `compareTo()`.
  - Chỉ quy định được **MỘT** cách sắp xếp cố định (VD luôn xếp theo Điểm).
- **`Comparator` (Tùy chỉnh):**
  - Viết ra một class/lamda rời rạc bên ngoài không chạm vào Class đối tượng.
  - Phải override hàm `compare()`.
  - Thiết kế được **NHIỀU** quy luật xếp (Lúc xếp theo tên, lúc xếp theo tuổi) tự do truyền vào cho lệnh sort.

---

### 43. Ngăn xếp (Stack) hoạt động theo nguyên lý gì?
- Hoạt động theo nguyên lý **LIFO (Last-In, First-Out)** - Vào sau ra trước.
- **Ví dụ thực tế:** Nút Back của trình duyệt duyệt web, Chức năng Undo (Ctrl+Z), cơ chế gọi đệ quy hàm. Lệnh thêm là `push()`, lấy ra là `pop()`.

---

### 44. Hàng đợi (Queue) hoạt động theo nguyên lý gì?
- Thực hoạt động theo nguyên lý **FIFO (First-In, First-Out)** - Vào trước ra trước.
- **Ví dụ thực tế:** Xếp hàng mua vé, xử lý các Job nạp vào Server chờ chạy. Lệnh thêm là `offer() / add()`, lấy ra là `poll() / rermove()`.

---

### 45. Từ khóa `final` có ý nghĩa gì với biến, phương thức và lớp?
> [!IMPORTANT]
> `final` nghĩa là "Bất biến - Không thể thay đổi".
- **Biến `final`:** Trở thành Hằng số. Gán giá trị 1 lần là khóa lại, không gán lại được.
- **Phương thức `final`:** Không cho phép Lớp con **ghi đè (Override)**.
- **Lớp `final`:** Không cho phép Lớp khác **kế thừa (extends)** (Ví dụ: Class `String` là final).

---

### 46. Ép kiểu lên (Upcasting) và ép kiểu xuống (Downcasting) khác nhau thế nào?
- **Upcasting:** Ép đối tượng Con thành đối tượng Cha. Trình biên dịch **tự động** làm điều này (An toàn tuyệt đối). VD: `Animal a = new Cat();`
- **Downcasting:** Ép ngược cái biến Cha đã bị upcast về lại dạng Con. Bắt buộc ép thủ công bằng bộ ngoặc `()`. Nếu ép nhầm kiểu sẽ dính lỗi **ClassCastException**. VD: `Cat c = (Cat) a;` (Nên dùng `instanceof` để kiểm tra trước khi ép).

---

### 47. Lớp vô danh (Anonymous Class) là gì? Khi nào nên sử dụng?
- **Khái niệm:** Là một class được khai báo và khởi tạo đối tượng trực tiếp trong một biểu thức, KHÔNG CÓ TÊN CLASS.
- **Khi nào sử dụng:** Dùng 1 LẦN DUY NHẤT ngay tại chỗ muốn triển khai nhanh một Interface hoặc ghi đè một phương thức (như truyền logic tạo sự kiện click nút chuột, hoặc tạo tiêu chí so sánh `Comparator`). *Từ Java 8, ta thường dùng Lambda để thay thế class vô danh cho ngắn gọn.*.

---

### 48. Các loại tập hợp không trùng lặp (Set) phổ biến là gì?
1. **`HashSet`:** Cơ bản nhất, tốc độ thêm/xóa siêu nhanh $O(1)$, nhưng **không giữ nguyên thứ tự** bạn nhét vào.
2. **`LinkedHashSet`:** Giống HashSet nhưng tốn thêm chút bộ nhớ để **giữ đúng thứ tự thêm vào** (nhét a b c in ra đúng a b c).
3. **`TreeSet`:** Chậm hơn $O(\log n)$, do nó **tự động sắp xếp (Sort)** các phần tử tăng dần mỗi khi thêm vào dựa theo giá trị cấu trúc.

---

### 49. `Collection` và `Collections` khác nhau thế nào?
- **`Collection`:** Là một **INTERFACE** đóng vai trò là xương sống cốt lõi bắt đầu cho vương quốc cấu trúc dữ liệu (`List`, `Set`...).
- **`Collections`:** Là một **UTILITY CLASS (Lớp cung cấp công cụ)** chứa đầy các hàm tĩnh (`static`) có sẵn giúp thao tác trên danh sách một cách dễ dàng. (VD: `Collections.sort()`, `Collections.max()`, `Collections.shuffle()`).

---

### 50. Vì sao không nên xóa phần tử trực tiếp khi đang duyệt bằng vòng lặp nâng cao (Enhanced for / foreach)?
Khi dùng `for-each`, Java sử dụng đối tượng mượn `Iterator` ở dướt ngầm để duyệt. Nếu ta chủ động gọi `list.remove()` xóa bớt độ dài bảng, bộ Iterator này không hề biết, dẫn đến sai lệch bộ chỉ mục cấu trúc, quăng ngay lỗi huyền thoại **`ConcurrentModificationException`**.
*Cách giải quyết chuẩn:* Sử dụng vòng `for` chạy index lùi từ dưới lên đầu, hoặc vòng `while` với hàm `iterator.remove()` tường minh.

---

### 51. Lớp trừu tượng (Abstract Class) là gì và dùng để làm gì?
- Là một class có chứa từ khóa `abstract`. Có thể tồn tại các lệnh chưa định nghĩa xong `abstract method` (đẩy trách nhiệm cho lớp con tự định nghĩa).
- Không tự khởi tạo `new()` được trực tiếp.
- **Dùng để:** Làm bộ khung móng (Base class) mạnh mẽ cho các thực thể mang thuộc tính giống nhau, đồng thời vẫn ràng buộc chúng bắt buộc phải triển khai những hành vi đặc trưng còn dang dở.

---

### 52. Sự khác nhau giữa Lớp trừu tượng (Abstract Class) và Giao diện (Interface) là gì?
| Tiêu chí | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Bản chất biến** | Có thể có biến toàn cục, private, protected. | Chỉ có hằng số (`public static final`). |
| **Bản chất hàm** | Chứa cả hàm thường lẫn hàm abstract. | Trước Java 8 chỉ chứa hàm abstract (Java 8 có `default`). |
| **Kế thừa** | Chỉ extends được **1** class. | Có thể implements **NHIỀU** interface. |

---

### 53. Danh sách mảng (`ArrayList`) và mảng truyền thống (`Array`) khác nhau thế nào?
1. Kích thước array cố định. ArrayList co giãn tự động.
2. Array lưu được cả nguyên thủy (int) và đối tượng. ArrayList BẮT BUỘC lưu đối tượng (nên `int` phải gói thành `Integer`).
3. Array có thuộc tính `.length`. ArrayList dùng phương thức `.size()`.

---

### 54. Cách sắp xếp danh sách đối tượng theo nhiều tiêu chí khác nhau?
Truyền một `Comparator` vào hàm `Collections.sort` hoặc danh sách (`list.sort`). Cấu trúc code:
Ví dụ sắp xếp Danh Sách Sinh Viên xếp theo điểm *giảm dần*, nếu điểm bằng nhau xếp theo tuổi *tăng dần*:
```java
Collections.sort(students, new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
        int r = Double.compare(s2.getScore(), s1.getScore()); // giảm
        if (r == 0) r = Integer.compare(s1.getAge(), s2.getAge()); // tăng
        return r;
    }
});
```
Hoặc dùng cú pháp vắn tắt ngầu của Java 8: `list.sort(Comparator.comparing(Student::getScore).reversed().thenComparing(Student::getAge));`

---

### 55. Vì sao phải ghi đè phương thức so sánh nội dung (`equals()`) khi dùng trong tập hợp?
Thư viện tập hợp như `List.contains(Object)` hay `List.remove(Object)` dựa vào hàm `equals()` để dò tìm ra phần tử đó trong ruột. Nếu không override nó, Java sẽ dùng `equals()` của hạng siêu tổ `Object` (chỉ so địa chỉ ô nhớ bằng `==`). Bạn đưa một đối tượng y xì mã nhân viên vào mà địa chỉ RAM khác, Java vẫn bảo "Không thấy - false". Do đó phải Override để chỉ dạy nó so sánh bằng ID/Username!.

---

### 56. Tại sao phải đảm bảo phương thức `equals()` và `hashCode()` nhất quán?
> [!WARNING]
> Quy luật búa tạ của Java: "**Nếu 2 đối tượng `equals()` là TRUE, thì `hashCode()` của chúng PHẢI BẰNG NHAU**".
- Các cấu trúc dạng Hash (`HashSet`, `HashMap`) sẽ luôn gọi băm `hashCode()` đi qua trước để tìm cái xô bộ nhớ cho lẹ.
- Nếu bạn override `equals` mà không override `hashcode`, hai object giống hệt nội dung bị văng ra 2 mã băm khác nhau => Sẽ nằm lọt thỏm ở 2 "xô" khác nhau => Hệ thống đánh giá là 2 vật riêng biệt và nhét trùng vào `HashSet` -> Cấu trúc vỡ trận!

---

### 57. Vai trò của biến tĩnh (`static`) trong lập trình hướng đối tượng là gì?
Dùng để quản lý trạng thái/dữ liệu CỦA TOÀN BỘ CHỦNG LOÀI CLASS ĐÓ, chứ không phải cho một con Object.
Ví dụ đếm xem có bao nhiêu Object Student đã được tạo ra trong game, ta khai báo `static int count = 0;`, mỗi lần trong constructor chạy ta làm lệnh `count++`. Mọi con học sinh chia nhau chung cái biến đếm này!.

---

### 58. Ngăn xếp (Stack) và hàng đợi (Queue) khác nhau thế nào trong ứng dụng thực tế?
- **Stack (LIFO):** Ứng phó sự lùi ngược. Duyệt cây, kiểm tra cú pháp đóng/mở ngoặc `{}`, Undo Ctrl+Z lịch sử duyệt. Cái tới trễ nhất thì ưu tiên dọn đi đầu.
- **Queue (FIFO):** Ứng phó phục vụ dòng chảy công bằng trật tự. Xử lý in ấn mạng (người ra lịnh trước phải in giấy ra trước), bộ nhận Request trong Router web. Hàng lấy sổ phiếu phòng khám.

---

### 59. Khi nào nên dùng tập hợp (Set) thay vì danh sách (List)?
Khi bạn có nhu cầu cốt tử: **LỚP DỮ LIỆU ĐẦU VÀO YÊU CẦU DUY NHẤT LÀ TUYỆT ĐỐI KHÔNG TRÙNG LẶP**. Thay vì phải dùng List và mỗi lần thêm kêu lệnh `if(list.contains())` cực chậm, bạn dùng luôn Set để Java lo việc tự hủy khối trùng lắp hiệu quả với tốc độ siêu thanh.

---

### 60. Khi thiết kế chương trình quản lý đơn giản cần những thành phần chính nào?
Theo mô hình tổ chức chuẩn, ta cần:
1. **Lớp dữ liệu (Model/Entity):** Các class tương tự như `KhangHang`, `SanPham` (chỉ chứa Fields, constructor, getters/setters).
2. **Lớp chứa cấu trúc xử lý (DAO/Repository/Manager):** Danh sách Arraylist và các hàm bọc lõi thêm, sửa, xoá đối tượng, ghi đọc file, DB..
3. **Lớp xử lý hệ thống giao diện/Điều khiển (View/Controller/Main):** Vẽ ra menu nhập `Scanner`, in ra bảng hiển thị tương tác với con người, lấy lệnh chọn gọi đến lớp xử lý.

---
# BỘ ĐÁP ÁN PHỎNG VẤN JAVA - PHẦN III (MỨC ĐỘ KHÓ)
*Dành cho người học muốn hiểu sâu về hoạt động dưới nền (Under the hood) của Java.*

---

### 61. Cơ chế thu gom rác (Garbage Collection - GC) trong Java hoạt động như thế nào?
- GC tự động chạy ở chế độ nền (Background Daemon Thread).
- Nó dọn dẹp bộ nhớ **Heap**. Quá trình chia làm 2 bước chính:
  1. **Mark (Đánh dấu):** GC duyệt qua toàn bộ các đối tượng, kiểm tra xem đối tượng nào còn biến "tham chiếu" (Reference) trỏ tới thì giữ lại. Đối tượng nào mồ côi (Unreachable) sẽ bị đánh dấu chờ xóa.
  2. **Sweep (Quét dọn) & Compact (Dồn mảng):** Xóa các đối tượng vô thừa nhận để thu hồi RAM, sau đó dồn các đối tượng còn sống lại gần nhau để chống phân mảnh bộ nhớ.

---

### 62. Vì sao vẫn có thể xảy ra lỗi tràn bộ nhớ (`OutOfMemoryError`) dù có cơ chế GC?
Bởi vì tình trạng **Rò rỉ bộ nhớ (Memory Leak)**:
- Lập trình viên vô tình **giữ lại tham chiếu** của các đối tượng không còn sử dụng nữa (VD: Lưu các đối tượng nặng vào một biến `static List` toàn cục mà quên `remove()` chúng đi).
- Vì vẫn có người "nắm tay" chúng, GC tưởng rằng chúng vẫn đang xài nên không dám xóa. Lâu dần đầy bộ nhớ Heap dẫn đến sập chương trình.

---

### 63. Sao chép nông (Shallow copy) và sao chép sâu (Deep copy) khác nhau thế nào?
- **Shallow Copy (Nông):** Chỉ copy các giá trị nguyên thủy (int, float) của đối tượng. Với các thuộc tính là một Object con khác, nó **cop luôn cái địa chỉ** (Hai bản sao dùng chung 1 object con).
- **Deep Copy (Sâu):** Copy độc lập hoàn toàn. Bất cứ Object con nào bên trong cũng được tạo `new` và copy đệ quy tới tận cùng. Hai bản sao là 2 cõi không liên quan gì nhau.

---

### 64. Cấu trúc bảng băm (`HashMap`) hoạt động dựa trên nguyên lý gì?
- HashMap lưu trữ dưới dạng mảng các "xô" (Buckets - là một LinkedList hoặc TreeNode).
- **Hoạt động thêm (Put):** Nhận 1 cặp (Key, Value) -> Gọi hàm `Key.hashCode()` để băm ra mã số đặc trưng -> Lấy mã băm chia lấy dư (`%`) cho số lượng giới hạn của bảng để ra một cái index (Thứ tự xô từ 0 - 15) -> Bỏ Value vào xô đó.
- **Hoạt động lấy (Get):** Lấy Key đưa vào hàm băm -> Tìm ra đúng cái xô chứa -> Chui vào xô và gọi hàm `Key.equals()` xét từng thành viên để lấy chính xác món đồ.

---

### 65. Khi hai khóa có cùng vị trí lưu trữ trong bảng băm (Collision) thì xử lý ra sao?
- Hiện tượng này gọi là Đụng độ Hash (Hash Collision). Hai Key khác nhau nhưng sau khi qua thuật toán lại rơi vào _cùng một xô_ (Cùng index).
- **Cách xử lý:** Java sẽ móc các phần tử đụng độ lại với nhau thành một xâu chuỗi (LinkedList) trong cái xô đó. Từ Java 8, nếu LinkedList dài hơn 8 phần tử, nó sẽ tự lột xác biến thành **Cây đỏ đen (Red-Black Tree)** để đảm bảo tốc độ dò tìm nhanh hơn (O(log n) thay vì O(n)).

---

### 66. Vì sao chuỗi ký tự (`String`) trong Java được thiết kế không thay đổi (Immutable)?
1. **Thread-safe (An toàn luồng):** Vì không thể sửa, nên 1 tỷ luồng đọc chung 1 String vẫn an toàn, không cần Khóa (Lock).
2. **String Pool Caching:** Để tiết kiệm RAM. Nếu bạn gán `String a = "hello"` và `String b = "hello"`, Java cho `b` trỏ thẳng vào chỗ của `a` (Không cần tạo mới). Nếu cho phép `a` sửa chữ "hello" thành chữ khác thì `b` lãnh đủ.
3. **Bảo mật & Cấu trúc:** String hay làm chìa khóa (Key) cho HashMap, cấu hình Database. Nếu dễ dàng sửa được địa chỉ sẽ rất nguy hiểm.

---

### 67. Sự khác nhau giữa tập hợp có thứ tự thêm vào (`LinkedHashSet`) và tập hợp tự sắp xếp (`TreeSet`)?
- `LinkedHashSet`: Ghi chú lại **thứ tự thời gian** bạn bỏ đồ vào. Bạn bỏ vào là A - C - B, chạy vòng lặp in ra đúng y là A - C - B.
- `TreeSet`: Chuyên gia **Tự động Sort** theo thứ bậc giá trị. Bạn bỏ vào A - C - B, nhưng lúc in nó tự xếp vần ABC in ra là A - B - C (dựa trên thuật toán của bản thân đồ vật). Tốn nhiều bộ nhớ để duy trì bộ máy tự phân loại này.

---

### 68. Cơ chế phát hiện thay đổi cấu trúc tập hợp khi đang duyệt (Fail-Fast) hoạt động thế nào?
Các thư viện Collections của Java đều lưu một biến ẩn là `modCount` (Đếm số lần bị chỉnh sửa thêm/xóa).
Khi lặp `Iterator` hoặc `For-each`, biến mượn này sẽ chốt giữ số `modCount` lúc bắt đầu. Từng bước đi, nếu nó phát hiện cấu trúc gốc bị xóa mất 1 phần tử lén lút (làm `modCount` của bản gốc tăng lên khác biến chuẩn ban đầu), Iterator sẽ nổi điên văng lỗi `ConcurrentModificationException` chửi bạn và bắt dừng ngay lập tức để tránh lỗi.

---

### 69. So sánh địa chỉ (Reference) và so sánh nội dung (Value) khác nhau thế nào trong bộ nhớ?
- **So sánh địa chỉ (`==`):** Là hành động đối chiếu dãy số thập lục phân lưu vùng nhớ RAM của 2 cái phễu (Biến đối tượng ngầm). Cực kỳ xài trong Java với Đối Tượng vì bạn chốt 2 anh em sinh đôi là khác nhau dù mặt mũi y chang 100%.
- **So sánh nội dung (`equals`):** Là hành động mở phẫu thuật ổ bụng 2 con Object ra, lấy từng tế bào biến bên trong so sánh ngang bằng với nhau (Chuẩn của Object do Lão tướng coder xác lập).

---

### 70. Khối lệnh tĩnh (`static block`) dùng để làm gì và khi nào được thực thi?
- **Dùng để:** Khởi tạo các giá trị cho các biến `static` phức tạp (Cần vòng lặp, chạy nhiều dòng tính toán) của Class trước khi vào trận.
- **Thực thi:** Chạy duy nhất MỘT LẦN KHI CLASS ĐÓ ĐƯỢC LOAD LÊN BỘ NHỚ KHÔNG GIAN BỞI CLASSLOADER (Thậm chí trước cả khi tạo Object hay chạy hàm `main` bên trong nó).

---

### 71. Phương thức trừu tượng (Abstract) và phương thức mặc định (Default) trong giao diện khác nhau thế nào?
- **Abstract method:** Là hàm Giao 100% trách nhiệm cho thằng Con triển khai (Chỉ có tên, không thân ruột).
- **Default method:** (Ra đời từ JAVA 8). Thêm thân logic vào Interface. Nó cung cấp bản vá miễn phí với thân ruột sẵn, hòng giúp nâng cấp Interface của hệ thống cũ nhưng **KHÔNG PHÁ VỠ HỢP ĐỒNG** những thằng cũ không bị lỗi khi thiếu Code triển khai mới này.

---

### 72. Đa hình khi chạy chương trình (Runtime Polymorphism) được thực hiện dựa trên nguyên tắc nào?
Dựa trên nguyên lý **Upcasting** và **Ghi đè (Overriding)**.
Java sử dụng cơ chế Dynamic Method Dispatch (Tra cứu con trỏ bảng hàm ảo - VTable). Trình biên dịch tin vào kiểu Khai Trú, nhưng JVM lúc chạy sẽ dò ngược bằng cách check Típ Kiểu của đối tượng khởi tạo thực tế trên Heap lúc đó là loại nào, rồi mò đến Method bị Override mới nhất của nó và Fire Lệnh!.

---

### 73. Vì sao hàm khởi tạo (Constructor) không được ghi đè (Override)?
OVERRIDE LÀ HÀNH ĐỘNG CỦA LỚP CON. Nhưng một thằng Con khi làm phép `new Con()` nó còn gọi luôn cả bộ móng `super()` của cha nó xuống nằm chung để định hình. Constructor có tên CHÌM DÍNH CHẶT vào Tên Lớp, Class hai thằng tên khác nhau thì làm sao Ghi đè cấu trúc trùng tên hàm? Do đó, Constructor chỉ có thể Gọi thay vì Override.

---

### 74. Lớp bên trong (Inner class) và lớp lồng tĩnh (Static Nested Class) khác nhau thế nào?
- **Inner Class:** Nằm ngoẹo trong lòng Lớp Ngoài, PHỤ THUỘC SỐNG CHẾT vào thằng cha. Nó được quyền chõi vào các bộ ngực biến `private` của thằng lồng ngoài tĩnh.
- **Static Nested Class:** Giống như một cái nhà rỗng vứt trong sân Lớp Ngoài để gom nhóm tổ hợp Code lại, Không dính líu đến Sinh Khí của đối tượng lớp Ngoài (Không truy cập biến instance). Khởi tạo không cần new Lớp ngoài trước.

---

### 75. So sánh hiệu năng giữa `ArrayList` và `LinkedList` khi thêm ở ĐẦU?
- `ArrayList`: **Vô cùng thảm mốc.** Mảng mất $O(N)$ vì nó ép phải di chuyển (Shift) toàn thể các anh em trong chuỗi lùi văng lại bên Phải 1 nấc thì mới đút thằng mới vào đỉnh 0 được.
- `LinkedList`: **Siêu việt thần tốc.** Cấu trúc móc nối chỉ mất $O(1)$ chằng lại đúng 1 nút đứt giữa 2 cái neo, xong ngay tắp lự.

---

### 76. Phân biệt lỗi bắt buộc xử lý (Checked Exception) và lỗi không bắt buộc (Unchecked Exception)?
- **Checked (Phải bắt):** (`IOException`, `SQLException`). Compiler gào thét báo đỏ nếu bạn không `try-catch` hoặc `throws`. Xảy ra do ngoại cảnh (File hỏng, Rớt mạng). Ép bạn phải chuẩn bị lối thoát.
- **Unchecked (Không cản):** (`NullPointerException`, `ArithmeticException`). Xảy ra trong lúc chạy do sự ngu ngốc logic Coding của lập trình viên (Truy cập null, chia cho 0). Trình biên dịch lười không ép bắt.

---

### 77. Khối lệnh luôn được thực hiện sau xử lý lỗi (`finally`) có đặc điểm gì?
- Đặc điểm: **Bất tử**. Dù khối `try` lỗi hay không, dù bị dính `return`, hay quăng lỗi tơi bời, dòng mã kẹp vào `finally` vẫn LUÔN LUÔN được kích hoạt.
- Tuyệt kỹ: Áp dụng đóng cổng cơ sở Dữ Liệu Socket (Dọn dẹp Resource rào chắn). (Trừ duy nhất Lệnh triệu hồi tử thần `System.exit(0)` là phá khóa thoát ngay).

---

### 78. Khi lập trình nhiều luồng có thể gặp những vấn đề gì?
1. **Race Condition (Cạnh tranh luồng):** Hai luồng tranh nhau chọt cập nhật 1 biến, đè nhau nát data gốc.
2. **Deadlock (Bế tắc - Chết kẹt):** Luồng A nằm giữ Tài Nguyên 1 chờ giật Tài Nguyên 2. Luồng B nắm giữ Tài Nguyên 2 chờ giật 1. 2 anh em đứng ôm nhau khóc tới lúc ngắt cầu dao.
3. **Starvation (Bị bỏ đói):** Luồng bé thân phận kém ưu tiên hóng mãi luồng VIP chạy hoài không tới lượt.

---

### 79. Cơ chế đồng bộ hóa (Synchronization) có tác dụng gì trong lập trình đa luồng?
Bảo chứng ngai vàng bằng CHÌA KHÓA (`lock/monitor`). Khi một hàm được dán bảng `synchronized`, nó bắt các tiểu đồng luồng phải XẾP HÀNG TUẦN TỰ. Lúc 1 thằng chạy thì cài chốt, làm xong thả chốt mới cho thằng mớ nhào zô. Tuyệt đối bóp chết lỗi Cạnh trang dữ liệu ở câu 78 (Nhưng khiến Tool chậm lại kinh niên).

---

### 80. Vì sao không nên tạo quá nhiều luồng thủ công (`new Thread()`)?
Khởi tạo 1 luồng rất bự tốn RAM để tạo bảng cấp phát Thread trong OS. Chỗ chứa có hạn.
Cách giải là sử dụng **Bể Luồng (Thread Pool - `ExecutorService`)**. Java sẽ duy trì sẵn 1 đội quân 10 luồng luân phiên nhau "Bảo bọc" 100 tác vụ đút vào chạy. Xong nó về tắm rửa ngủ lấy sức làm việc khác, không vứt giết tiêu phung phí!.

---

### 81. Lợi ích của đối tượng không thay đổi dữ liệu (Immutable Object) là gì?
Tuyệt đỉnh cao thủ đa luồng. Bản thân `String` là một gã bất biến. Bởi vì **ĐÓNG BĂNG ĐÚC CHUẨN**, nhiều luồng cùng đọc sẽ không bao giờ sợ nhau ghi đè dẫn tới sai nhịp dữ liệu => Miễn nhiễm với Race Condition. Code ít bug. Cực chuẩn để làm Khóa HashTable.

---

### 82. Cơ chế sắp xếp tự nhiên (`Comparable`) và sắp xếp tùy chỉnh (`Comparator`) khác nhau thế nào?
- **Comparable:** Dòng máu tự sinh tự dưỡng. Đối tượng sinh ra ĐÃ CÓ MÃ GEN xếp theo 1 bậc trật tự mặc định duy nhất do Lập trình viên thiết kế vào class đấy (Vd Tiền tệ luôn xếp theo đồng USD). Override hàm `compareTo(Obj)`.
- **Comparator:** Bên giám định trung gian. Viết một bộ đồ riêng cắm ngoài so sánh đa cực. Thích sắp xếp theo Năm trước rồi Phút sau, hay Dài hay Ngắn thoải mái viết N Class (Vd. Xếp the Age rồi mới the Size). Override hàm `compare(Obj1, Obj2)`.

---

### 83. Vì sao phải đảm bảo tính nhất quán giữa so sánh nội dung (`equals`) và mã băm (`hashCode`)?
Nếu bạn bảo A với B là 2 anh em ruột (bằng Object nội hàm `equals`), nhưng bộ băm lẩy B ra mã ID dỏm ném vào Mảng cấu trúc `HashMap`. Khí sau này lấy đồ, Java xài móng Vuốt băm lấy chĩa tìm trước, dính ID dỏm thế là nó kết luận "Tao không thấy!". Bạn cất vào rương nhưng vô vọng khi móc ra vì Khóa mã thay chìa!. Vì vậy phải đi bài tay trong (Hai bằng thì Hash cũng y khuôn!).

---

### 84. Cấu trúc cây tự cân bằng (Balanced Tree) có đặc điểm gì?
Vũ khí của `TreeSet` và `TreeMap`. Nó thường sử dụng cấu trúc Red-Black Tree. 
Mỗi khi thêm một Cành Trái Cành Phải vào cây, nó tự quay tự đếm Độ lệch của Cây không được vượt quá số 1 để tránh việc Đóng rễ sâu quánh thành 1 đường dài Linkedlist 1 chiều. Từ đó đảm báo độ cao cây tối ưu tuyệt mỹ.

---

### 85. Độ phức tạp tìm kiếm trong cấu trúc cây cân bằng gần đúng bao nhiêu?
Vì luôn nắn chỉnh bản thân, tìm một món đồ trong Cây chỉ mất tốc độ O($\log N$). Tương đương phép chặt nhị phân - Tra Cứu Số Điện thoái cực khủng (1 Triệu phần tử chỉ tối đa mất chưa tới 20 lần vạch lá là tìm thấy).

---

### 86. Lợi ích của việc thiết kế chương trình dựa trên "hợp đồng chung" (Program to Interface) thay vì lớp cụ thể?
Phá sự cùm xích chặt (Loose Coupling). Nếu bạn bắt một hàm trói nhận vào `ArrayList()`, nhỡ ngày mai sếp yêu cầu đổi code để tối ưu tốc độ xài `LinkedList()` thì code vỡ trận phải viết lại hàng trăm chỗ. Bằng cách kêu gọi Interface `List<>` để đón lỏng đầu vào, lúc nào mệt Mặc xác Hệ gọi ném Thằng lính cụ thế nào Interface đó cũng cân tất tần tật => Hệ thống vững như bàn thạch khi đồi quy trình!

---

### 87. Khi nào nên sử dụng biến chung của lớp (`static`) thay vì biến riêng của đối tượng (`instance`)?
Sài khi thông tin đó KHÔNG CÓ Ý NGHĨA đặc tính riêng của cái Cụ Thể, mà CỦA TỔNG QUAN.
(Vd Số lượng thú trong lồng, Mức Lãi Suất chung của Toàn Thể các Khách Hàng gửi ở Trái đất).
Hoặc định danh HẰNG SỐ CHUNG để lấy cho nhanh `static final IN_HOA`. Tránh cấp RAM 1 tỷ lần cho 1 biến đồ vô tri giống nhau đúc lót!.

---

### 88. Phân biệt phương thức của lớp (Thường) và phương thức của đối tượng (Thiếu chữ)?
- **Trừu tượng ở Phương thức Tĩnh (`static()`)**: Nó là hành vi Phủ định của Lớp Cha, Nằm yên đó chờ Mệnh của Nền Lớp, KHÔNG SỬ DỤNG THÔNG TIN MÁU THỊT (Biến non-static). Triệu gọi trực tiếp theo tên Class. (Vd: `Math.pow()`).
- **Phương Thức Đối Tượng(Non-static)**: Hành vi cụ thể của con vật đó! Truyền tin vào cái bụng thịt CỦA CHÍNH NÓ! Gọi bằng Dấu `.`.

---

### 89. Khi nào nên sử dụng lớp trừu tượng (Abstract class) thay vì giao diện (Interface)?
Dùng Abstract như 1 Thằng Bố Khủng khiếp che trời, muốn ném Bộ Mã code có cốt Truyền Thế (có cái thân Hàm hoàn thiện 50%) cắm biến vào để tất cả các Lớp cấp con tận dụng xài chung cho Nhàn.
Interface chỉ làm trò Ký Mõm, éo cho tí Code cốt thịt nào để xài lại (Trừ đồ Default lẻ tẻ vặt vãnh sau Java 8).

---

### 90. Khi thiết kế dự án có nhiều chức năng thêm, sửa, xóa, tìm kiếm (CRUD) cần chú ý điều gì về cấu trúc chương trình?
TUYỆT ĐỐI TUÂN THỦ MÔ HÌNH GHÉP LỚP (Ví dụ: MVC, 3-Tier Arc):
- Giữ cái Controller (Bộ Não Lấy Lệnh) thật Gầy, Nhỏ. Láy rác và Đập Nhập thôi.
- Dồn sức đẩy Xử Lý Kinh Tế (Logic Check Trùng Tên, Trừ Tiền Hư..) vào Lớp Service (Bộ Đồ lòng Kinh Doanh).
- Lớp Cặn kho (Repository/ DAO) CHỈ ĐƯỢC CHỨA SQL CRUD Database Ném qua ném Lại. Đéo được tính toán if-else ở Lớp Này!! 
Chia nhỏ cắt khoanh để sau dể bảo trì. Râu ông nọ vắt vào cằm bà kia!
{
  "artifactType":  "ARTIFACT_TYPE_OTHER",
  "summary":  "Giải đáp chi tiết phần 3 (Mức độ Khó, câu 61-90) của bộ câu hỏi phỏng vấn Java. Nội dung tập trung vào hệ thống, đa luồng, thu gom rác, HashMap, cấu trúc dữ liệu nâng cao và kiến trúc thiết kế.",
  "updatedAt":  "2026-03-03T12:49:05.823636Z"
}# BỘ ĐÁP ÁN PHỎNG VẤN JAVA - PHẦN III (MỨC ĐỘ KHÓ)
*Dành cho người học muốn hiểu sâu về hoạt động dưới nền (Under the hood) của Java.*


# PHẦN I – MỨC ĐỘ CƠ BẢN (1–30)

---

## 1. JDK – JRE – JVM

- **JVM:** Chạy bytecode (.class)
- **JRE = JVM + Libraries**
- **JDK = JRE + Tools (javac, javadoc, jdb...)**

👉 Quan hệ bao hàm: `JDK ⊃ JRE ⊃ JVM`

---

## 2. 8 Kiểu dữ liệu nguyên thủy

| Nhóm | Kiểu | Kích thước | Default |
|------|------|------------|----------|
| Số nguyên | byte | 1 byte | 0 |
| | short | 2 bytes | 0 |
| | int | 4 bytes | 0 |
| | long | 8 bytes | 0L |
| Số thực | float | 4 bytes | 0.0f |
| | double | 8 bytes | 0.0d |
| Ký tự | char | 2 bytes | '\u0000' |
| Luận lý | boolean | JVM quyết định | false |

---

## 3. `==` vs `equals()`

- `==` → So sánh địa chỉ
- `equals()` → So sánh nội dung

👉 So sánh String luôn dùng `equals()`

---

## 4–7. Vòng lặp & Mảng

- `for` → biết trước số lần
- `while` → kiểm tra trước
- `do-while` → chạy ít nhất 1 lần
- Mảng có kích thước cố định
- `int[] arr = new int[10];` → mặc định 0

---

## 8. Java truyền tham trị

- Primitive → copy giá trị
- Object → copy địa chỉ tham chiếu

---

## 9. String là Immutable

Lý do:
- Thread-safe
- Tối ưu String Pool
- Bảo mật

---

## 10. 4 tính chất OOP

- Abstraction
- Polymorphism
- Inheritance
- Encapsulation

---

## 11–20. OOP cơ bản

- Class vs Object
- Constructor
- `this`
- Access modifier
- Getter/Setter
- static vs instance
- package
- interface
- compile vs runtime error
- `static final` hằng số

---

## 21–30. Các kiến thức nền tảng

- Scanner & trôi lệnh
- Toán tử %
- break trong switch
- Toán tử ba ngôi
- Biến local không có default
- void vẫn return được
- length vs length()
- Mảng 2 chiều = mảng của mảng
- print vs println
- Khi dùng if-else vs switch

---

# PHẦN II – MỨC ĐỘ TRUNG BÌNH (31–60)

---

## 31. Bộ nhớ Java

- Stack → biến local
- Heap → object
- Metaspace → class, static

---

## 32–35. Kế thừa & Đa hình

- `extends`
- `super`
- Overloading vs Overriding
- Abstract vs Interface
- Runtime Polymorphism

---

## 36–44. Collection Framework

- List / Set / Queue
- ArrayList vs LinkedList
- Map & entrySet
- Generic
- StringBuilder vs StringBuffer
- Comparable vs Comparator
- Stack (LIFO)
- Queue (FIFO)

---

## 45–60. Các nguyên lý quan trọng

- final
- Upcasting / Downcasting
- Anonymous class
- HashSet / TreeSet
- Collection vs Collections
- ConcurrentModificationException
- equals & hashCode
- static dùng khi nào
- MVC cơ bản
- Khi nào dùng Set thay vì List

---

# PHẦN III – MỨC ĐỘ NÂNG CAO (61–90)

---

## 61–66. Garbage Collection & String

- Mark & Sweep
- Memory Leak
- Shallow vs Deep Copy
- HashMap hoạt động
- Collision & Red-Black Tree
- Vì sao String immutable

---

## 67–75. Cấu trúc dữ liệu & Class

- LinkedHashSet vs TreeSet
- Fail-fast
- static block
- Default method
- Constructor không override
- Inner class vs Static nested
- Hiệu năng ArrayList vs LinkedList

---

## 76–83. Exception & Hash

- Checked vs Unchecked
- finally luôn chạy
- Race condition / Deadlock
- synchronized
- Thread Pool
- Immutable object
- equals & hashCode nhất quán

---

## 84–90. Kiến trúc & Thiết kế

- Balanced Tree O(log n)
- Program to Interface
- Khi dùng static
- static method vs instance method
- Khi dùng Abstract class
- Thiết kế CRUD theo MVC / 3-Tier

