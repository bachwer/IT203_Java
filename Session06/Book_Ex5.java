package Session06;

public class Book_Ex5 {
    private String Book_id;
    private String Name;
    private double price;


    public Book_Ex5(String id, String Name, double Price) {
        this.Book_id =id;
        this.Name =Name;
        this.price =Price;
    }

    public void  showInfor(){
        System.out.println("====================");
        System.out.println(this.Book_id);
        System.out.println(this.Name);
        System.out.println(this.price);
    }
}
