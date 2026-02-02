package Session07;

public class Ex1 {
    public static void main(String[] args) {
        Students_01 SV01 = new Students_01("SV01", "Nguyen Van A");
        Students_01 SV02 = new Students_01("SV01", "Nguyen Van A");

        SV01.displayInfo();
        SV02.displayInfo();

        Students_01.displayTotalStudent();


    }
}

