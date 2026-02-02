package Session07;

public class Ex2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        Students_01 s1 = new Students_01("SV01", "An");
        Students_01 s2 = s1;

        s2.studentName = "Bình";

        System.out.println("Tên s1: " + s1.studentName);
        System.out.println("Tên s2: " + s2.studentName);

//  s2 = s1 → copy địa chỉ
//	s1 và s2 trỏ cùng 1 object
//	Thay đổi qua s2 → s1 cũng thay đổi

    }

}
