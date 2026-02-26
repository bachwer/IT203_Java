package Session13.Ex06;

import java.util.*;

public class Main {


    static List<Medicine> medicineList =  new ArrayList<>();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {


        String choice = "";


        do{

            menu();
            choice = input.nextLine();

            switch (choice) {
                case "1":
                    addDrug();
                    break;
                case "2":
                    updateQuantity();
                    break;
                case "3":
                    DeleteDrug();
                    break;
                case "4":
                    printBill();
                    break;
                case "5":
                    FindCheapMedicine();
                    break;
                case "6":
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }


        }while(!choice.equals("6"));
    }

    static void menu(){

        System.out.println("""
        ||===================MENU=================||
        ||      1. Thêm Thuốc vào đơn             ||
        ||      2. Điều chỉnh số lượng            ||
        ||      3. Xoá Thuốc                      ||
        ||      4. In Hoá Đơn.                    ||
        ||      5. Tìm thuốc Giá rẻ               ||
        ||      6. Thoát                          ||
        ||========================================||
                Nhập Lựa Chọn:
        """);
    }


    static void addDrug(){

        System.out.println("Nhập Mã thuốc: ");
        String id = input.nextLine();
        System.out.println("Nhập tên Thuốc: ");
        String name = input.nextLine();
        System.out.println("Nhập Số Lượng");
        int quan = input.nextInt();
        System.out.println("Nhập Giá Thuốc");
        double price = input.nextDouble();
        input.nextLine();

        medicineList.add(new Medicine(id, name,price, quan));
        System.out.println("Thêm Thành công !!");



    }
    static void updateQuantity(){

        System.out.print("Nhập Mã thuốc: ");
        String id = input.nextLine();


        for(Medicine m :  medicineList){
            if(m.getDrugId().equals(id)){

                System.out.print("Nhập số lượng mới: ");
                int n = input.nextInt();
                input.nextLine();

                if(n > 0){
                    m.setQuantity(n);
                    System.out.println("Update Số Lượng Thành Công!");
                }else{
                    System.out.println("Invalid !");
                }

                return;
            }
        }
        System.out.println("Thuốc không tồn tại trong đơn !!");

    }


    static void DeleteDrug(){
        System.out.print("Nhập Id Cần xoá thuốc: ");
        String id = input.nextLine();

        if(!delete(id)){
            System.out.println("Không tim thấy Id thuốc !");
        }else{
            System.out.println("Đã Xoá Thành Công !");
        }


    }

    static boolean delete(String id){
        Iterator<Medicine> iterator = medicineList.iterator();
        while(iterator.hasNext()){
            Medicine m =  iterator.next();
            if(m.getDrugId().equals(id)){
                iterator.remove();

                return true;
            }
        }
        return false;
    }




    static void printBill(){
        System.out.println("=== Bill ===");
        System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Price", "Quantity");
        double total = 0;

        for(Medicine m : medicineList){
            String id = m.getDrugId();
            String name = m.getDrugName();
            double price = m.getUnitPrice();
            int quan = m.getQuantity();

            total += price * quan;

            System.out.printf("%-10s %-15s %-10.2f %-10d\n", id, name, price, quan);
        }

        System.out.println("Tổng Bill: " + total);
    }
    static void FindCheapMedicine(){

        System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Price", "Quantity");

        for(Medicine m : medicineList){
            String id = m.getDrugId();
            String name = m.getDrugName();
            double price = m.getUnitPrice();
            int quan = m.getQuantity();

            if(price < 50000){
                System.out.printf("%-10s %-15s %-10.2f %-10d\n", id, name, price, quan);
            }
        }
    }




}













