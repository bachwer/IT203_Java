package Session06;

public class Ex3 {
    public static void main(String[] args) {
        Product_Ex3 P1 = new Product_Ex3("Banh MI", "BM-01");
        Product_Ex3 P2 = new Product_Ex3("Gao", "G-02");
        Product_Ex3 P3 = new Product_Ex3("Banh Chung", "BC-03");

        P1.setPrice(10000);
        P2.setPrice(25000);
        P3.setPrice(30000);


        P1.getProductCode();
        P1.getNameProduct();

        P2.getProductCode();
        P2.getNameProduct();

        P3.getProductCode();
        P3.getNameProduct();



        P1.showInfor();
        P2.showInfor();
        P3.showInfor();



    }
}
