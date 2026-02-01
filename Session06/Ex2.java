package Session06;

public class Ex2 {
    public static void main(String[] args) {
        Account_Ex2 Ac1 = new Account_Ex2("Nguyen Van Be", "HelloB", "bebonguyen@gmail.com");
        Account_Ex2 Ac2 = new Account_Ex2("Nguyen Van C", "HelloC", "bebonguasn@gmail.com");


        Ac1.showInformation();
        Ac2.showInformation();

        Ac1.ChangePass("HelloB","123456" );


    }
}
