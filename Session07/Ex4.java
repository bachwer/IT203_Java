package Session07;

public class Ex4 {
    public static void main(String[] args) {
        ClassRoom_04 SV01 = new ClassRoom_04("Bach");
        ClassRoom_04 SV02 = new ClassRoom_04("An");
        ClassRoom_04 SV03 = new ClassRoom_04("Duc");

        SV01.PayIntoFund(20000);
        SV02.PayIntoFund(25000);
        SV03.PayIntoFund(21000);

        ClassRoom_04.SeeFund();

    }

}
