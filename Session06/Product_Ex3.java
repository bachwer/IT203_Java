package Session06;

public class Product_Ex3 {
    private final String ProductName;
    private final String ProductCode;
    private double Price;

    public Product_Ex3(String name, String code ){
        this.ProductName = name;
        this.ProductCode = code;
        this.Price = 0;
    }

    public void getProductCode(){
        System.out.println("ProductCode: " + ProductCode);
    }
    public void getNameProduct(){
        System.out.println("ProductName: " + ProductName);
    }

    public void setPrice(double price){
        if(price < 1){
            System.out.println("invalid Price");
            return;
        }

        this.Price = price;

        System.out.println("Success!");
    }

    public void showInfor(){
        System.out.println("--------------------------------------");
        System.out.println("Product Code: " + this.ProductCode);
        System.out.println("Product Name: " + this.ProductName);
        System.out.println("Product Price: " + this.Price);
    }
}


